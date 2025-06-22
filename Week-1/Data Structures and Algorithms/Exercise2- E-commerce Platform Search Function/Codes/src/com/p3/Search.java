package com.p3;
import java.util.Arrays;
import java.util.Comparator;

public class Search 
{

    public static int linearSearch(Product[] a, String key) 
    {
        for (int i=0;i<a.length;i++) 
        {
            if (a[i].getProductName().equalsIgnoreCase(key)) 
            {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] a, String key) 
    {
        int start=0,end = a.length-1;
        while (start<=end) 
        {
            int mid=start+(end-start)/2;
            int total=a[mid].getProductName().compareToIgnoreCase(key);
            if(total==0)
            {
                return mid;
            }
            else if(total < 0)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void sortProductsByName(Product[] a) 
    {
        Arrays.sort(a, Comparator.comparing(Product::getProductName,String.CASE_INSENSITIVE_ORDER));
    }
}
