package shape2d;

public class Tabung extends Shape3D{
  double Luas(double r, double t){
    return 2*Math.PI*r*(r+t);
  }
  double Volume(double r, double t){
    return Math.PI*Math.pow(r, 2)*t;
  }
}
