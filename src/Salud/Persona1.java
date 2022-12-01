package Salud;
import java.util.Scanner;

public class Persona1 {

    Scanner entrada=new Scanner(System.in);
    private String tipoDoc;
    private String nombre;
    private String apellido;
    private String sexo;
    private int documento;
    private int peso;
    private int edad;
    private double estatura;
    private double pesoActual=0;
    private String cargo;
    private int valorhora;
    private int horastrabajadas;
    private String departamento;
    


        // metodos constructores//

    public Persona1 (){

    }
    
    public Persona1 (String tipoDoc, String nombre, String apellido, String sexo, int documento, int peso, int edad,
        double estatura, double pesoActual) {
        this.tipoDoc = tipoDoc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.documento = documento;
        this.peso = peso;
        this.edad = edad;
        this.estatura = estatura;
        this.pesoActual = pesoActual;
    }
    
    public void pedirdatos(){
        

    }

    // metodos accesores

    public String getTipoDoc(){
        return tipoDoc;
    }
    public void setTipoDoc(String tipodoc){
        this.tipoDoc=tipoDoc;

    }

    public String getNombre(){
        return nombre;
    }
    public void  setNombre (String nombre) {
        this.nombre=nombre;
        
    }

    // metodos propios 


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

    public void calcularmc() {
        pesoActual=peso/(estatura)*2;
        if (pesoActual < 20 ){
            System.out.println("el peso por debajo de lo ideal");
        }

        else if (pesoActual >= 20 && pesoActual< 25  ){
            System.out.println(" el peso es ideal ");

        }
        else if (pesoActual >25 ){
            System.out.println("usted esta en sobre peso");
        }

        }
        
    public void mayorEdad() {

        if (edad >= 18){
            System.out.println("eres mayor de edad");
        }
        else if (edad <18){
            System.out.println("eres menor de edad");
        }
        
    }
    
    public void  nuevoNombre(){
        System.out.println( "el  nombre es "  + nombre + " el apellido  " + apellido );

    }
    
    public void nuevoNombre(String nombre , String apellido ){
        System.out.println("el nuevo nombre es" + nombre + " el apellido nuevo es " + apellido );
    }



        
    

}



