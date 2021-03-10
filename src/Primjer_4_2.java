public class Primjer_4_2 {

    public static void main(String[] args) {

        int sum = 0;
        int n = 15;

        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }

        System.out.println("Suma prvih n = " + n + " prirodnih brojeva: " + sum);
    }
}
