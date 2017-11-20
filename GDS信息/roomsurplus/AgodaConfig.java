package agoda;

import cn.mogutrip.hotel.booking.supplier.entity.Supplier;

/**
 * Created by Administrator on 2017/11/17.
 */
public class AgodaConfig {
    public static Supplier getSupplier() {
        Supplier supplier = new Supplier();
        supplier.setSupplierId("agoda");
        supplier.setUserId("1788333");
        supplier.setPassword("065AC877-50B5-42B0-A4E0-15A6029F01C5");
        supplier.setOprMobile("98789889");
        supplier.setOprName("Mogu trip");
        supplier.setBookingUrl("https://sandbox-affiliateapi.agoda.com/xmlpartner/xmlbookservice/book_v3");
        supplier.setQueryBookingUrl("'https://sandbox-affiliateapisecure.agoda.com/xmlpartner/xmlbookservice/booklist_v2'");
        supplier.setCancelBookingUrl("https://sandbox-affiliateapisecure.agoda.com/xmlpartner/xmlbookservice/cancel_service");
        supplier.setPayBookingUrl("https://sandbox-affiliateapisecure.agoda.com/xmlpartner/xmlbookservice/confirmcancel_service");
        return supplier;
    }

    public static String getHotelBookingDto() {
        return "{\n" +
                "  \"queryId\": \"531b65b746fd3588397948684c50ed11\",\n" +
                "  \"order\": {\n" +
                "    \"sign\": null,\n" +
                "    \"orderIdStr\": \"171113174214681128\",\n" +
                "    \"orderStatusCN\": \"待支付\",\n" +
                "    \"customerPayStatusCN\": \"未出帐单\",\n" +
                "    \"supplierPayStatusCN\": \"\",\n" +
                "    \"supplierXml\": null,\n" +
                "    \"orderPrice\": {\n" +
                "      \"id\": null,\n" +
                "      \"orderId\": 171113174214681128,\n" +
                "      \"companyCurrency\": \"USD\",\n" +
                "      \"costPrice\": 1448.00,\n" +
                "      \"salePrice\": 1513.20,\n" +
                "      \"searchNetPrice\": 1448.00,\n" +
                "      \"bookingNetPrice\": null,\n" +
                "      \"supplierCurrency\": \"USD\",\n" +
                "      \"supplierOperationFee\": null,\n" +
                "      \"supplierOperationCurrencyCode\": null,\n" +
                "      \"customerOperationFee\": null,\n" +
                "      \"markup\": 4.500,\n" +
                "      \"exchangeRateToRmb\": 6.907300,\n" +
                "      \"exchangeRateToCustomer\": 1.000000,\n" +
                "      \"rmbReferencePrice\": 10452.13,\n" +
                "      \"salePriceToRmb\": null,\n" +
                "      \"profitToRmb\": null,\n" +
                "      \"finalSalePrice\": 10452.13,\n" +
                "      \"finalProfitPrice\": null,\n" +
                "      \"amountChange\": null,\n" +
                "      \"bookingSupplierCurrency\": null,\n" +
                "      \"updateTime\": null,\n" +
                "      \"updater\": null,\n" +
                "      \"createTime\": null,\n" +
                "      \"creator\": null,\n" +
                "      \"bookingSalePrice\": 1513.20,\n" +
                "      \"supplierOperationFeeWithMarkup\": null,\n" +
                "      \"customerOperationFeeCost\": null,\n" +
                "      \"modifyGdsCostPrice\": null,\n" +
                "      \"modifyGdsSalePrice\": null,\n" +
                "      \"modifyCostPrice\": null,\n" +
                "      \"modifySalePrice\": null,\n" +
                "      \"preModifySalePrice\": null,\n" +
                "      \"gdsPriceToRmb\": null,\n" +
                "      \"finalCostPrice\": null,\n" +
                "      \"finalGdsSalePrice\": null,\n" +
                "      \"finalGdsCostPrice\": null,\n" +
                "      \"exchangeRateToRmbBilling\": null,\n" +
                "      \"hasPaidAmount\": 0,\n" +
                "      \"surplusPaidAmount\": 10452.13,\n" +
                "      \"refundChargeIds\": null,\n" +
                "      \"refundChargeAmount\": null\n" +
                "    },\n" +
                "    \"policyList\": null,\n" +
                "    \"hotelRoomList\": null,\n" +
                "    \"travellerList\": null,\n" +
                "    \"promotionList\": null,\n" +
                "    \"operator\": \"yang zhaopeng\",\n" +
                "    \"operatorMobile\": \"18612820989\",\n" +
                "    \"operatorEmail\": \"23798632@qq.com\",\n" +
                "    \"id\": null,\n" +
                "    \"orderId\": 171113174214681128,\n" +
                "    \"parentOrderId\": null,\n" +
                "    \"orderStatus\": 100,\n" +
                "    \"orderSubStatus\": null,\n" +
                "    \"orderType\": 0,\n" +
                "    \"companyId\": 3412128,\n" +
                "    \"companyGroupCode\": \"\",\n" +
                "    \"userId\": 1557,\n" +
                "    \"supplierId\": \"agoda\",\n" +
                "    \"referenceCode\": null,\n" +
                "    \"voucherReferenceCode\": null,\n" +
                "    \"thirdPartySupplierName\": null,\n" +
                "    \"thirdPartySupplierCode\": null,\n" +
                "    \"countryCode\": \"CN\",\n" +
                "    \"processCode\": null,\n" +
                "    \"optionDate\": 1513699199000,\n" +
                "    \"checkIn\": 1513699200000,\n" +
                "    \"checkOut\": 1513872000000,\n" +
                "    \"duration\": 2,\n" +
                "    \"adultQuantity\": 3,\n" +
                "    \"childrenQuantity\": 0,\n" +
                "    \"paymentId\": 5062,\n" +
                "    \"bookingPaymentId\": 5062,\n" +
                "    \"travellerId\": 10894,\n" +
                "    \"responseText\": null,\n" +
                "    \"errorInfo\": null,\n" +
                "    \"remark\": \"\",\n" +
                "    \"billDate\": null,\n" +
                "    \"billPayDate\": null,\n" +
                "    \"bookingDate\": 1510566134938,\n" +
                "    \"mealDescription\": \"\",\n" +
                "    \"mealCode\": \"1\",\n" +
                "    \"userName\": \"agoda\",\n" +
                "    \"cityName\": \"伦敦\",\n" +
                "    \"countryName\": \"英国\",\n" +
                "    \"xOptionDate\": 1513526399000,\n" +
                "    \"travellerCountryCode\": \"CN\",\n" +
                "    \"cancelLationReference\": null,\n" +
                "    \"roomNum\": 2,\n" +
                "    \"companyNo\": \"agoda\",\n" +
                "    \"houseTypeSummary\": \"\",\n" +
                "    \"doubleLabel\": null,\n" +
                "    \"guestLabel\": null,\n" +
                "    \"voucherLabel\": \"V\",\n" +
                "    \"productName\": \"The Bailey’s Hotel London/伦敦贝利酒店\",\n" +
                "    \"customerName\": \"YANG YI\",\n" +
                "    \"supplierPayStatus\": 1,\n" +
                "    \"customerPayStatus\": 1,\n" +
                "    \"billStatus\": null,\n" +
                "    \"travellerCountryCn\": \"中国大陆\",\n" +
                "    \"breakfast\": \"true\",\n" +
                "    \"breakfastDescription\": \"Breakfast\",\n" +
                "    \"demoFormal\": \"debug\",\n" +
                "    \"dutyServiceId\": null,\n" +
                "    \"cancelDate\": null,\n" +
                "    \"cancelType\": 0,\n" +
                "    \"roomDuration\": 4,\n" +
                "    \"message\": \"\",\n" +
                "    \"updateTime\": null,\n" +
                "    \"updater\": \"agoda\",\n" +
                "    \"createTime\": null,\n" +
                "    \"creator\": \"agoda\",\n" +
                "    \"hotelAffirmNo\": null,\n" +
                "    \"hotelAffirmUsername\": null,\n" +
                "    \"orderModifyDate\": null,\n" +
                "    \"paymentType\": 2,\n" +
                "    \"paymentChannel\": 1,\n" +
                "    \"transactionStatus\": 0,\n" +
                "    \"taskType\": 0,\n" +
                "    \"hotelId\": \"490253\",\n" +
                "    \"hotelCode\": null,\n" +
                "    \"cityCode\": null,\n" +
                "    \"bookingReferenceCode\": null,\n" +
                "    \"pingppId\": null,\n" +
                "    \"initChargeTime\": null,\n" +
                "    \"transidHistory\": null,\n" +
                "    \"chargeInfo\": null,\n" +
                "    \"manualModifySign\": 0,\n" +
                "    \"orderJson\": null,\n" +
                "    \"bookingOrderStatus\": null,\n" +
                "    \"bookingMatchMessage\": null,\n" +
                "    \"isPending\": null,\n" +
                "    \"doubleCheckStatus\": null,\n" +
                "    \"hotelConfirmNum\": null,\n" +
                "    \"disputeStatus\": null\n" +
                "  },\n" +
                "  \"hotelRooms\": [\n" +
                "    {\n" +
                "      \"roomPolicyList\": [\n" +
                "        {\n" +
                "          \"policyId\": null,\n" +
                "          \"orderId\": 171113174214681128,\n" +
                "          \"roomId\": 1,\n" +
                "          \"amount\": 0,\n" +
                "          \"policyCode\": \"\",\n" +
                "          \"policyType\": \"cancellation\",\n" +
                "          \"currencyCode\": \"USD\",\n" +
                "          \"allowable\": null,\n" +
                "          \"startDate\": 1513699199000,\n" +
                "          \"endDate\": null,\n" +
                "          \"feeType\": \"FIXED_FEE\",\n" +
                "          \"policyDescription\": null,\n" +
                "          \"remark\": null,\n" +
                "          \"createTime\": null,\n" +
                "          \"creator\": null,\n" +
                "          \"updateTime\": null,\n" +
                "          \"updater\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"policyId\": null,\n" +
                "          \"orderId\": 171113174214681128,\n" +
                "          \"roomId\": 1,\n" +
                "          \"amount\": 0,\n" +
                "          \"policyCode\": \"\",\n" +
                "          \"policyType\": \"cancellation\",\n" +
                "          \"currencyCode\": \"USD\",\n" +
                "          \"allowable\": null,\n" +
                "          \"startDate\": 1513699199000,\n" +
                "          \"endDate\": null,\n" +
                "          \"feeType\": \"FIXED_FEE\",\n" +
                "          \"policyDescription\": null,\n" +
                "          \"remark\": null,\n" +
                "          \"createTime\": null,\n" +
                "          \"creator\": null,\n" +
                "          \"updateTime\": null,\n" +
                "          \"updater\": null\n" +
                "        }\n" +
                "      ],\n" +
                "      \"travellerList\": [\n" +
                "        {\n" +
                "          \"travellerId\": 10894,\n" +
                "          \"orderId\": 171113174214681128,\n" +
                "          \"roomId\": 1,\n" +
                "          \"companyGroupId\": \"\",\n" +
                "          \"firstName\": \"YI\",\n" +
                "          \"lastName\": \"YANG\",\n" +
                "          \"title\": \"Mr\",\n" +
                "          \"type\": 0,\n" +
                "          \"age\": null,\n" +
                "          \"passport\": null,\n" +
                "          \"status\": 0,\n" +
                "          \"remark\": null,\n" +
                "          \"createTime\": null,\n" +
                "          \"creator\": null,\n" +
                "          \"updateTime\": null,\n" +
                "          \"updater\": null,\n" +
                "          \"fullName\": null\n" +
                "        }\n" +
                "      ],\n" +
                "      \"id\": null,\n" +
                "      \"orderId\": 171113174214681128,\n" +
                "      \"roomId\": 1,\n" +
                "      \"roomStatus\": 0,\n" +
                "      \"currencyCode\": \"USD\",\n" +
                "      \"countryCode\": \"US\",\n" +
                "      \"cityCode\": \"1427\",\n" +
                "      \"hotelId\": \"490253\",\n" +
                "      \"hotelCode\": \"444\",\n" +
                "      \"hotelName\": \"伦敦贝利酒店/The Bailey’s Hotel London\",\n" +
                "      \"price\": 756.6,\n" +
                "      \"travellerId\": 10894,\n" +
                "      \"adultsQuantity\": 1,\n" +
                "      \"childrenQuantity\": 0,\n" +
                "      \"roomReferenceCode\": null,\n" +
                "      \"roomRateCode\": \"{\\\"@id\\\":\\\"3051780\\\",\\\"@p\\\":null,\\\"@n\\\":\\\"Standard Room\\\",\\\"@li\\\":\\\"4\\\",\\\"@rp\\\":\\\"B2B\\\",\\\"@rt\\\":\\\"B2B\\\",\\\"@cy\\\":\\\"USD\\\",\\\"@m\\\":\\\"Merchant\\\",\\\"@rg\\\":\\\"730525\\\",\\\"@b\\\":\\\"481ee1e2-b237-2dc2-f7fc-5a745fe53b00\\\",\\\"@r\\\":{\\\"@e\\\":\\\"301.67\\\",\\\"@t\\\":\\\"60.33\\\",\\\"@f\\\":\\\"0.00\\\",\\\"@i\\\":\\\"362.00\\\"},\\\"@sc\\\":[],\\\"@c\\\":0,\\\"@a\\\":0,\\\"@cr\\\":0}\",\n" +
                "      \"roomCode\": \"3051780\",\n" +
                "      \"roomName\": \"Standard Room(Breakfast)\",\n" +
                "      \"roomIndex\": null,\n" +
                "      \"roomTypeCode\": \"\",\n" +
                "      \"roomType\": \"\",\n" +
                "      \"promotionId\": null,\n" +
                "      \"priceBreakDown\": \"[]\",\n" +
                "      \"perferences\": null,\n" +
                "      \"message\": \"\",\n" +
                "      \"remark\": \"756.6\",\n" +
                "      \"sharingBedding\": \"\",\n" +
                "      \"breakfastCode\": \"1\",\n" +
                "      \"breakfast\": \"true\",\n" +
                "      \"breakfastDescription\": \"Breakfast\",\n" +
                "      \"rateComments\": null,\n" +
                "      \"mealCode\": \"1\",\n" +
                "      \"mealDescription\": \"\",\n" +
                "      \"createTime\": null,\n" +
                "      \"creator\": null,\n" +
                "      \"updateTime\": null,\n" +
                "      \"updater\": null,\n" +
                "      \"mikiIdentifierId\": \"442163175563891067\",\n" +
                "      \"roomRateId\": \"3051780||Standard Room|4|B2B|B2B|USD|Merchant|730525|481ee1e2-b237-2dc2-f7fc-5a745fe53b00|1\",\n" +
                "      \"roomCount\": 1,\n" +
                "      \"bedExtraStatus\": null,\n" +
                "      \"bedExtraDescription\": null,\n" +
                "      \"isMatch\": null,\n" +
                "      \"roomInfo\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"roomPolicyList\": [\n" +
                "        {\n" +
                "          \"policyId\": null,\n" +
                "          \"orderId\": 171113174214681128,\n" +
                "          \"roomId\": 2,\n" +
                "          \"amount\": 0,\n" +
                "          \"policyCode\": \"\",\n" +
                "          \"policyType\": \"cancellation\",\n" +
                "          \"currencyCode\": \"USD\",\n" +
                "          \"allowable\": null,\n" +
                "          \"startDate\": 1513699199000,\n" +
                "          \"endDate\": null,\n" +
                "          \"feeType\": \"FIXED_FEE\",\n" +
                "          \"policyDescription\": null,\n" +
                "          \"remark\": null,\n" +
                "          \"createTime\": null,\n" +
                "          \"creator\": null,\n" +
                "          \"updateTime\": null,\n" +
                "          \"updater\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"policyId\": null,\n" +
                "          \"orderId\": 171113174214681128,\n" +
                "          \"roomId\": 2,\n" +
                "          \"amount\": 0,\n" +
                "          \"policyCode\": \"\",\n" +
                "          \"policyType\": \"cancellation\",\n" +
                "          \"currencyCode\": \"USD\",\n" +
                "          \"allowable\": null,\n" +
                "          \"startDate\": 1513699199000,\n" +
                "          \"endDate\": null,\n" +
                "          \"feeType\": \"FIXED_FEE\",\n" +
                "          \"policyDescription\": null,\n" +
                "          \"remark\": null,\n" +
                "          \"createTime\": null,\n" +
                "          \"creator\": null,\n" +
                "          \"updateTime\": null,\n" +
                "          \"updater\": null\n" +
                "        }\n" +
                "      ],\n" +
                "      \"travellerList\": [\n" +
                "        {\n" +
                "          \"travellerId\": 10895,\n" +
                "          \"orderId\": 171113174214681128,\n" +
                "          \"roomId\": 2,\n" +
                "          \"companyGroupId\": \"\",\n" +
                "          \"firstName\": \"ER\",\n" +
                "          \"lastName\": \"YAN\",\n" +
                "          \"title\": \"Mr\",\n" +
                "          \"type\": 0,\n" +
                "          \"age\": null,\n" +
                "          \"passport\": null,\n" +
                "          \"status\": 0,\n" +
                "          \"remark\": null,\n" +
                "          \"createTime\": null,\n" +
                "          \"creator\": null,\n" +
                "          \"updateTime\": null,\n" +
                "          \"updater\": null,\n" +
                "          \"fullName\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"travellerId\": 10896,\n" +
                "          \"orderId\": 171113174214681128,\n" +
                "          \"roomId\": 2,\n" +
                "          \"companyGroupId\": \"\",\n" +
                "          \"firstName\": \"ESAN\",\n" +
                "          \"lastName\": \"YAN\",\n" +
                "          \"title\": \"Mr\",\n" +
                "          \"type\": 0,\n" +
                "          \"age\": null,\n" +
                "          \"passport\": null,\n" +
                "          \"status\": 0,\n" +
                "          \"remark\": null,\n" +
                "          \"createTime\": null,\n" +
                "          \"creator\": null,\n" +
                "          \"updateTime\": null,\n" +
                "          \"updater\": null,\n" +
                "          \"fullName\": null\n" +
                "        }\n" +
                "      ],\n" +
                "      \"id\": null,\n" +
                "      \"orderId\": 171113174214681128,\n" +
                "      \"roomId\": 2,\n" +
                "      \"roomStatus\": 0,\n" +
                "      \"currencyCode\": \"USD\",\n" +
                "      \"countryCode\": \"US\",\n" +
                "      \"cityCode\": \"1427\",\n" +
                "      \"hotelId\": \"490253\",\n" +
                "      \"hotelCode\": \"444\",\n" +
                "      \"hotelName\": \"伦敦贝利酒店/The Bailey’s Hotel London\",\n" +
                "      \"price\": 756.6,\n" +
                "      \"travellerId\": 10896,\n" +
                "      \"adultsQuantity\": 2,\n" +
                "      \"childrenQuantity\": 0,\n" +
                "      \"roomReferenceCode\": null,\n" +
                "      \"roomRateCode\": \"{\\\"@id\\\":\\\"3051780\\\",\\\"@p\\\":null,\\\"@n\\\":\\\"Standard Room\\\",\\\"@li\\\":\\\"4\\\",\\\"@rp\\\":\\\"B2B\\\",\\\"@rt\\\":\\\"B2B\\\",\\\"@cy\\\":\\\"USD\\\",\\\"@m\\\":\\\"Merchant\\\",\\\"@rg\\\":\\\"730525\\\",\\\"@b\\\":\\\"481ee1e2-b237-2dc2-f7fc-5a745fe53b00\\\",\\\"@r\\\":{\\\"@e\\\":\\\"301.67\\\",\\\"@t\\\":\\\"60.33\\\",\\\"@f\\\":\\\"0.00\\\",\\\"@i\\\":\\\"362.00\\\"},\\\"@sc\\\":[],\\\"@c\\\":0,\\\"@a\\\":0,\\\"@cr\\\":0}\",\n" +
                "      \"roomCode\": \"3051780\",\n" +
                "      \"roomName\": \"Standard Room(Breakfast)\",\n" +
                "      \"roomIndex\": null,\n" +
                "      \"roomTypeCode\": \"\",\n" +
                "      \"roomType\": \"\",\n" +
                "      \"promotionId\": null,\n" +
                "      \"priceBreakDown\": \"[]\",\n" +
                "      \"perferences\": null,\n" +
                "      \"message\": \"\",\n" +
                "      \"remark\": \"756.6\",\n" +
                "      \"sharingBedding\": \"\",\n" +
                "      \"breakfastCode\": \"1\",\n" +
                "      \"breakfast\": \"true\",\n" +
                "      \"breakfastDescription\": \"Breakfast\",\n" +
                "      \"rateComments\": null,\n" +
                "      \"mealCode\": \"1\",\n" +
                "      \"mealDescription\": \"\",\n" +
                "      \"createTime\": null,\n" +
                "      \"creator\": null,\n" +
                "      \"updateTime\": null,\n" +
                "      \"updater\": null,\n" +
                "      \"mikiIdentifierId\": \"442163175563891067\",\n" +
                "      \"roomRateId\": \"3051780||Standard Room|4|B2B|B2B|USD|Merchant|730525|481ee1e2-b237-2dc2-f7fc-5a745fe53b00|2\",\n" +
                "      \"roomCount\": 1,\n" +
                "      \"bedExtraStatus\": null,\n" +
                "      \"bedExtraDescription\": null,\n" +
                "      \"isMatch\": null,\n" +
                "      \"roomInfo\": null\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }
}
