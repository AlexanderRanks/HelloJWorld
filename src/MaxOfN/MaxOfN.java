package MaxOfN;

import java.util.Scanner;

public class MaxOfN {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       int i=0;
       int max =0;
       do {

           System.out.print("Input number (0 to exit): ");
           i= Integer.valueOf (scanner.nextLine());
           if (i>0){
               if (i>max){
                 max=i;
               }
           }

       }while (i!=0);

        System.out.println("Max = " + max);
        scanner.close();

    }
}
