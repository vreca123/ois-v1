public class Gravitacija{
    public static void main(String[] args){
        System.out.println("OIS smrdi!");
    }
	
	public static double gravitacija(double visina) {
	    final double GRAVITACIJSKA_KONSTANTA = 6.674 * Math.pow(10, -11);
	    final double MASA_ZEMLJE = 5.972 * Math.pow(10, 24);
	    final double POLMER_ZEMLJE = 6.371 * Math.pow(10, 6);

	    return ((GRAVITACIJSKA_KONSTANTA * MASA_ZEMLJE) / Math.pow((POLMER_ZEMLJE + visina), 2));
}
}