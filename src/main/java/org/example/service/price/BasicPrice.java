package org.example.service.price;

import org.example.config.PriceListConfig;

import java.util.Map;

public class BasicPrice implements Price {

    @Override
    public Map<String, Integer> getPriceList(int rate) {
        return PriceListConfig.basePriceTable(rate);
    }
}
