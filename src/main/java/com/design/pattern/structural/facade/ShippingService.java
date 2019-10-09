package com.design.pattern.structural.facade;

public class ShippingService extends PointsPaymentService {
    public String shipGift(PointsGift pointsGift){
        System.out.println(pointsGift.getName()+"：进入物流系统!");
        String shippingOrderNo="1122";
        return shippingOrderNo;
    }
}