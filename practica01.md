# Práctica 01 - Fundamentos de Programación con Java

## Objetivo
Por medio del presente laboratorio, el alumno aplicará los conocimientos fundamentales de Java a través de la resolución de pequeños problemas.
Dichos problemas fueron sacados del sitio: www.codingbat.com

## Problema 1 - “stringTimes”
Fuente: http://codingbat.com/prob/p142270

“Given a string and a non-negative int n, return a larger string
that is n copies of the original string.”

“Dada una cadena y un entero n no negativo, devolver una cadena
larga que copie n-veces la cadena original”

```
stringTimes("Hi", 2) -> "HiHi"
stringTimes("Hi", 3) -> "HiHiHi"
stringTimes("Hi", 1) -> "Hi"
```

## Problema 2 - “lastDigit”
Fuente: http://codingbat.com/prob/p125339

“Given two non-negative int values, return true if they have the
same last digit, such as with 27 and 57. Note that the % "mod"
operator computes remainders, so 17 % 10 is 7.”

“Dados dos valores enteros no-negativos, devolver true si tienen
el mismo último dígito, tal como 27 y 57. Nota que el operador %
“mod” calcula los residuos, asi que 17 % 10 es 7”

```
lastDigit(7, 17)  -> true
lastDigit(6, 17)  -> false
lastDigit(3, 113) -> true
```

## Problema 3 - “hasTeen”
Fuente: http://codingbat.com/prob/p178986

“We'll say that a number is "teen" if it is in the range 13..19
inclusive. Given 3 int values, return true if 1 or more of them
are teen.”

“Bién, digamos que un número es “diez” si está en el rango de
13..19 inclusive. Dados 3 valores enteros devolver true si 1 o
más de ellos son diez”.

```
hasTeen(13, 20, 10) -> true
hasTeen(20, 19, 10) -> true
hasTeen(20, 10, 13) -> true
```

## Problema 4 - “nearHundred”
Fuente: http://codingbat.com/prob/p184004

“Given an int n, return true if it is within 10 of 100 or 200.
Note: Math.abs(num) computes the absolute value of a number.”

“Dado un entero n, devolver true si está dentro de 100 ± 10 o 200 ± 10. Nota Math.abs(num) calcula el valor absoluto de un número ”

```
nearHundred(93) -> true
nearHundred(90) -> true
nearHundred(89) -> false
```

## Problema 5 - “parrotTrouble”
Fuente: http://codingbat.com/prob/p140449

“We have a loud talking parrot. The "hour" parameter is the
current hour time in the range 0..23. We are in trouble if the
parrot is talking and the hour is before 7 or after 20. Return
true if we are in trouble.”

“Tenemos un loro hablador (gritador en todo caso). El parámetro
“hora”, es la hora actual en el rango de 0..23. Estamos en
problemas si el loro esta hablando y la hora es antes de las 7 o
despues de las 20. Devuelva true si estamos en problemas”

```
parrotTrouble(true, 6)  -> true
parrotTrouble(true, 7)  -> false
parrotTrouble(false, 6) -> false
```

## Problema 6 - “frontBack”
Fuente: http://codingbat.com/prob/p123384

“Given a string, return a new string where the first and last
chars have been exchanged.”

“Dada una cadena, devuelva una nueva cadena donde la primera y
último caracter tienen que ser intercambiados.”

```
frontBack("code") -> "eodc"
frontBack("a")    -> "a"
frontBack("ab")   -> "ba"
```
