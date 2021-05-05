// tarea 7 ejercicio 2 del curso de JAVA
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //declaracion de variables
       int n1;
       int n2;
       int n3;
       // entrada de datos;
        System.out.println("Ingrese el primer numero");
        n1=in.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2=in.nextInt();
        System.out.println("Ingrese el tercer numero");
        n3=in.nextInt();
        //condicional If else
        if(n1>n2 && n1>n3){
            System.out.println("el numero mayor es: "+n1);
        }else if(n2>n1 && n2>n3){
            System.out.println("el numero mayo es: "+n2);
        }else{
            System.out.println("el numero mayor es: "+n3);
        }
    }
    
}
