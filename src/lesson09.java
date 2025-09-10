public class lesson09 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int sayi;
        System.out.println("Enter a number:");
        sayi=scanner.nextInt();

        if(sayi%2==0)
            System.out.println("The number entered is even");

        else
            System.out.println("The number entered is odd");
    }
}
