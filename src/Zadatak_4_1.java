import java.util.Scanner;

public class Zadatak_4_1 {

    public static void main(String[] args) {
        int r = 0;
        while(r <= 10){
            System.out.println("Unesite neki radijus (za prekid veci od 10): ");
            Scanner sc = new Scanner(System.in);
            r = sc.nextInt();
            double volume = (4.0/3)*Math.PI*Math.pow(r, 3);
            System.out.println("Ovo je volumen za uneseni radijus: " + volume);

            sc.reset();
        }
    }
}
