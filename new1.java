import java.util.*;
public class new1 {
    public static void main (String arg[]){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int [] numbers = new int[size];
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
   //input
    for(int i=0;i<size;i++){
        numbers[i]=sc.nextInt();
    }
    for(int i=0;i<size;i++){
        if(numbers[i]>max){
            max =numbers[i];
        }
        if(numbers[i]<min){
            min=numbers[i];
        }
        System.out.println("the greatest number is = " + max);
        System.out.println("the smallest number is = " + min);
    }
    
    
    
    }
    }

