import java.util.Scanner;

public class Zadatak_4_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neku vrijednost: ");
        int N = sc.nextInt();
        switch(N) {
            case 10: System.out.println("Vrijednost je: " + N); break;
            case 100: System.out.println("Vrijednost je: " + N); break;
            case 155: System.out.println("Vrijednost je: " + N); break;
            default: System.out.println("Niste naveli vrijednost za niti jedan slucaj!");
        }
        sc.close();
    }
}
