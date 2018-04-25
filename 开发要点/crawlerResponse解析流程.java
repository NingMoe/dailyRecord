 public void parseHotelAvailabilities(List<Element> roomListEle, HotelAvailabilityRequest request, SupplierHotelAvailability result) {
        // Multiple rooms
        Map<String, HotelRooms> roomTypes = new HashMap<>();
        for(Element roomEle:roomListEle){
            String currency = "";
            String roomName = "";
            String roomCode = roomName;
            String roomRateCode = "";

            RoomTypeMapDetail roomTypeMapDetail = mappers.findRoomTypeMapDetail(request.getSupplierId(), "", roomName, 0, 0);
            RoomTypeInfo roomTypeInfo= roomTypeMapDetail.getRoomTypeInfo();
            String roomType = roomTypeMapDetail.getRoomType();
            BigDecimal totalRate = BigDecimal.ZERO;
            BigDecimal totalOriginRate = BigDecimal.ZERO;
            BigDecimal totalRspRate = BigDecimal.ZERO;
            //获取必填项

            String roomRateKey ="";
            String group = "";
            int roomCount = 1;
            HotelMeal meal = new HotelMeal();
            List<HotelRoomPriceBreakdown> priceBreakdowns = new ArrayList<>();
            HotelRoom hotelRoom = createRoomWithRequiredParams(roomRateKey,currency,
                    roomCode, roomName,roomType, roomTypeInfo, roomCount, roomRateCode, totalRate,totalOriginRate,totalRspRate,
                    meal,priceBreakdowns);

            //根据hotelRoom可入住人数等，判断是否可以匹配请求的房间，并获取roomIndex保存。
            List<String> roomIndexList = getRoomIndexList("");


            Map<String, List<HotelRoomMessage>> messages = new HashMap<>();
            //必填：二选一
            HotelRoomPolicies hotelRoomPolicies = new HotelRoomPolicies();
            hotelRoom.setPolicies(hotelRoomPolicies);
            hotelRoom.setCancellationPolicyCode("");

            //重要信息、优惠信息，尽量填充
            hotelRoom.setMessages(messages);

            //根据接口情况选填
            hotelRoom.setReferenceId("");
            hotelRoom.setGroup("");
            hotelRoom.setSharingBedding("");
            hotelRoom.setStatus("");
            boolean isThirdParty = false; //TODO set value
            if (isThirdParty) {
                hotelRoom.setThirdParty(SimpleType.TRUE);
            } else {
                hotelRoom.setThirdParty(SimpleType.FALSE);
            }
            hotelRoom.setThirdParty("");
            hotelRoom.setOccupancy("");
            hotelRoom.setDelayConfirm("");
            //需要控制库存时使用

            hotelRoom.setAllotment(0);

            AvailabilitiesManager.groupHotelRoomsByRoomIndex(roomIndexList, hotelRoom, roomTypes, roomRateKey);
        }
        AvailabilitiesManager.checkCombineOccupancies(roomTypes, getRoomList(), result);
    }