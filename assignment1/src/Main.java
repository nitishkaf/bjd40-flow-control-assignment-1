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



    public static void main(String[] args) {
        Main main = new Main();
//        main.SwapTwoNumbers();
        main.SwapThreeNumbers();
    }
}