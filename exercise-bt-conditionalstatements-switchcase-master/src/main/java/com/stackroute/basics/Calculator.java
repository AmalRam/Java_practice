package com.stackroute.basics;

import java.util.Scanner;

public class Calculator {
    private static Scanner scan;
    int firstValue,secondValue;
    private static int sum=0,sub=0,mul=1,div=0;
    char op='\0';
    char ch='y';
    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        new Calculator().getValues(scan);
    }

    //Get values and which operator from the menu
    public void getValues(Scanner scan) {
        while(ch=='y'|| ch=='Y'){
            System.out.println("Enter the first value");
            firstValue=scan.nextInt();
            System.out.println("Enter the second value");
            secondValue=scan.nextInt();

            System.out.println("Enter number beside operation to perform\n"
            +"1.Add\n" +
                            "2.Subtract\n"+
                            "3.Multiply\n"+
                            "4.Division\n"
            );
            op= scan.next().charAt(0);
            String result=calculate(firstValue,secondValue,op);
            System.out.println(result);
            if(result.contains("Entered wrong option")) {
                return;
            }

            System.out.println("Do you Want to Continue(y/n):");
            ch=scan.next().charAt(0);
        }

    }

    //perform operation based on the chosen switch case corresponding to the menu and return string
    public static String calculate(int firstValue, int secondValue, int operator) {
        String rst;
        switch (operator){
            case '1':
                       sum =firstValue+secondValue;
                       rst=firstValue+" + "+ secondValue+"= "+sum;
                       break;
            case '2':
                        sub =firstValue-secondValue;
                        rst=firstValue+" - "+ secondValue+"= "+sub;
                        break;
            case '3':
                        mul =firstValue*secondValue;
                        rst=firstValue+" * "+ secondValue+"= "+mul;
                        break;
            case '4':

                        try {
                            div =firstValue/secondValue;// throw Exception
                        }
                        catch (ArithmeticException e) {
                            // Exception handler
                            rst="The divider (secondValue) cannot be zero ";
                            return rst;
                        }
                        rst=firstValue+" / "+ secondValue+"= "+div;
                        break;
            default :
                        rst=" Entered wrong option "+Character.toString(operator);

        }
        return rst;
    }
}
