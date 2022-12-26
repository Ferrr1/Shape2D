package shape2d;

public class Bola extends Shape3D{
  @Override
  double Luas(double r){
    return 4*Math.PI*Math.pow(r, 2);
  }
  double Volume(double r){
    return 4/3*Math.PI*Math.pow(r, 3);
  }
}
