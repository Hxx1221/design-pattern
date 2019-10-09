package com.design.pattern.structural.facade;

public class Test {

    public static void main(String[] args) {
        PointsGift iphone = new PointsGift("iphone");

        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.setPointsPaymentService(new PointsPaymentService());
        giftExchangeService.setQualifyService(new QualifyService());
        giftExchangeService.setShippingService(new ShippingService());
        giftExchangeService.giftExchange(iphone);
    }
}