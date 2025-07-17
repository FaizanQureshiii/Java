import java.util.*;
public class arrayPractice {
    public static void main (String arg[]){
System.out.print("Enter the lenght of arreay = ");
Scanner sc=new Scanner (System.in);

int size=sc.nextInt();
int numbers[]=new int[size];
System.out.print("Enter the elements of array = ");
//input
for(int i=0;i<size;i++){
    numbers[i]=sc.nextInt();
}
//output
System.out.print("Enter the number you want to find ");
int x=sc.nextInt();
for(int i=0;i<size;i++){
    if(numbers[i]==x){
        System.out.println(i);
    }
    
}


    }
}
