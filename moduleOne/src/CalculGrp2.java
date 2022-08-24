public class CalculGrp2 {
    public static double racineCarree(double a){

        System.out.println(Math.sqrt(a));
        return a;

    }
    public static double sinus(double c, double b){

        // converting values to radians
         b = Math.toRadians(c);
        System.out.println(Math.sin(b));
        return b;
    }
public  static  double soustraction(int nb1, int nb2){

        int res;
        nb1 = 5;
        nb2 = 3;
        res = nb1 - nb2;
        return res;
}
}
