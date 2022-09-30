package org.example.service.strategy;

import org.example.service.price.BasicPrice;
import org.example.service.price.GoldPrice;
import org.example.service.price.PlatinumPrice;
import org.example.service.price.Price;

import java.util.Map;

public class HighCostStrategy extends StrategyBase{
    @Override
    public Map<String, Integer> getOffers() {
        System.out.println("High cost strategy.");
        Price price = new PlatinumPrice(new GoldPrice(new BasicPrice()));
        Map<String, Integer> response = price.getPriceList(super.getRate().getHighRate());
        System.out.println(response);
        return response;
    }
}
