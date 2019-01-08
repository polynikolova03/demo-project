import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n - 1 - i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) + 1; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < n - 1 - i ; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
                System.out.print(" ");
            }


        }




