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
public abstract class Shape2D extends Shape{

    double p,l,t;
        
        double Luas(double p, double l){
            return p*l;
    }
        double Keliling (double p, double l){
            return 2*(p+l);
        }
    
    
}
