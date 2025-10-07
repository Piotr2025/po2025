import java.util.Scanner;

public class choinka {
    public static void main(String[] args) {
        System.out.println("Podaj ile gwiazdek");
        Scanner scan = new Scanner(System.in);
        int stars = scan.nextInt();

        for (int w = 0; w < stars; w++) {
          
            for (int i = stars - w - 1; i > 0; i--) {
                System.out.print(" ");
         }
           
            for (int j = 0; j <= w; j++) {
                System.out.print("*");
         }
            System.out.println();
      }
        scan.close();
   }
}