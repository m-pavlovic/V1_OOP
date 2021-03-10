import java.util.Scanner;

public class Primjer_3_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite realni broj: ");
        float rnum = sc.nextFloat();
        double res;
        if(rnum < 0){
            res = Math.abs(rnum);
            System.out.println("Apsolutna vrijednost je: " + res);
        } else if(rnum > 0){
            res = Math.cbrt(rnum);
            System.out.println("Kubni korijen je: " + res);
        } else {
            System.out.println("Unijeli ste nulu!");
        }
        sc.close();

    }
}
