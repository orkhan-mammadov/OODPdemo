package org.example;

import org.example.service.PriceStrategyFacade;

import java.util.Random;

public class App 
{
    public static void main( String[] args ) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int salary = random.nextInt(1, 10) * 1000;
            System.out.println("Salary amount: " + salary);
            PriceStrategyFacade.firstAlg(salary);
        }
    }
}
