package org.example.service.strategy;

import org.example.service.price.BasicPrice;
import org.example.service.price.GoldPrice;
import org.example.service.price.Price;

import java.util.Map;

public class MidCostStrategy extends StrategyBase{

    @Override
    public Map<String, Integer> getOffers() {
        System.out.println("Mid cost strategy.");
        Price price = new GoldPrice(new BasicPrice());
        Map<String, Integer> response = price.getPriceList(super.getRate().getMidRate());
        System.out.println(response);
        return response;
    }
}
