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
public class limasSegtigaSamaSisi implements Rumus{

    @Override
    public double keliling(double x, double y, double z) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double keliling(double x, double y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double keliling(double x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double luas(double x, double y, double z) {
        double x2 = Math.sqrt(Math.pow(0.5 * x, 2) - Math.pow(x, 2));
        return 0.5 * x * x2 * x * z * 3;
    }

    @Override
    public double volume(double x, double y, double z) {
        double x2 = Math.sqrt(Math.pow(0.5 * x, 2) - Math.pow(x, 2));
        return 0.5 * x * x2 * 0.5 * y;
    }

    @Override
    public double luas(double x, double y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double luas(double x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public double volume(double x, double y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double volume(double x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
