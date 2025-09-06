public class lesson5
{
    public static void main(String[] args)
    {
        int n =5;
     switch (n){
         case 1:
             System.out.println("Monday");
             break;
             case 2:
                 System.out.println("Tuesday");
                 break;
                 case 3:
                     System.out.println("Wednesday");
                     break;
                     case 4:
                         System.out.println("Thursday");
                         break;
                         case 5:
                             System.out.println("Friday");
                             break;
                             case 6:
                                 System.out.println("Saturday");
                                 break;
                                 case 7:
                                     System.out.println("Sunday");
                                     break;
                                     default:
                                         break;

     }

     String day = "Monday";
     switch (day){
         case "Saturday":
             System.out.println("6 AM");
             break;
             case "Sunday":
                 System.out.println("7 AM");
                 break;
                 case "Monday":
                     System.out.println("8 AM");
                     break;
                     default:
                         System.out.println("9 AM");
                         break;
     }

    String month = "July";
     switch (month){
         case "January","March","April","May":
             System.out.println("5th day");
             break;
         case "July","August","September","October":
             System.out.println("6th day");
             break;
             default:
                 System.out.println("9th day");
                 break;
     }
     String day1 = "Monday";
     switch (day1){
         case "Monday","Wednesday","Thursday","Friday"-> System.out.println("7AM");
         case "Sunday","Saturday"-> System.out.println("8AM");
         default ->  System.out.println("9AM");
     }
     String month1 = "August";
     String result="";
     result =switch (month1){
         case "January","March","April","May": yield "6th day";
         case "Octaber","Auguust":yield "7AM";
         case "September","October":yield "8AM";
         default:yield "9AM";
     };

    }
}
