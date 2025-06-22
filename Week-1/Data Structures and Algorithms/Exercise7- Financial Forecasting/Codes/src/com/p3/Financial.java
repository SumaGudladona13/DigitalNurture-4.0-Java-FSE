package com.p3;

public class Financial
{
    public static double value1(double currentValue, double growthRate, int years) 
    {
        if (years == 0) 
        {
            return currentValue;
        }
        return value1(currentValue, growthRate, years - 1) * (1 + growthRate);
    }
    public static double value2(double currentValue, double growthRate, int years) 
    {
        double futureValue = currentValue;
        for (int i = 1; i <= years; i++) 
        {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }
}
