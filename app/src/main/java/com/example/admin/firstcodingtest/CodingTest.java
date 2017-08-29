package com.example.admin.firstcodingtest;

import java.util.ArrayList;

/**
 * Created by Admin on 8/29/2017.
 */

public class CodingTest {

    public static void main(String[] args) {

        //Problem 1
        //if number is divisible by 3, the print "fizz"
        //if number is divisible by 5, the print "buzz"
        //if number is divisible by 3 and 5, the print "fizz buzz"
        //counter till 20


problem1();
        problem2();
    }
public static void problem1()
{
    for (int i=0; i < 20; i++)
    {
        if ( i%3 !=0 ) {
            printFizzBuss("fizz");
        }
        if ( i%5 !=0) {
            printFizzBuss("fizz");
        }
        if ( i%3 !=0 && i%5 !=0) {
            printFizzBuss("fizzfuzz");
        }
        //    boolean isDivisibleBy20 = number % 20 == 0;
    }
}
    public static void printFizzBuss(String print){

        System.out.println(print);
    }

    public static void problem2()
    {
       ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("A");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("B");
        stringArrayList.add("E");

        String testString="";

        for(int i=0; i <stringArrayList.size(); i++)
        {
            testString = stringArrayList.get(i);
            for(int j=0; j < stringArrayList.size() -1 ; j++)
            {
                if(testString.equals(stringArrayList.get(j)))
                {
                    System.out.println(testString);
                }
            }

        }



    }
}
