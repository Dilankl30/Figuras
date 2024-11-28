/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rectangulos;

/**
 *
 * @author USUARIO
 */
public class RectangulosP {

    public double altura;
    public double base;

    public RectangulosP(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public void imprimir() {

        System.out.println("Rectangulo: ");
        System.out.println("Area : " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

}
