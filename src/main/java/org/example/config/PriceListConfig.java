package org.example.config;

import java.util.HashMap;
import java.util.Map;

public class PriceListConfig {
    public static Map<String,Integer> basePriceTable(int rate){
        Map<String, Integer> priceTable = new HashMap<>();
        priceTable.put("Hour",5*rate);
        priceTable.put("Day",10*rate);
        return priceTable;
    }
}
