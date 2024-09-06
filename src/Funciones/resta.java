package Funciones;

public class resta {
    private double numero1;
    private double numero2;
    public resta(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public double calcular() {
        return numero1 - numero2;
    }
}
