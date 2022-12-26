/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape2d;

/**
 *
 * @author Ferr
 */
public class Segitiga extends Shape2D{
    @Override
    double Luas(double a, double t){
        return 0.5*(a*t);
    }

    @Override
    void print() {
        System.out.println("Rumus Segitiga_____");
    }
}
