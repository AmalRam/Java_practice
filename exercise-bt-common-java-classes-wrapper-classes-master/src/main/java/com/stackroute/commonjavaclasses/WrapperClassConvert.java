package com.stackroute.commonjavaclasses;

import java.util.Scanner;

public class WrapperClassConvert {

    //write logic to determine and convert given primitive type to its wrapper class and return result
    public static Object convertToWrapper(Object input) {

        Integer i = Integer.valueOf(input.toString());
        Class c=i.getClass();
        Object obj=c.getName();
        return obj;
    }

    public static  void main(String []  args) {
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        try
        {
            // checking valid integer using parseInt() method
            Integer.parseInt(a);
            Object obj = a;
            Object o=convertToWrapper(obj);
            if(o.equals("java.lang.Integer")){
                Integer obj1 = Integer.valueOf(a);
                System.out.println(obj1);
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println( "Give proper primitive type as input");
        }




    }
}

