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
public class Balok extends Shape3D{
    
    double Luas(double p, double l, double t){
        return 2 * (p*l + l*t + p*t);
    }
    double Keliling(double p, double l, double t){
        return 4* (p+l+t);
    }
    double Volume(double p, double l, double t){
        return p*l*t;
    }
}
