package shape2d;

public class Prisma extends Limas{
    double Luas(double t, double a1, double a2, double a3, double La){
      return t*(a1+a2+a3) + (2*La);
    }
    double Volume(double La, double t){
      return La*t;
    }
}
