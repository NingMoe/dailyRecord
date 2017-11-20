package cn.mogutrip.hotel.booking.supplier.test;

import agoda.AgodaConfig;
import cn.mogutrip.core.common.dto.BaseDto;
import cn.mogutrip.hotel.booking.dto.BookingHotelDto;
import cn.mogutrip.hotel.booking.dto.BookingHotelRSDto;
import cn.mogutrip.hotel.booking.supplier.convert.agoda.AgodaCommonConverter;
import cn.mogutrip.hotel.booking.supplier.entity.Supplier;
import cn.mogutrip.hotel.booking.supplier.invoke.Invoker;
import cn.mogutrip.hotel.booking.supplier.service.BookingStatusManager;
import cn.mogutrip.hotel.common.utils.JsonUtil;
import org.dom4j.Document;
import org.dom4j.Element;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 杨召朋 on 2017/11/1.
 */
public class BookingInvokerTest {

    public BaseDto book(Supplier supplier,String hotelBookingDto){
        BookingStatusManager bookingStatusManager = new BookingStatusManager();
        Invoker bookingInvoker = Invoker.getBookingInstance(supplier,bookingStatusManager);
        BookingHotelDto bookingHotelDto = JsonUtil.fromJsonLax(hotelBookingDto,BookingHotelDto.class);
        BaseDto bookingHotelRSDto =  bookingInvoker.invoke(bookingHotelDto);
        return  bookingHotelDto;
    }
}
