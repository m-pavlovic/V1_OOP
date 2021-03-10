import java.util.Scanner;

public class Zadatak_3_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite cjelobrojni broj: ");
        if(sc.hasNextInt()) {
            System.out.println("Uneseni broj je cijelobrojni.");
        } else {
            System.out.println("Unos nije cijelobrojni broj!");
        }


    }
}