
class Zillion
 {
     private int[] digits;
     public Zillion(int size)
     {
         digits = new int[size];  //creates a new array called digits
     }

     public void increment()
     {
         for (int i=digits.length-1; i >= 0; i--) //starts at right end of array and steps through backwards
         {
             if(digits[i] == 9)
             {
                digits[i] = 0; //changes 9 to 0
             }
            else
                {
                 digits[i] += 1; //adds 1 to any number other than 9
                 break;
                 }
         }
     }


     public String toString()
     {
         String s =""; //creates an empty string s
         for (int d=0; d<digits.length; d++) //steps through digits
         {
             s= s + digits[d]; //adds each member of digits to new string s
         }
         return s;
     }
 }

 //  DRIVER. The MAIN method has tests for your class ZILLION. Each test has a
//  comment that shows what the test should print if your code is correct. It
//  also has the number of points you will receive if the test is successful.
//  These tests are worth a total of 25 points.

 class Driver
 {
     public static void main(String[] args)
     {
         Zillion z = new Zillion(2);
         System.out.println(z);  //  00  2 points

         z.increment();
         System.out.println(z);  //  01  2 points

         z.increment();
         System.out.println(z);  //  02  2 points

         z.increment();
         z.increment();
         z.increment();
         z.increment();
         z.increment();
         z.increment();
         z.increment();
         z.increment();

         System.out.println(z);  //  10  2 points
         z.increment();
         System.out.println(z);  //  11  2 points

         z = new Zillion(4);
         System.out.println(z);  //  0000  2 points

         for (int j = 1; j <= 999; j += 1)
         {
             z.increment();
         }
         System.out.println(z);  //  0999  2 points

         z.increment();
         System.out.println(z);  //  1000  2 points

         for (int j = 1; j <= 999; j += 1)
         {
             z.increment();
         }
         System.out.println(z);  //  1999  2 points

         z.increment();
         System.out.println(z);  //  2000  2 points

         for (int j = 1; j <= 7999; j += 1)
         {
             z.increment();
         }
         System.out.println(z);  //  9999  2 points

         z.increment();
         System.out.println(z);  //  0000  2 points

         z.increment();
         System.out.println(z);  //  0001  1 point
     }
 }