# Práctica 03 - Fundamentos de Programación con Java

## Objetivo
Por medio del presente laboratorio, el alumno aplicará los conocimientos fundamentales de Java a través de la resolución de pequeños problemas.
Dichos problemas fueron sacados del sitio: www.codingbat.com

## Problema 1 - “startOz”
Fuente: http://codingbat.com/prob/p199720

Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

```
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
```

## Problema 2 - “love6”
Fuente: http://codingbat.com/prob/p137742


The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.

```
love6(6, 4) → true
love6(4, 5) → false
love6(1, 5) → true
```

## Problema 3 - “minCat”
Fuente: http://codingbat.com/prob/p105745

Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

```
minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
```

## Problema 4 - “middleTwo”
Fuente: http://codingbat.com/prob/p137729

Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.

```
middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
```
