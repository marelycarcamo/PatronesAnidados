#PATRONES ANIDADOS

Este repositorio contiene un programa en Java llamado PatronesAnidados. Este programa se utiliza para generar y mostrar cuatro patrones diferentes basados en un número n ingresado por el usuario.

##------------- DESCRIPCION ---------------

El programa PatronesAnidados solicita al usuario que ingrese un número n. Luego, genera y muestra cuatro patrones diferentes basados en este número. Cada patrón es una matriz de n por n que contiene caracteres ‘X’ y espacios. La disposición de estos caracteres varía según el patrón:

Patrón 1: Este patrón tiene caracteres ‘X’ a lo largo de los bordes de la matriz y espacios en el interior.

Patrón 2: Este patrón tiene caracteres ‘X’ a lo largo de los bordes superior e inferior de la matriz y a lo largo de una diagonal desde la esquina superior derecha hasta la esquina inferior izquierda.

Patrón 3: Este patrón tiene caracteres ‘X’ a lo largo de las dos diagonales de la matriz.

Patrón 4: Este patrón tiene caracteres ‘X’ en todas las posiciones excepto en la primera columna y la última fila.

El programa utiliza un bucle anidado para generar cada patrón. El bucle externo recorre las filas de la matriz, mientras que el bucle interno recorre las columnas. Dentro del bucle interno, el programa utiliza una declaración condicional para determinar si debe imprimir un carácter ‘X’ o un espacio en cada posición.

##--------  COMO EJECUTAR EL PROGRAMA -------------

Para ejecutar el programa, necesitas tener instalado Java en tu máquina. Luego, puedes compilar y ejecutar el programa utilizando los siguientes comandos en la terminal:

javac PatronesAnidados.java
java PatronesAnidados
