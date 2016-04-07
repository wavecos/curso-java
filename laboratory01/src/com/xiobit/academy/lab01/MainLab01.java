package com.xiobit.academy.lab01;

import com.xiobit.academy.lab01.warmup1.Lab01;
import com.xiobit.academy.lab01.warmup1.Lab02;

public class MainLab01 {

    public static void main(String[] args) {

        Lab01 lab01 = new Lab01();

        System.out.println("*** Ejercicio 4 ***");
        //    nearHundred(93) -> true
        //    nearHundred(90) -> true
        //    nearHundred(89) -> false
        System.out.println("nearHundred(93) -> " + lab01.nearHundred(93));
        System.out.println("nearHundred(90) -> " + lab01.nearHundred(90));
        System.out.println("nearHundred(89) -> " + lab01.nearHundred(89));

        System.out.println("*** Ejercicio 6 ***");
        //        frontBack("code") -> "eodc"
        //        frontBack("a")    -> "a"
        //        frontBack("ab")   -> "ba"
        System.out.println("frontBack(\"code\") -> " + lab01.frontBack("code"));
        System.out.println("frontBack(\"a\") -> " + lab01.frontBack("a"));
        System.out.println("frontBack(\"ba\") -> " + lab01.frontBack("ba"));

        String phone = "+591707635553";

        System.out.println("es de bolivia ? " + phone.endsWith("3"));


        Lab02 lab02 = new Lab02();

        System.out.println("prueba : '" + lab02.nTwice("", 3) + "'");

//        String str = "Chocolate";
//        int n = 0;
//        String firstPart = str.substring(0, n);
//        System.out.println(firstPart);
//
//        int length = str.length();
//        String lastPart = str.substring(length - n, length);
//        System.out.printf(lastPart);

        System.out.println(43 % 2);


    }
}
