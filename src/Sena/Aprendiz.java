package Sena;

import java.util.Scanner;

public class Aprendiz {
    
        
   
    private int id;
    int edad;
    public String ficha;
    public String nombre="jerome";
    public String genero;
    public String apellido;

    Scanner leer=new Scanner(System.in);
    

        
    public void nombreEjercicio() {
    System.out.println("el nombre es" + nombre);    

    System.out.println("ingrese el nuevo nombre");
    nombre=leer.nextLine();

    System.out.println("el nuevo nombre es " + nombre);
    nombre=leer.nextLine();

}

}


    
    