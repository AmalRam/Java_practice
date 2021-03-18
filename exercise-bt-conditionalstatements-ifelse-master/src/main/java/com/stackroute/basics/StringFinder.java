package com.stackroute.basics;

import java.util.Scanner;

public class StringFinder {
    private static String searchString,firstString,secondString;
    private Scanner sc;


    public static void main(String[] args) {
      // System.out.print(getInput());
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Search String:");
        searchString=getInput();
        System.out.println("Input first String:");
        firstString=getInput();
        System.out.println("Input Search String:");
        secondString=getInput();
        displayResult();

    }

    public static String getInput() {
        String str;
        Scanner sc= new Scanner(System.in);
        str=sc.nextLine();
        return str;
    }

    public static void displayResult() {
       int res=findString(searchString,firstString,secondString);
       if(res==-1)
           System.out.println("Empty string or null");
       if(res==0)
           System.out.println("Not found");
       if(res==1)
           System.out.println("Found as expected");

    }

    public  static int findString(String searchString, String firstString, String secondString)
    {
       // System.out.println(searchString.contains(firstString));
        //System.out.println(searchString.contains(secondString));
        // System.out.println(searchString.indexOf(firstString));
        // System.out.println(searchString.indexOf(secondString));
        int index1=searchString.indexOf(firstString);
        int index2=searchString.indexOf(secondString);
        boolean string1Check=searchString.contains(firstString);
        boolean string2Check= searchString.contains(secondString);
        int flag=0;
        if(firstString.isEmpty() || secondString.isEmpty())
        {
           return -1;//  System.out.println("Empty string or null");
        }
        else if(string1Check==false || string2Check==false)
        {
             return 0;//System.out.println("Not found");
        }

        else if(index2>index1)
        {

            flag=1;//System.out.println("Found as expected");
        }
          return flag;
    }

    public void closeScanner() {
        // close the scanner
        System.out.println("Closing Scanner...");
        sc.close();
        System.out.println("Scanner Closed.");
    }
}
