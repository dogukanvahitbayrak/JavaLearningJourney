public class lesson4
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 2;
        int result =a+b;
           if (a<b){
               System.out.println(result);
           }
        int c=15,v=30;
        int   result1 = v-c;

        if (c<v && v>20)
        {
        System.out.println(result1);

        }
        else if(c<17)
       {
        System.out.println(result1-25);
       }
        else
        {
            System.out.println(result1-5);
        }
        int n =27;

       int result2 = n%2 == 0 ? 10:20;
        System.out.println(result2);

    }
}
