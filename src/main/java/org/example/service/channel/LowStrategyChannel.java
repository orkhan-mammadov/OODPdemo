package org.example.service.channel;

import org.example.service.strategy.Strategy;

import java.util.Map;

public class LowStrategyChannel implements StrategyChannel {
    @Override
    public void update(Map<String,Integer> response) {
        System.out.println("Low Strategy channel updated. Values: "+response.size());
    }
}
