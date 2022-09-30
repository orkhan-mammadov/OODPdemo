package org.example.service.strategy;

import org.example.service.price.BasicPrice;
import org.example.service.price.Price;

import java.util.Map;

public class LowCostStrategy extends StrategyBase {

    @Override
    public Map<String,Integer> getOffers() {
        System.out.println("Low price list.");
        Price price = new BasicPrice();
        Map<String, Integer> response = price.getPriceList(super.getRate().getLowRate());
        System.out.println(response);
        return response;
    }
}