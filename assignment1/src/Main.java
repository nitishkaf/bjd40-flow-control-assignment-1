import java.util.Scanner;

public class Main {

    /**
     *  1) Write a java program swap two numbers Using Temp variable and without temp
     *  Input : 100 200
     *  Output: 200 100
     */

    void SwapTwoNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = sc.nextInt();

        System.out.println("Before Swap: " + firstNum + " " + secondNum);

        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;

        System.out.println("After Swap: " + firstNum + " " + secondNum);
    }

    /**
     *  2) Write a java program swap three numbers Using Temp Variable and without temp
     *  Input : 100 200 300
     *  Output: 300 200 100
     */
    void SwapThreeNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = sc.nextInt();
        System.out.println("Enter third number: ");
        int thirdNum = sc.nextInt();

        System.out.println("Before swapping: " + firstNum + " " + secondNum + " " + thirdNum);
        int temp = firstNum;
        firstNum = thirdNum;
        thirdNum = temp;
        // According to question: second number remains the same!
        System.out.println("After swapping: " + firstNum + " " + secondNum + " " + thirdNum);
    }

    /**
     *  write a java program given number is even number or not.
     */
    void EvenOrNot(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (num%2==0){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is not even");
        }
    }

    /**
     *  write a java program give number is odd number or not
     */
    void OddOrNot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (num%2!=0){
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is not odd");
        }
    }

    /**
     *  Write a java program to check prime number or not
     *  Input: 23
     *  Output: not prime number
     *  Input: 5
     *  Output: prime number
     */

    void PrimeNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        boolean prime = false;

        for (int i = 2; i <= num/2; ++i){
            prime = true;
            break;
        }

        if(!prime){
            System.out.println("prime number");
        } else {
            System.out.println("not prime number");
        }

    }



    public static void main(String[] args) {
        // Please run one program at a time!

        Main main = new Main();
//        main.SwapTwoNumbers();
//        main.SwapThreeNumbers();
//        main.EvenOrNot();
//        main.OddOrNot();
        main.PrimeNumber();
    }
}