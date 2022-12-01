package Principal;

import java.util.Scanner;
import Salud.Persona;
import Salud.Persona1;
public class Inicio {

    public static void main(String[] args) throws Exception {

        Scanner entrada=new Scanner(System.in);
 
        Persona jerome=new Persona();

        jerome.pedirDatos();
        
        jerome.mostrarPersonal();
        
        jerome.calcularMc();
        jerome.mayorEdad();
        entrada.nextLine();
        
    }
    

    }   
   /*
         Persona1 jerome=new Persona1();
        jerome.pedirDatos();
        jerome.mostrarPersonal();
        jerome.nuevoNombre();
        jerome.nuevoNombre( " luisa", "amaya");


}    */


