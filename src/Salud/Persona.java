package Salud;

import java.util.Scanner;

public class Persona {
    Scanner entrada=new Scanner(System.in);
    private String tipoDoc;
    private String nombre;
    private String apellido;
    private String sexo;
    private int documento;
    private int peso;
    private int edad;
    private double pesoActual=0;
    private double estatura;

   




    // getter y setters

    public Persona() {
    }
    


    public Persona(String tipoDoc, String nombre, String apellido, int documento) {
        this.tipoDoc = tipoDoc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }
    


    public Persona(Scanner entrada, String tipoDoc, String nombre, String apellido, String sexo, int documento,
            int peso, int edad, double estatura) {
        this.entrada = entrada;
        this.tipoDoc = tipoDoc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.documento = documento;
        this.peso = peso;
        this.edad = edad;
        this.estatura = estatura;
    }



    public void pedirdatos(){
        

    }
    public Scanner getEntrada() {
        return entrada;
    }
    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    
     // Metodo Propio//

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
        
        
    }
    

    
    public void mostrarPersonal() {

        System.out.println("el nombre completo es  " +nombre + " "+ apellido );
        System.out.println(" con tipo de documento " + tipoDoc + " "+ documento );
        System.out.println(" tiene una edad de " + edad +  " con un peso de " + peso );
        System.out.println(" una estatura de " + estatura);    
    }

   
   
    public double calcularMc() {
        pesoActual=peso/(estatura)*2;
        
       

        if (pesoActual < 20 ){
            System.out.println("pesoActual");
            
        }

        else if (pesoActual >= 20 && pesoActual< 25  ){
            System.out.println("pesoActual");

        }
        else if (pesoActual >25 ){
            System.out.println(" sobrepeso");
        }  
        return pesoActual;
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

