package Conceptos;


import java.util.Scanner;

public class Retozejm {

    
    
        
    
    Scanner entrada=new Scanner(System.in);
    public String tipoDoc;
    public String nombre;
    public String apellido;
    public String sexo;
    public int documento;
    public int peso;
    public int edad;
    public double estatura;
    public double pesoActual=0;
    
    public void pedirDatos() {

        System.out.println("ingrese el nombre ");
        nombre=entrada.nextLine();
        System.out.println("ingrese el Apelido ");
        apellido=entrada.nextLine();
        System.out.println("ingrese el tipo de documento ");
        tipoDoc=entrada.nextLine();
        System.out.println("ingrese el documento ");
        documento=entrada.nextInt();
        System.out.println("ingrese edad");
        edad=entrada.nextInt();
        System.out.println("ingrese el peso ");
        peso=entrada.nextInt();
        System.out.println("ingrese el estatura ");
        estatura=entrada.nextDouble();
        entrada.nextLine();
        
    }

    public void mostrarPersonal() {

        System.out.println("el nombre completo es  " +nombre + " "+ apellido );
        System.out.println(" con tipo de documento " + tipoDoc + " "+ documento );
        System.out.println(" tiene una edad de " + edad +  " con un peso de " + peso );
        System.out.println(" una estatura de " + estatura);

        
    }

    public String calcularmc(int resultado) {
        
        pesoActual=peso/(estatura)*2;
        
        if (pesoActual < 20 ){
                        if (resultado < 20 ){
                System.out.println("pesobajo");
            }
        }

        if (pesoActual >= 20 && pesoActual< 25  ){
    
             if (resultado >= 20 && resultado < 25 ){
                System.out.println("peso ideal ");
            }

        }
        if (pesoActual >25 ){
            if (resultado > 25 ){
                System.out.println("sobrepeso");
            }
        }
        return calcularmc(resultado);
        }
    
    public void mayorEdad() {

        if (edad >= 18){
            System.out.println("eres mayor de edad");
        }
        else if (edad <18){
            System.out.println("eres menor de edad");
        }
        
    }
        
    

}

        
    




    

