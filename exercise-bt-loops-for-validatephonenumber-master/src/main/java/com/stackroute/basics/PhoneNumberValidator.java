package com.stackroute.basics;

import java.util.Scanner;

public class PhoneNumberValidator {
    private static Scanner sc;
    private static String number;
    //Create Scanner object as instance variable

    public static void main(String[] args) {
       String number=getInput();
       int res=validatePhoneNumber(number);
        displayResult(res);

    }

    public static String getInput() {
        sc=new Scanner(System.in);
        System.out.println("Input the Number:");
        String phoneNumber=sc.nextLine();
        return phoneNumber;
    }

    public static void displayResult(int result) {
     if(result == 1){
         System.out.println("Valid Phone Number");
     }
     if(result ==0){
         System.out.println(" input string is empty/null");
     }
     if(result==-1){
         System.out.println("string is not a valid phone number");
     }
    }

    public static int validatePhoneNumber(String input){
        char[] phoneNum= new char[input.length()];
        int valid=1;
        int flag=-1;
        for(int i=0;i<input.length();i++){
            phoneNum[i]=input.charAt(i);
            if((phoneNum[i]>=48 && phoneNum[i]<=57) || phoneNum[i]==45)
            {
                valid=1;
            }
            else
                 valid=0;
        }
        String num=input.replace("-","");
        //System.out.println(num);
        if(num.length()==10 && valid==1)
        {
            flag= 1;
        }
        if(num.length()==0) {
            flag= 0;
        }
        if(num.length()!=10){
            flag= -1;
        }
    return flag;
    }
    public void closeScanner(){

    }
}
