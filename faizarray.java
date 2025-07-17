import java.util.*;
public class faizarray {
    public static void main (String arg[]){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    System.out.println("enter the number in array = ");
    int [] numbers = new int[size];
    //input
    for(int i=0;i<size;i++){
        numbers[i]=sc.nextInt();
    
    }
    boolean isAccending=true;
    for(int i=0;i<size;i++){
        if(numbers[i]>numbers[i+1]){
            isAccending=false;
        }
        if(isAccending){
            System.out.println("the order is accending");

        }else{
            System.out.println("order is not accending");
        }
        }

        }
    }

    
    
