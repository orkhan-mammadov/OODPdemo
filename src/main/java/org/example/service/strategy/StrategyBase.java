package org.example.service.strategy;

import org.example.service.channel.StrategyChannel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class StrategyBase implements Strategy{
    private final Rate rate = Rate.getInstance();
    private final List<StrategyChannel> channels = new ArrayList<>();

    public Rate getRate() {
        return rate;
    }

    public void addObserver(StrategyChannel channel){
        this.channels.add(channel);
    }

    public void removeObserver(StrategyChannel channel){
        this.channels.remove(channel);
    }

    public void notifyChannel(Map<String,Integer> o){
        for(StrategyChannel channel : this.channels){
            channel.update(o);
        }
    }
}
