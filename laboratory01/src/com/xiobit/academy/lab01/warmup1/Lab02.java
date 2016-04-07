package com.xiobit.academy.lab01.warmup1;

/**
 * Created by onix on 4/6/16.
 */
public class Lab02 {

//    Problema 1 - “fizzString”
//    Fuente: http://codingbat.com/prob/p137136
//
//            “Given a string str, if the string starts with "f" return "Fizz".
// If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true,
// return "FizzBuzz". In all other cases, return the string unchanged.”
//
//
//    fizzString("fig") → "Fizz"
//    fizzString("dib") → "Buzz"
//    fizzString("fib") → "FizzBuzz"
    public String fizzString(String str) {
        if ( str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if ( str.startsWith("f") ) {
            return "Fizz";
        } else if ( str.endsWith("b") ) {
            return "Buzz";
        } else {
            return str;
        }
    }

//    Problema 2 - “sumDouble”
//    Fuente: http://codingbat.com/prob/p154485
//
//    “Given two int values, return their sum. Unless the two values are the same,
//    then return double their sum.”
//
//    sumDouble(1, 2) → 3
//    sumDouble(3, 2) → 5
//    sumDouble(2, 2) → 8
    public int sumDouble(int a, int b) {
        return a == b ? 2 * (a + b) : (a + b);
    }

//    Problema 3 - “conCat”
//    Fuente: http://codingbat.com/prob/p132118
//
//    Given two strings, append them together (known as "concatenation") and return the
//    result. However, if the concatenation creates a double-char,
//    then omit one of the chars, so "abc" and "cat" yields "abcat".
//
//    conCat("abc", "cat") → "abcat"
//    conCat("dog", "cat") → "dogcat"
//    conCat("abc", "") → "abc"
    public String conCat(String a, String b) {
        if ( !b.isEmpty() && a.endsWith(String.valueOf(b.charAt(0))) ) {
            return a + b.substring(1);
        } else  {
            return a + b;
        }
    }

//    Problema 4 - “nTwice”
//    Fuente: http://codingbat.com/prob/p174148
//
//
//    Given a string and an int n, return a string made of the first and last n chars from the string.
//    The string length will be at least n.
//
//    nTwice("Hello", 2) → "Helo"
//    nTwice("Chocolate", 3) → "Choate"
//    nTwice("Chocolate", 1) → "Ce"
    public String nTwice(String str, int n) {
        if (str.isEmpty()) {
            return str;
        }
        String firstPart = str.substring(0, n);
        int length = str.length();
        String lastPart = str.substring(length - n, length);

        return firstPart + lastPart;
    }

//    Problema 5 - “shareDigit”
//    Fuente: http://codingbat.com/prob/p153748
//
//    Given two ints, each in the range 10..99, return true if there is a digit that appears
//      in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the
//      left digit while the % "mod" n%10 gives the right digit.)
//
//    shareDigit(12, 23) → true
//    shareDigit(12, 43) → false
//    shareDigit(12, 44) → false
    public boolean shareDigit(int a, int b) {
        if ( a >= 10 && a <= 99 && b >= 10 && b <= 99 ) {

            int leftDigitA = a / 10;
            int rightDigitA = a % 10;

            int leftDigitB = b / 10;
            int rightDigitB = b % 10;

//            return ( a % leftDigitB == 0 || a % rightDigitB == 0 ) && ( b % leftDigitA == 0 || b % rightDigitA == 0);
            return leftDigitA == leftDigitB || rightDigitA == rightDigitB || leftDigitA == rightDigitB || rightDigitA == leftDigitB;

        } else {
            return false;
        }
    }


}
