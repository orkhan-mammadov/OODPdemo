package org.example.service.price;

import java.util.Map;

public class PriceDecorator implements Price {

    protected Price price;

    public PriceDecorator(Price price){
        this.price = price;
    }

    @Override
    public Map<String,Integer> getPriceList(int rate) {
        return this.price.getPriceList(rate);
    }
}
