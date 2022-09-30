package org.example.service;

import org.example.enums.Category;

public class CategoryFactory {
    public static Category getCategory(int salary){
        if(salary<4000)
            return Category.LOW;
        else if(salary>7000)
            return Category.HIGH;
        else
            return Category.MID;
    }
}
