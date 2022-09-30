package org.example.service.price;

import java.util.Map;

public class PlatinumPrice extends PriceDecorator{
    public PlatinumPrice(Price price) {
        super(price);
    }

    @Override
    public Map<String, Integer> getPriceList(int rate) {
        Map<String, Integer> priceList = super.getPriceList(rate);
        priceList.put("Month",20*rate);
        return priceList;
    }
}
