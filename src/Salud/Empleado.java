package Salud;

import java.util.Scanner;

public class Empleado extends Persona {
    private String cargo;
    private String departamento;
    private int valorhora;
    private int horastrabajadas;
    private double honorarios;


    Scanner entrrada=new Scanner(System.in);


    
    public  Empleado() {
        
    }   
    public  Empleado(String cargo, String departamento, int valorhora , int horastrabajadas,String nombre, String apellido, String tipodoc, int documento) {
        super (nombre,apellido,tipodoc,documento);
        this.cargo=cargo;
        this.departamento=departamento;
        this.valorhora=valorhora;
        this.horastrabajadas=horastrabajadas;
        
    }
    //metodos 
    public void calcularHonorarios() {
        System.out.println("ingrese el departemento donde labora el empleado");
        departamento=entrada.nextLine();
        System.out.println(" ingrese la cantidad de horas laboradas ");
        horastrabajadas=entrada.nextInt();
        System.out.println("ingrese el valor de la hora del empleado ");
        valorhora=entrada.nextInt();
        honorarios= (valorhora*horastrabajadas)-(valorhora*horastrabajadas*(0.966));

        System.out.println( " el tipo de documento es "+ getTipoDoc() + " con numero de documneto " + getDocumento() + " con nombre " + getNombre()+ "y apellido "+ getApellido()+ " trabaja en el departamento" + cargo + " trabajo " + horastrabajadas + " horas que tiene un valor por hora de " + valorhora + " y su total devengado sera " + honorarios  );

    }
}
