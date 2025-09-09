public class lesson08 {
    public static void main(String[] args) {

        int i,j,k;
        for (i=1; i<10; i++) {
            for (j = i; j < 10; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
         int a,b,c;
            for (a=10; 0<a; a--) {
                for(b=a; b<10;b++) {
                    System.out.print(" ");
                }
                for (c=1; c<=a; c++) {
                    System.out.print("*");
                    System.out.print(" ");
                }
                System.out.println(" ");
            }

    }
}
