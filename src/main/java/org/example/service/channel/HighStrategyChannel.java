package org.example.service.channel;

import java.util.Map;

public class HighStrategyChannel implements StrategyChannel {
    @Override
    public void update(Map<String, Integer> response) {
        System.out.println("High Strategy channel updated. Values: "+response.size());
    }
}
