import java.util.*;
    public class Sevenclass{
        public static void CalculateFictorial(int n){
            int fictorial=1;
             if(n<0){
                System.out.println("invalid number");
                return;
             }
             for(int i=n;i>=1;i--){
                fictorial=fictorial*i;
            }
            System.out.println(fictorial);
            return;
        }
        
        
       public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        int fictorial=sc.nextInt();
        CalculateFictorial(fictorial);
         }
        }
    

