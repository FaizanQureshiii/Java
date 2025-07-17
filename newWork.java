import java.util.*;
import java.lang.Math;
public class newWork {
    public static double CalculateMath(double x,double n){
        double result=x ^ 5n;
        return result;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double n=sc.nextDouble();
        double answer=CalculateMath(x, n);
        System.out.println(answer);
    }

}
