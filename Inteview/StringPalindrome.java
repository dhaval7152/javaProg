package Inteview;

import java.awt.*;

public class StringPalindrome {
    static public void palidrome(String name){
        String rv= String.valueOf(new StringBuilder(name).reverse());
        System.out.println(rv);
        if(name.equals(rv)){
            System.out.println("It's palindrome String");
        }
        else {

            System.out.println("False palindrome String");
        }
    }
    public static void main(String[] args) {
        String var="oyo";
        palidrome(var);
    }
}
