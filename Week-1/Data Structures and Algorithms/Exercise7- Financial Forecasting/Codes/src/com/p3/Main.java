package com.p3;

public class Main 
{
    public static void main(String[] args) 
    {
        double initialInvestment = 10000;
        double annualGrowthRate = 0.08;
        int forecastYears = 5;

        double valueRec = Financial.value1(initialInvestment, annualGrowthRate, forecastYears);
        double valueIter = Financial.value2(initialInvestment, annualGrowthRate, forecastYears);
        System.out.println("Future Value using Recursion: ₹" + String.format("%.2f", valueRec));
        System.out.println("Future Value using Iteration: ₹" + String.format("%.2f", valueIter));
    }
}

