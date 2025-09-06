public class Main{
    public static void main(String[] args) {
        int v = -1;
        double q = v < 0 ? Math.sqrt(15) : null;
        System.out.printf("\n%f\n", q);

        int count = 20;
        int h = count % 10 == 0 ? 3 : null;
        System.out.printf("%d\n", h);

        int m = 1;
        int z = m != 0 ? (int) Math.round(4.67) : null;
        System.out.printf("%d\n", z);

        int x = 0;
        int i = x >= 0 ? 7 : 8;
        System.out.printf("%d\n", i); 
    }
}