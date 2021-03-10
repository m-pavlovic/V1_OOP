import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_4_2 {

    public static void main(String[] args) {
        int N;
        int cntr;
        long sum = 0;
        try {
            while (sum <= Integer.MAX_VALUE) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Unesite N: ");
                N = sc.nextInt();

                for (cntr = 1; cntr <= N; cntr++) {
                    sum = sum + cntr;
                }

                System.out.println("Suma prvih " + N + " brojeva iznosi: " + sum);

                sc.reset();
            }
        } catch (InputMismatchException imaxvl) {
            System.out.println("Uneseni broj premasuje maksimalnu vrijednost integera.");

        }
    }
}
