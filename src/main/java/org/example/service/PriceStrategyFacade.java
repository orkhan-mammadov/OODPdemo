package org.example.service;

import org.example.enums.Category;
import org.example.service.channel.HighStrategyChannel;
import org.example.service.channel.LowStrategyChannel;
import org.example.service.channel.MidStrategyChannel;
import org.example.service.channel.StrategyChannel;
import org.example.service.strategy.StrategyBase;
import org.example.service.strategy.StrategyHandler;

public class PriceStrategyFacade {

    public static void firstAlg(int salary){
        Category category = CategoryFactory.getCategory(salary);
        StrategyHandler strategyHandler = new StrategyHandler();
        StrategyBase strategy1 = (StrategyBase) strategyHandler.getStrategy(category);
        strategy1.addObserver(selectChannel(category));
        strategy1.notifyChannel(strategy1.getOffers());
        strategy1.removeObserver(selectChannel(category));
        System.out.println();
    }

    private static StrategyChannel selectChannel(Category category) {
        return switch (category) {
            case LOW -> new LowStrategyChannel();
            case MID -> new MidStrategyChannel();
            case HIGH -> new HighStrategyChannel();
        };
    }
}
