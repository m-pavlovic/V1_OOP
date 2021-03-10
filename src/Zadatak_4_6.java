import java.util.Scanner;

public class Zadatak_4_6 {

    public static void main(String[] args) {
        String prvi = "dobro";
        String drugi = "bolje";
        String treci = "najbolje";
        Scanner sc = new Scanner(System.in);
        System.out.println("Kako ste danas?");
        String unos = sc.nextLine();
        if(unos.equals(prvi)) {
            System.out.println("Hvala, danas sam: "+prvi);
        } else if(unos.equals(drugi)) {
            System.out.println("Hvala, danas sam: "+drugi);
        } else if(unos.equals(treci)) {
            System.out.println("Hvala, danas sam: "+treci);
        } else {
            System.out.println("Sigurno ce biti bolje! :)");
        }
        sc.close();
    }
}
