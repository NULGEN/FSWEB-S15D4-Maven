package org.example;


import java.util.LinkedList;

import static java.awt.SystemColor.text;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
       // System.out.println(convertDecimalToBinary(13));



    }

    public static boolean checkForPalindrome(String text){
        String cleanStr = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        LinkedList<Character> charList = new LinkedList<>();

        for(char c: cleanStr.toCharArray()){
            charList.add(c);
        }

        while (charList.size()>1){
            if(!charList.pollFirst().equals(charList.pollLast())){
                return  false;
            }
        }
        return true;
    }

    public  static String convertDecimalToBinary(int number){
//        String text ="";
//        String reverseTxt= "";
//
//        if(number <2){
//            return Integer.toString(number);
//        }
//
//        while(number >0){
//            text += number%2;
//           number= number/2;
//        }
//        for(int i =0; i<text.length(); i++){
//            reverseTxt = text.charAt(i)+ reverseTxt;
//        }
//        return reverseTxt;

        LinkedList<Integer> binaryList = new LinkedList<>();

        while (number>0){
            int reminder = number%2;
            binaryList.addFirst(reminder);
            number = number/2;
        }

        StringBuilder  binaryString = new StringBuilder();
        for(int i: binaryList){
            binaryString.append(i);
        }
        return  binaryString.toString();

    }
}