import java.util.Scanner;

public class Zadatak_4_4 {

    public static void main(String[] args) {

        boolean flag = true;
        while (flag) {
            System.out.println("Unesite neki proizvoljni niz: ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println("Unijeli ste: " + str);
            boolean secFlag = true;
            while (secFlag) {
                System.out.println("Ako zelite ponoviti unos pritisnite: y ");
                Scanner scF = new Scanner(System.in);
                String strF = scF.next();
                if (!strF.equals("y")) {
                    System.out.println("Izabrali ste izlaz iz programa!");
                    flag = false;
                }
                secFlag = false;
                scF.reset();
            }

            sc.reset();

        }

    }


}