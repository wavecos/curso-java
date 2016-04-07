package com.xiobit.academy.lab01.warmup1;

/**
 * Created by onix on 4/6/16.
 */
public class Lab01 {



//    Problema 4 - “nearHundred”
//    Fuente: http://codingbat.com/prob/p184004
//
//            “Given an int n, return true if it is within 10 of 100 or 200.
//    Note: Math.abs(num) computes the absolute value of a number.”
//
//            “Dado un entero n, devolver true si está dentro de 100 ± 10 o 200 ± 10.
//    Nota Math.abs(num) calcula el valor absoluto de un número ”
//
//    nearHundred(93) -> true
//    nearHundred(90) -> true
//    nearHundred(89) -> false
    public boolean nearHundred(int n) {
        if ( Math.abs(n - 100) <= 10 ||  Math.abs(n - 200) <= 10) {
            return true;
        } else {
            return false;
        }
    }

//        Problema 6 - “frontBack”
//        Fuente: http://codingbat.com/prob/p123384
//
//        “Given a string, return a new string where the first and last
//        chars have been exchanged.”
//
//        “Dada una cadena, devuelva una nueva cadena donde la primera y
//        último caracter tienen que ser intercambiados.”
//
//        frontBack("code") -> "eodc"
//        frontBack("a")    -> "a"
//        frontBack("ab")   -> "ba"
    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        return lastChar + str.substring(1, str.length() - 1) + firstChar;
    }


}




