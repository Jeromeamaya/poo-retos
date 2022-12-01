import java.util.Scanner;

import Sena.Aprendiz;

public class Ficha {
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    
    Aprendiz jerome=new Aprendiz();
    
    // asignar un valor al atributo 
    jerome.ficha="2557881";

    Aprendiz juan=new Aprendiz();
    juan.genero="masculino";


    System.out.println("ingresa la ficha ");
    jerome.ficha=entrada.nextLine();
        
    
    }
    
}
