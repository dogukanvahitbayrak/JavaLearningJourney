
class Calculator{

    public int Add(int a,int b) {
        System.out.print("result :");
        return a+b;
    }
    public int Subtract(int a,int b) {
        System.out.print("result :");
        return a-b;
    }
    public int Multiply(int a,int b) {
        System.out.print("result :");
        return a*b;
    }
    public int Divide(int a,int b) {
        System.out.print("result :");
        return a/b;
    }
}

public class lesson10_calculator {
    public static void main(String[] args) {

int a=15;
int b=5;
Calculator c=new Calculator();
c.Add(a,b);
        System.out.println(c.Add(a,b));
        c.Subtract(a,b);
        System.out.println(c.Subtract(a,b));
        c.Multiply(a,b);
        System.out.println(c.Multiply(a,b));
        c.Divide(a,b);
        System.out.println(c.Divide(a,b));

    }
}
