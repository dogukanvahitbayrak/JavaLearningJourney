import java.sql.PreparedStatement;

class Calculator{

        public int Add(int a,int b) {
            int result =a+b;
            System.out.println("result:"+result);
            return a+b;
        }
        public int Add(int a,int b,int c)
        {
            int result =a+b+c;
            System.out.println("result:"+result);
            return a+b+c;
        }
        public double Add(double a,int b){
        double result =a+b;
            System.out.println("result:"+result);
        return a+b;
        }
        public int Subtract(int a,int b) {
        int result =a-b;
        System.out.println("result:"+result);
        return a-b;

        }
        public int Multiply(int a,int b) {
        int result =a*b;
        System.out.println("result:"+result);
        return a*b;
        }
        public int Multiply(int a,int b,int c){
        int result =a*b*c;
        System.out.println("result:"+result);
        return a*b*c;
        }

        public int Divide(int a,int b) {
        int result =a/b;
        System.out.println("result:"+result);
        return a/b;
    }
}

public class lesson10_calculator {
    public static void main(String[] args) {

int    a=15;
int    b=5;
int    e=5;
double d=1.0;

Calculator c=new Calculator();
        c.Add(a,b);

        c.Add(a,b,e);

        c.Add(d,e);

        c.Subtract(a,b);

        c.Multiply(a,b);

        c.Multiply(a,b,e);

        c.Divide(a,b);



    }
}
