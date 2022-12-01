package Interfacez;

import java.util.Random;
import java.util.Scanner;

public class Caraysello implements Juego {
    Scanner entrada=new Scanner(System.in);
    private String nombre;
    private int eleccion;
    private int moneda;

    @Override
    public void iniciar() {
        // TODO Auto-generated method stub
        System.out.println( " ingrese el nombre del jugador" );
        nombre=entrada.nextLine();
    }

    @Override
    public void jugar() {
        // TODO Auto-generated method stub
        System.out.println( "escoge 1. para cara o 2. para sello ");
        eleccion=entrada.nextInt();
        System.out.println("moneda girando");
        Random  aleatorio=new Random();
        moneda=aleatorio.nextInt(2)+1;
    }

    @Override
    public void finalizar() {
        // TODO Auto-generated method stub
        if (moneda==1 && eleccion==1){
            System.out.println( "cayo cara, seleccionaste cara .. ganaste "+nombre);
        }
        else if (moneda==1 && eleccion==2) {
            System.out.println( "cayo sello, seleccionaste sello .. perdiste"+nombre);   
        }
        else if (moneda==2 && eleccion==2) {
            System.out.println( "cayo sello, seleccionaste sello .. ganaste "+nombre);
            
        }
        else if (moneda==2 && eleccion==1) {
            System.out.println( "cayo sello, seleccionaste cara .. perdiste"+nombre);
            
        }

        
    }
    
}
