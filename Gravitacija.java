import java.util.*;

public class Gravitacija{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(pospesek(sc.nextDouble());
    }
    public double pospesek(double visina){
        final double KONSTANTA = 6.674 * Math.pow(10, -11);
        final double MASA_ZEMLJE = 5.972 * Math.pow(10, 24);
        final double POLMER_ZEMLJE = 6.371 * Math.pow(10, 6);
        return(KONSTANTA * MASA_ZEMLJE) / Math.pow(POLMER_ZEMLJE + visina, 2);
    }
}
