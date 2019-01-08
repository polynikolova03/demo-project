import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = input.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 1 + i; j <= a + i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
