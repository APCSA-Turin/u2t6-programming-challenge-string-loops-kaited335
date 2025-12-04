package com.example.project;

public class StringLoops {

   public StringLoops() { }

   //WARM UP 
    // using a for loop remove all 'a' characters from input string
   public String removeA(String str) {
        for (int i = 0; i < str.length(); i++) {
            String check = str.substring(i, i + 1);
            if (check.equals("a")) {
                str = str.substring(0,i) + str.substring(i + 1);
            }
        }
        if (str.equals("a")) {
            str = "";
        }
        return str;
   }


   // WARM UP
   // using a while loop remove all 'a' characters from input string
   public String removeA2(String str) {
        int index = 0;
        while(str.indexOf("a") != -1) {
            index = str.indexOf("a");
            str = str.substring(0,index) + str.substring(index + 1);
        }
        if (str.equals("a")) {
            str = "";
        }
        return str;
   }


   //WARM UP 
   //Reverse a string by counting down from the end to the start
   public String reverseString(String str) {
        String reverse = "";
        for (int i = str.length(); i > 0; i--) {
            reverse += str.substring(i - 1, i);
        }
        return reverse;
   }


   //WARM UP
   //Reverse a string by counting up from the start to the end
   public String reverseString2(String str) {
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.substring(i, i + 1) + reverse;
        }
        return reverse;
   }


   // using a for loop
   public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
        for (int i = 0; i < origStr.length(); i++) {
            String check = origStr.substring(i, i + 1);
            if (check.equals(searchChar)) {
                origStr = origStr.substring(0, i) + replaceChar + origStr.substring(i + 1);
            }
        }
        return origStr;
   }


   // using a while loop
   public String replaceCharacterV2(String searchChar, String origStr, String replaceChar) {
        int index = 0;    
        while (origStr.indexOf(searchChar) != -1) {
            index = origStr.indexOf(searchChar);
            origStr = origStr.substring(0, index) + replaceChar + origStr.substring(index + 1);
        }
        return origStr;
   }

   public int countString(String searchString, String origString) {
        int count = 0;
        for (int i = 0; i + searchString.length() <= origString.length(); i++) {
            String check = origString.substring(i, i + searchString.length());
            if (check.equals(searchString)) {
                count++;
            }
        }
        return count;
    }
   public String removeString(String searchString, String origString) {
       int index= 0;
        int length = 0;
        while (origString.indexOf(searchString) != -1) {
            length = searchString.length();
            index = origString.indexOf(searchString);
            origString = origString.substring(0, index) + origString.substring(index + length);
        }
        return origString;
   }


   public void commaSeparated(int fromNum, int toNum) { //the tests will compare your printed output (not a returned string)
        String number = "";
        for (int i = fromNum; i < toNum; i++) {
            number += i + ", ";
        }
        System.out.println(number + toNum);
   }



   public boolean isPalindrome(String myString) {
        int index = 0;
        while (myString.indexOf(" ") != -1) {
            index = myString.indexOf(" ");
            myString = myString.substring(0,index) + myString.substring(index + 1);
        }
        String reverse = reverseString(myString);
        if (myString.equals(reverse)) {
            return true;
        } else {
            return false;
        }
   }


   public void multiPrint(String toPrint, int num) { //the tests will compare your printed output (not a returned string)
        String number = "";
        if (num <= 0) {
            System.out.println("[]");
        } else {
            for (int i = 0; i < num; i++) {
                number += toPrint;
                if (i < num - 1) {
                    number += " ";
                }
            }
            System.err.println("[" + number + "]");
        }
    }
   }

