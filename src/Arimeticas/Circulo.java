package Arimeticas;

public class Circulo extends Figura{
    private double radio;
    private double diametro=radio*2;
    
    public Circulo() {
    }
    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getDiametro() {
        return diametro;
    }
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    @Override
    public void calcularArea() {
        double area=3.1416*diametro;
    
        System.out.println("el radio del circulo es  " + radio + " y su diametro es  " + diametro+ " y su area es " + area);
        
    }


    
}
