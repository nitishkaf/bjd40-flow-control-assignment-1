import java.util.Scanner;

public class Main {

    //1) Write a java program swap two numbers Using Temp variable and without temp
    //Input : 100 200
    //Output: 200 100
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



    public static void main(String[] args) {
        Main swapTwo = new Main();
        swapTwo.SwapTwoNumbers();
    }
}