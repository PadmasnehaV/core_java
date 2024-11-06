public class  ebbillcalculator{
    public static void main (String[] args)
    {
        int unitconsumed = 250;
        double billamount = 0;
        double rate1 = 1.50;
        double rate2 = 2.00;
        double rate3 = 3.00;
        if(unitconsumed <=100)
        {
            billamount = unitconsumed*rate1;
        }
        else if (unitconsumed <=200){
            billamount = (100*rate1) + ((unitconsumed-100)*rate2);
        }
        else {
            billamount = (100*rate1) +  (100*rate2) + ((unitconsumed - 200)*rate3);
         }
         System.out.println("electricity bill RS="+billamount);
        }
    }
