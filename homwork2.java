import java.util.*;
public class homwork2 {
    public static void main(String arg[]){
// Print upper part of the butterfly
int n=5;
for (int i = 1; i <= n; i++) {
  for (int j = 1; j <= i; j++) {
      System.out.print("*");
  }
  for (int j = 1; j <= 2 * (n - i); j++) {
      System.out.print(" ");
  }
  for (int j = 1; j <= i; j++) {
      System.out.print("*");
      if (j < i) {
          System.out.print(" "); // Add space between inner stars
      }
  }
  System.out.println();
}

// Print lower part of the butterfly
for (int i = n; i >= 1; i--) {
  for (int j = 1; j <= i; j++) {
      System.out.print("*");
  }
  for (int j = 1; j <= 2 * (n - i); j++) {
      System.out.print(" ");
  }
  for (int j = 1; j <= i; j++) {
      System.out.print("*");
      if (j < i) {
          System.out.print(" "); // Add space between inner stars
      }
  }
  System.out.println();
}


}
}
