package main;
import  java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.print("holamundo!");
        System.out.println("igresa tu nombre");
        String nombre=teclado.next();
        System.out.println("el nombre ingresado fue  " + nombre);


        float largo;
        float ancho;
        float alto;
        float volumen;
        System.out.println("ingresa el lagor de la caja");
        largo=teclado.nextFloat();
        System.out.println("ingresa el ancho de la caja");
        ancho=teclado.nextFloat();
        System.out.println("ingresa el alto de la caja");
        alto=teclado.nextFloat();
        volumen=largo*ancho*alto;
        System.out.println("la el volumen es:  " + volumen);


    }
}
