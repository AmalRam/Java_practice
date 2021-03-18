package com.stackroute.exercises;


import java.util.Scanner;

public class StringParse {


    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your sentense");
        String sentence= scan.nextLine();

        System.out.println("enter the location");
        String location=scan.nextLine();

        char result= StringParse.characterLocator(sentence,location);



    }
    public static char characterLocator(String sentence, String location) {

        int loc=Integer.parseInt(location);
        System.out.println(loc);
        char[] ch = new char[sentence.length()];


        // Copy character by character into array
        for (int i = 0; i <sentence.length(); i++) {

            ch[i] = sentence.charAt(i);
            //System.out.println(ch[i]);


        }

        //System.out.println(ch.length);

        try {


            // System.out.println("inside try");

            for(int j=0;j<ch.length;j++){

                if(ch[j]==ch[loc]){


                    System.out.println(ch[j]);
                    break;

                }


            }


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }

        return 0;
    }
}
