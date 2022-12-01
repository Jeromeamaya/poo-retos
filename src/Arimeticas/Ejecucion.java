package Arimeticas;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Bienvenido escoga su  opcion ");
        System.out.println("1. Cuadrado ");
        System.out.println("2. Circulo");
        System.out.println("3. Rectangulo");
        System.out.println("4. triangulo");
        System.out.println("5 Salir");
        
        System.out.println( " por favor digite la opcion ");
        int opcion=entrada.nextInt();
        

        switch (opcion){
            case 1:
            Cuadrado c1=new Cuadrado(); 
            System.out.println("ingrese valor del lado");
            c1.setLado(entrada.nextInt());
            c1.calcularArea();
            break;
            case 2 : 
            Triangulo c2=new Triangulo();
            System.out.println("ingrese el valor de base");
            c2.setBase(entrada.nextInt());        
            System.out.println("ingrese el valor de altura");  
            c2.setAltura(entrada.nextInt());
            c2.calcularArea();
            break;
            case 3: 
            Rectangulo c3=new Rectangulo();
            System.out.println("ingrese el valor de base");
            c3.setBase(entrada.nextFloat());
            System.out.println("ingrese el valor de altura");
            c3.setAltura(entrada.nextFloat());
            c3.calcularArea();
            break;
            case 4 :
            Circulo c4=new Circulo();
            System.out.println("ingrese el valor del radio");
            c4.setRadio(entrada.nextInt());
            System.out.println("ingrese el valor de diametro");
            c4.setDiametro(entrada.nextInt());
            c4.calcularArea();
            break;
        }
         
    }
    
}
         
    

