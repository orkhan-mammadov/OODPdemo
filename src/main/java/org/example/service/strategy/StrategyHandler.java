package org.example.service.strategy;

import lombok.Getter;
import org.example.enums.Category;

import java.beans.JavaBean;
import java.util.HashMap;
import java.util.Map;

@JavaBean
@Getter
public class StrategyHandler {
    private final Map<Category, Strategy> strategyMap;

    public StrategyHandler() {
        Map<Category,Strategy> strategyMap = new HashMap<>();
        strategyMap.put(Category.LOW, new LowCostStrategy());
        strategyMap.put(Category.MID, new MidCostStrategy());
        strategyMap.put(Category.HIGH, new HighCostStrategy());
        this.strategyMap = strategyMap;
    }

    public Strategy getStrategy(Category category){
        return strategyMap.get(category);
    }
}
