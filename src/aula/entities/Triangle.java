package aula.entities;

public class Triangle {

    public double a;
    public double b;
    public double c;

    // calulando a area do triangulo
    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
