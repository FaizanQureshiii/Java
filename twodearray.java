import java.util.*;
public class twodearray  {
         public static void main(String arg[]){
         Scanner sc=new Scanner(System.in);
         int rows=sc.nextInt();
         int col=sc.nextInt();
         int[][] numbers=new int[rows][col];
         for(int i=0;i<rows;i++){
         for(int j=0;j<col;j++){
            numbers[i][j]=sc.nextInt();
        
        
        }
        }
        for(int i =0;i<rows;i++){
            //System.out.println();
        for(int j=0;j<col;j++){
        System.out.println(numbers[i][j] + " ");
    }
    }
   // System.out.println();
}
}