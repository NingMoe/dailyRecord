package agoda;

import cn.mogutrip.core.common.dto.BaseDto;
import cn.mogutrip.hotel.booking.dto.BookingHotelDto;
import cn.mogutrip.hotel.booking.supplier.convert.agoda.AgodaCommonConverter;
import cn.mogutrip.hotel.booking.supplier.entity.Supplier;
import cn.mogutrip.hotel.booking.supplier.invoke.Invoker;
import cn.mogutrip.hotel.booking.supplier.service.BookingStatusManager;
import cn.mogutrip.hotel.booking.supplier.test.BookingInvokerTest;
import cn.mogutrip.hotel.common.utils.JsonUtil;
import org.dom4j.Document;
import org.dom4j.Element;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 杨召朋 on 2017/11/1.
 */
public class BookingTest {
    public static void main(String[] args) {
        BookingInvokerTest bookingInvokerTest = new BookingInvokerTest();
        Supplier supplier = AgodaConfig.getSupplier();
        String hotelBookingDto = AgodaConfig.getHotelBookingDto();
        BaseDto baseDto = bookingInvokerTest.book(supplier,hotelBookingDto);
    }

    public static void testXpath() {
        String responseXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?><BookingResponseV3 status=\"200\" " +
                "xmlns=\"http://xml.agoda.com\" xmlns:tns=\"http://xml.agoda.com\" xmlns:xs=\"http://www" +
                ".w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www" +
                ".w3.org/2001/XMLSchema-instance\"><BookingDetails><Booking id=\"8042959\" ItineraryID=\"2042706\" " +
                "selfservice=\"http://sandbox.www.agoda.com/mybooking/customer-request" +
                ".aspx?ODA0Mjk1OQequALequAL-10kfhuBlayQequAL\"/></BookingDetails></BookingResponseV3>";
        Map nameSpaceMap = new HashMap();
        nameSpaceMap.put("BookingResponseV3", "http://xml.agoda.com");
        Document root = AgodaCommonConverter.parseXmlToElement(responseXml, nameSpaceMap);
        String status = root.getRootElement().attributeValue("status");
        if (!status.equalsIgnoreCase("200")) {
            System.out.println("error");
        }else {
            List<Element> bookingEles = root.selectNodes("//BookingResponseV3:Booking");
            for (Element bookingEle : bookingEles) {
                String id = bookingEle.attributeValue("id");
                System.out.println(id);
            }
        }

    }
}
