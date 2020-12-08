package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3, i, count;

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please pick a number for Fibonacci Sequence");
            count = sc.nextInt(); // user puts number for the loop
            //prints 1st & 2nd number
            System.out.print(num1 + " " + num2);
            // Loops 10 times 
            for (i = 2; i < count; ++i) {//loop starts from 2 because 0 and 1 are already printed    

                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
                if (num3 <= count) { //stops when count reaches last number
                    System.out.print(" " + num3);
                } else // break helps stop the last number to go downd minus number
                {
                    break;
                }
            }

        } catch (Exception e) { //catches if user puts string or double 
            System.out.println("Please enter number!");
        }
    }
}

/**
 *
 * @author 30023737
 */
