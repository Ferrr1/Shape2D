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
public class Shape3D {
    double s,p,l,t;
    double Luas(double s){
        return 6*(s*s);
    }
    double Keliling(double s){
        return 12*s;
    }
    double Volume(double s){
        return Math.pow(s, 3);
    }
}
