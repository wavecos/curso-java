# Práctica 02 - Fundamentos de Programación con Java

## Objetivo
Por medio del presente laboratorio, el alumno aplicará los conocimientos fundamentales de Java a través de la resolución de pequeños problemas.
Dichos problemas fueron sacados del sitio: www.codingbat.com

## Problema 1 - “fizzString”
Fuente: http://codingbat.com/prob/p137136

“Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.”


```
fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
```

## Problema 2 - “sumDouble”
Fuente: http://codingbat.com/prob/p154485

“Given two int values, return their sum. Unless the two values are the same, then return double their sum.”

```
sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
```

## Problema 3 - “conCat”
Fuente: http://codingbat.com/prob/p132118

Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

```
conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
```

## Problema 4 - “nTwice”
Fuente: http://codingbat.com/prob/p174148


Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.

```
nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
```

## Problema 5 - “shareDigit”
Fuente: http://codingbat.com/prob/p153748

Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)

```
shareDigit(12, 23) → true
shareDigit(12, 43) → false
shareDigit(12, 44) → false
```

## Problema 6 - “cigarParty”
Fuente: http://codingbat.com/prob/p159531


When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.

```
cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true
```
