package shape2d;

public class Kerucut extends Shape3D{
  // double Luas(double r, double s){
  //   return (Math.PI*r*r) + (Math.PI*r*s);
  // }
    //  Rumus di atas sama aja kayak di bawah
  double Luas(double r, double s){
    return Math.PI*r*(r+s);
  }
  double Volume(double r, double t){
    return 0.3333*Math.PI*Math.pow(r, 2)*t;
  }
}
