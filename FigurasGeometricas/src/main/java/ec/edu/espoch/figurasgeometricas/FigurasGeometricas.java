/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.figurasgeometricas;

import Rectangulos.RectangulosP;
import Rectangulos.Triangulos;

/**
 *
 * @author USUARIO
 */
public class FigurasGeometricas {

    public static void main(String[] args) {

        RectangulosP objrectangulos = new RectangulosP(4.7, 5.7);

        objrectangulos.imprimir();

        Triangulos objtriangulos = new Triangulos(4.2, 4.1);

        objtriangulos.imprimir();

    }
}