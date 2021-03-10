public class Primjer_4_4 {

    public static void main(String[] args) {
        int val = 300;
        do {
            val += 10;
            System.out.println("Value is: " + val);
        } while(val < 310);
        System.out.println("Some output after do-while loop!");
    }
}
// nedostatak do-while petlje je sto se izlaz ispise, barem jednom, iako uvjet nije zadovoljen
// odnosno po izlazu ovog koda reklo bi se da je uvjet val <= 310, sto zapravo nije slucaj.