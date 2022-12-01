package Interfacez;
import java.util.Random;
import java.util.Scanner;

public class Reto5 implements Ejecucion {
  
    
        Scanner entrada=new Scanner(System.in);
        private int opcion;
        private int  tijera=2;
        private double piedra=1;
        private double papel=3;
        private int op;
        private String nombre;
            
            

  
    @Override
    public void iniciar() {
        // TODO Auto-generated method stub
        System.out.println("por favor ingresa el nombre del jugador ");
        nombre=entrada.nextLine();
        Random  aleatorio=new Random();
        opcion=aleatorio.nextInt(3)+1;
    }
    



    @Override
    public void jugar() {
        // TODO Auto-generated method stub
        System.out.println("por favor escoga la opcion deseada \n 1.tijera \n 2.piedra \n 3. papel");
        op=entrada.nextInt();
    }

    @Override
    public void finalizar() {
        // TODO Auto-generated method stub
        
        if (op== piedra && opcion== 2){
            System.out.println("ganaste");
        }
        else if (op== tijera && opcion==3){
            System.out.println("ganaste");
        }
        else if (op== papel && opcion==2){
            System.out.println("perdiste");
        }
        else if (op== tijera && opcion==1){
            System.out.println("perdiste");
        }
        else if (op== papel && opcion==2){
            System.out.println("perdiste");
        }
        else if (op==opcion){
            System.out.println("empate");
        }
        
        
    }
    
}

    

