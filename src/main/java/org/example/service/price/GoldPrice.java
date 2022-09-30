package org.example.service.price;

import java.util.Map;

public class GoldPrice extends PriceDecorator {
    public GoldPrice(Price price) {
        super(price);
    }

    @Override
    public Map<String, Integer> getPriceList(int rate) {
        Map<String, Integer> priceList = super.getPriceList(rate);
        priceList.put("Week",15*rate);
        return priceList;
    }
}
