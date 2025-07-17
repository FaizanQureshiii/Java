import java.util.*;
public class Secondhomework {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number =");
        double a = sc.nextDouble();
        System.out.print("enter a second number =");
        double b =sc.nextDouble();
        System.out.println("enter a operator,+,-,*,/");
        char operation = sc.next().charAt(0);
        switch(operation){
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;
            case '%':System.out.println(a%b);
            break;
            default:System.out.println("invalid operator");
        }

    }



    }
    
    

