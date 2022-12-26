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
public class Limas extends Shape3D {
    double Lals, as, ts, a1, a2, a3, t1, t2, t3;
    // Lals = Luas alas
    // a1 = alas segitiga ke1
    // a2 = alas segitiga ke2
    // a3 = alas segitiga ke3
    // t1 = tinggi segitiga ke1
    // t2 = tinggi segitiga ke2
    // t3 = tinggi segitiga ke3

    double Luas(double as, double ts, double a1, double a2, double a3, double t1, double t2, double t3){
        double Lals = 0.5*as*ts;
        double Lsgt1 = 0.5*a1*t1;
        double Lsgt2 = 0.5*a2*t2;
        double Lsgt3 = 0.5*a3*t3;

        return Lals + Lsgt1 + Lsgt2 + Lsgt3;
    }
    double Volume(double as, double ts, double t){
        return 1/3 * (0.5*as*ts)*t;
    }
}
