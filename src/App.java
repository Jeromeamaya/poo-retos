import java.util.Scanner;

import Conceptos.Animal;
import Conceptos.Retozejm;
import Salud.Persona;
import Sena.Aprendiz;
import Sena.Jerome;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada=new Scanner(System.in);


        System.out.println("Hello, World!");
        /*
        // crear una instancio u objeto de una clase
        Aprendiz jerome=new Aprendiz();

    

        System.out.println("ingrese en numero de ficha del apendiz");
        jerome.ficha=leer.nextLine();

        System.out.println("ingrese el apellido del apendiz");
        jerome.apellido=leer.nextLine();
        
        System.out.println("ingrese el genero del apendiz");
        jerome.genero=leer.nextLine();

        System.out.println("la ficha del aprendiz es " + jerome.ficha + " el nombre aprediz es  " + jerome.apellido +  " y su genero es  " + jerome.genero );
        
 */

        Retozejm jerome=new Retozejm();

        jerome.pedirDatos();
        
        jerome.mostrarPersonal();
        
        jerome.calcularmc(0);
        jerome.mayorEdad();
        entrada.nextLine();
        
    }

}


