/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rectangulos;

/**
 *
 * @author USUARIO
 */
public class Triangulos {

    public double base;
    public double altura;

    public Triangulos(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void imprimir() {
        System.out.println(" ");
        System.out.println(" Triangulo:");
        System.out.println("Area:" + AreaTri());
        System.out.println("Perimetro:" + PeriTri());
        System.out.println("El tipo de triangulo es : " + TipoTri());
    }

    public double AreaTri() {
        return (base * altura) / 2;
    }

    public double HipoTri() {
        return Math.sqrt(base * (base) + altura * (altura));
    }

    public double PeriTri() {
        return 2 * (base + altura);
    }

    public String TipoTri() {
        if (base == altura && altura == HipoTri()) {
            return "Equilatero";
        } else {
            if (base == altura || base == HipoTri() || altura == HipoTri()) {
                return "Isosceles";
            } else {
                return "Escaleno";
            }
        }

    }

}
