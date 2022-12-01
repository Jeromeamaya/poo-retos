package Arimeticas;

import java.text.BreakIterator;
import java.util.Scanner;

public class Calculadora {

    Scanner entrada=new Scanner(System.in);
    public int num1;
    public int num2;

    
    

    // metodos

    // 1. metodo sin valor de retorno que sume los dos numeros

    // 2. metodo con valor de retorno que reste los dos numeros

    //3. metodo con valor de retorno cual es el numero mayor
    
    //4. metodo sin valor de retorno que devuelva cual es el numero menor

    // 5. metod con valor de retorno que eleve cada numero al exponente indicado por el ususario 
/* */
    public void suma() {
        System.out.println("ingrese numero 1 ");
        num1=entrada.nextInt();
        System.out.println("ingrese numero 2 ");
        num2=entrada.nextInt();
        System.out.println("el resultado de la suma es" + (num1+num2));   
    }
    public int resta(int resultado) {
        System.out.println("ingrese numero 1 ");
        num1=entrada.nextInt();
        System.out.println("ingrese numero 2 ");
        num2=entrada.nextInt();
        resultado=num1-num2;
        return resultado;
    }



    public int numeromayor(int num1, int num2) {
        System.out.println("ingrese numero 1 ");
        num1=entrada.nextInt();
        System.out.println("ingrese numero 2 ");
        num2=entrada.nextInt();

        if (num1 < num2){
        System.out.println("el numero mayor es "+ num2);
        }
        else if (num1 > num2 ){
        System.out.println(" el numero mayor es " + num1);
        }
        return numeromayor(num1, num2);
        }
    
    public void numermenor() {
        
        System.out.println("ingrese numero 1 ");
        num1=entrada.nextInt();
        System.out.println("ingrese numero 2 ");
        num2=entrada.nextInt();
        if (num1 < num2){
            System.out.println("el numero mayor es "+ num2);
            }
            else if (num1 > num2 ){
            System.out.println(" el numero mayor es " + num1);
            }
            }

    public void  potenciacion() {
        System.out.println("ingrese numero 1 ");
        num1=entrada.nextInt();
        System.out.println("ingrese numero 2 ");
        num2=entrada.nextInt();
        System.out.println("ingrese el exponente");
        double exponente=entrada.nextDouble();
        
        double potencia1=Math.pow(num1, exponente);
        double potencia2=Math.pow(num2, exponente);


        String resultado=( "el resultado de  "+ potencia1 + potencia2);
        System.out.println(""+ resultado);
    }        
    }
 
        




