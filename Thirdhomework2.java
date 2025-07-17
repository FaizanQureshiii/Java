import java.util.*;
public class Thirdhomework2 {
    public static void main(String arg[]){
        System.out.println("plz enter a number 0,1");
        Scanner sc=new Scanner(System.in);
        int i =sc.nextInt();
        
        int n=0;
       if(i==0){
        System.out.println("invalid");
    }
    else if(i==1){
        System.out.println("enter nymber");
     }
     int z =sc.nextInt();
     if(z>=90){
        System.out.println("good marks");
     }
     else if(z<89 && z>60){
        System.out.println("thats also good");
     }
     else if(z<=59 && z>=0){
        System.out.println("these marks are also good");
     }
    
    }

    }

    
