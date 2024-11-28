/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rectangulos;

/**
 *
 * @author USUARIO
 */
public class Circulos {

    double pi = 3.14159265358979;

    public double radio;
    public double area;

    public Circulos(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return (radio * radio) * pi;
    }

    public double calcularPerimetro() {
        return (2 * radio * pi);
    }

    public void imprimir() {
        System.out.println(" ");
        System.out.println("Circulo");
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
