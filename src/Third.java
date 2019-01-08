import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = input.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("/");
            }
            for (int l = 0; l < i + 1; l++) {
                System.out.print("\\");
            }
            for (int m = 0; m < a - 1 - i; m++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = a - 1; i >= 0; i--) {
            for (int j = a - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = i + 1; k > 0; k--) {
                System.out.print("\\");
            }
            for (int l = i + 1; l > 0; l--) {
                System.out.print("/");
            }
            for (int m = a - 1 - i; m > 0 ; m--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
