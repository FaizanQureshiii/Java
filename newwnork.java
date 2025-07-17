import java.util.Scanner;

public class newwnork {
    
    public static double CalculatePower(double x,int n){
        if(n==0){
            return 1;
        }else if(n>0){
            double result=1;
            for(int i=1;i<0;i++){
                result*=x;
                return result;
            }
            return result;
        }
            else{
                n=-n;
                double result =1;
                for(int i=1;i<n;i++){
                    result *=x;
                    return result;
                }
                return 1/ result; 
            }
                
                }

            

            
            

            
            
         

    
    public static void main (String arg[]){
       Scanner sc=new Scanner(System.in);
       double x=sc.nextDouble();
       int n =sc.nextInt();
     double answer=CalculatePower(x,n);
     System.out.println(answer);




    }
}
