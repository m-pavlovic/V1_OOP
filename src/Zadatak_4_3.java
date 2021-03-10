import java.util.Scanner;

public class Zadatak_4_3 {

    public static void main(String[] args) {
        int N = 0;
        while (N != 158) {
            System.out.println("Unesite neki broj: ");
            Scanner sc = new Scanner(System.in);
            N = sc.nextInt();
            System.out.println("Upisali ste "+N);

            sc.reset();
        }
        System.out.println("Bravo! Unesena je trazena vrijednost!");
    }
}
