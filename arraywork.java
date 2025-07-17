import java.util.*;
public class arraywork {
    public static void mai(String arg[]){
        Scanner sc=new Scanner(System.in);
        int size =sc.nextInt();
        int [] numbers=new int[size];
        
        //int max=Integer.MIN_VALUE;
        //int min=Integer.MAX_VALUE;
        
        
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();

        }
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for (int i=0;i<size;i++){
            if(numbers[i]>max){
                max=numbers[i];
           }
             if(numbers[i]<min){
                min=numbers[i];
            }
            System.out.println(max);
            System.out.println(min);

        }
    }
}
    

