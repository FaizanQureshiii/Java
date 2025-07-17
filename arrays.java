import java.util.*;
public class arrays {
public static void main(String arg[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("enter the lenght of array = ");
     int size=sc.nextInt();
     System.out.println();
     int[] numbers =new int[size];
     //input 
     for (int i=0;i<size;i++){
        numbers[i]=sc.nextInt();
        }
         System.out.println("enter the value of x = "); 
        int x=sc.nextInt();
         //output
          for(int i=0;i<size;i++){
          if(numbers[i]==x){
           System.out.println("the value of x = " + i);
        }
    }


}
}
