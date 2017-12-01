import java.util.Scanner;

public class DiamondName {

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int no=scanner.nextInt();
            printAsterisks(no);

        }

        private static void printAsterisks(int n) {

            int space = n - 1;
            for (int i = 1; i < n; i++) {
                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                space--;
                System.out.println();
            }
            System.out.println("NANDHA");
            space = 1;
            for (int i = 1; i <= n - 1; i++) {
                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * (n - i) - 1; k++) {
                    System.out.print("*");
                }
                space++;
                System.out.println();
            }


        }
}
