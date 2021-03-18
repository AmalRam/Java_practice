package com.stackroute.basics;
import java.util.Scanner;

public class NumberAverage {
    public int a[],n;
    public  float avg;
    public static void main(String[] args) {

        new NumberAverage().getArrayValues();
    }

    //get the values of the array from the user
    public void getArrayValues() {
        Scanner s= new Scanner(System.in);
        System.out.println("Input Array Size:");
        n=s.nextInt();
        a=new int[n];
        System.out.println("Input "+n +"to the array");
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        System.out.println(findAverage(a));


    }

    //write here logic to calculate the average an array
    public String findAverage(int[] inputArray) {
        int sum=0;
        String result;
        int size = inputArray.length;
        if(size==0)
        {
            result= "Empty Array";
            return result;
        }
        for (int i: inputArray) {

            if(i<0)
            {
                result="Give proper positive integer values";
                return result;
            }
            else
            {
                sum+=i;
            }
        }
        avg=sum/size;
        result="The average value is:";
        result = result + String.valueOf(avg);
        return result;
    }
}
