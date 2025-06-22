package com.p3;
public class Main 
{
    public static void main(String[] args) 
    {
        Product[] a = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "Phone", "Electronics")
        };

        String key = "Watch";
        int linearIndex = Search.linearSearch(a,key);
        System.out.println("Linear Search Result: " +(linearIndex != -1 ? "Found at index " + linearIndex : "Not found"));

        Search.sortProductsByName(a);
        int binaryIndex = Search.binarySearch(a,key);
        System.out.println("Binary Search Result: "+(binaryIndex != -1 ? "Found at index " + binaryIndex : "Not found"));
    }
}
