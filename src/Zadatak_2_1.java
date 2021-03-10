import java.util.Scanner;
import static java.lang.Math.pow;


public class Zadatak_2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki broj: ");
        double k = sc.nextDouble();
        System.out.println("Kvadrat unesenog broja je: " + pow(k,2)+ "\nKub unesenog broja je: " + pow(k,3));


        sc.close();

    }
}
