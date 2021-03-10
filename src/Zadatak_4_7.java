import java.util.Scanner;

public class Zadatak_4_7 {

    public static void main(String[] args) {
        String prvi = "dobro";
        String drugi = "bolje";
        String treci = "najbolje";
        Scanner sc = new Scanner(System.in);
        System.out.println("Kako ste danas? ");
        String unos = sc.nextLine();

        switch(unos) {
            case "dobro":System.out.println("Hvala danas sam: "+prvi);
                break;
            case "bolje":System.out.println("Hvala danas sam: "+drugi);
                break;
            case "najbolje":System.out.println("Hvala danas sam: "+treci);
                break;

            default: System.out.println("Sigurno će biti bolje! :)");
                break;

        }
        sc.close();
    }

}
