/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rectangulos;

/**
 *
 * @author USUARIO
 */
public class Cuadrados {

    public double lado;

    public Cuadrados(double lado) {
        this.lado = lado;

    }

    public void imprimir() {
        System.out.println(" ");
        System.out.println("Cuadrado       :");
        System.out.println("Area del cuadrado: " + cuaArea());
        System.out.println("Perimetro:  " + calcP());
    }

    public double calcP() {
        return lado * 4;
    }

    public double cuaArea() {
        return lado * 2 + lado * 2;
    }
}
