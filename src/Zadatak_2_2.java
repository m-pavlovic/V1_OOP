import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Zadatak_2_2 {

    public static void main(String[] args) {
        int x = 14;
        int y = 7;
        System.out.println(x +" + " +y+ " = " + (x+y));
        System.out.println(x +" - " +y+ " = " + (x-y));
        System.out.println(x +" * " +y+ " = " + (x*y));
        System.out.println(x +" % " +y+ " = " + (x%y));
        System.out.println(x +" / " +y+ " = " + (x/y));
        System.out.println("Kvadratni korijen od "+x+" je: "+sqrt((float) x));
        System.out.println("Apsolutna vrijednost od "+y+" je: "+abs((float) y));

    }
}
