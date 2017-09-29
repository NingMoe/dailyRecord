#!/bin/sh
HOSTNAME="127.0.0.1"
PORT="3306"
USERNAME="mapping"
PASSWORD="pam@mogu"
DBNAME="mapping"
TABLENAME="requestTimesLog"
use_db_sql="use ${DBNAME}"
mysql -h${HOSTNAME} -P${PORT} -u${USERNAME} -p${PASSWORD} -e "${use_db_sql}"
#get the data
requestKeyArr=("Tavisca110|GetHotelSearchResult" "Tavisca110|GetSingleHotelData" "Tavisca110|GetMultiHotelsData" \
"Tavisca100|GetHotelSearchResult" "Tavisca100|GetSingleHotelData" "Tavisca100|GetMultiHotelsData")
echo "统计开始时间：$(date '+%Y-%m-%d %H:%M:%S')"
for str in ${requestKeyArr[@]};do
        content=$(mktemp /tmp/tmp.XXXXXXXXXX) || exit 1
	echo "" > content
  	grep $str ../log/stdout.log  > content
	lines=`cat content | wc -l`
        if [ $lines -gt 0 ];then
		supplierid=`echo ${str} | cut -d ':' -f 1`
  		serviceName=`echo ${str} |cut -d ':' -f 2`
		insert_sql="insert into ${TABLENAME}(requestSupplierId,requestUrl,count) values('${supplierid}','${serviceName}',${lines})"
	        mysql -h${HOSTNAME} -P${PORT} -u${USERNAME} -p${PASSWORD} ${DBNAME} -e "${insert_sql}"
	fi
done
echo "统计结束时间：$(date '+%Y-%m-%d %H:%M:%S')"
