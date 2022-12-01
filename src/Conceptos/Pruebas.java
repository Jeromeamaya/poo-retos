package Conceptos;

import Sena.Jerome;

import java.util.Scanner;

import Arimeticas.Calculadora;

public class Pruebas {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Animal prueba=new Animal();
        Calculadora metodo=new Calculadora();
        /*
        prueba.registrarAnimal();

        prueba.cambiarnombre("juan");

        prueba.calcularead(2015);
        System.out.println("la edad del panda es "+ prueba.edad);
         */

         // metodo 1
        metodo.suma();
        
        // metodo 2
        System.out.println("el resultado de la resta es " + metodo.resta(0));

        // metodo 3
        metodo.numeromayor(0, 0);
        // etodo 4

        




    }



    
}
