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
public class Lingkaran extends Shape2D{
    
    double Luas(double r){
        return Math.PI*r*r;
    }
    double Keliling(double r){
        return 2*Math.PI*r;
    }

    @Override
    void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    void identitas(){
        System.out.println("Rumus Keliling lingkaran adalah 2*PI*r");
    }
}
