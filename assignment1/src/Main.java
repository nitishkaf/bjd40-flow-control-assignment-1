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
     *  3) write a java program given number is even number or not.
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
     *  4) write a java program give number is odd number or not
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
     *  5) Write a java program to check prime number or not
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

    /**
     * 6) Write a java program to print factorial of a number.
     * Input: 5
     * Output: 120
     * Input: 6
     * Output: 720
     */
    void Factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i=1; i<=num; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }

    /**
     *  7)write a java program given number is Armstrong or not
     *  Input: 153
     *  Output: Armstrong number
     *  Input: 22
     *  Output: not Armstrong number
     */

    void Armstrong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        // logic:
        // 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
        // Sum(d^n) = n

        int originalNumber = num;
        int sum = 0;
        int numberOfDigits = 0;

        for (int n=num; n != 0; n/= 10){
            numberOfDigits++;
        }

        for (int num1 = num; num1 != 0; num1/= 10){
            int digit = num1 % 10;
            // calculate power of the number
            sum += (int) Math.pow(digit, numberOfDigits);
        }

        if (sum == originalNumber) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("not Armstrong number");
        }
    }

    /**
     *  8) Write a java program given number is palindrome or not.
     */
    void Palindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        // logic: 131 = 131 if they are same on reverse, its palindrome
        int originalNum = num;
        int reverseNum = 0;

        while(num !=0) {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }

        if(originalNum == reverseNum){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    /**
     * 9)Write a Java program display 1 to 100 between prime numbers
     */
    void PrimeNumbers(){
        int firstNum = 1;
        int lastNum = 100;

        for(int num = firstNum; num <= lastNum; num++){
            boolean isPrime = true;
            for (int j = 2; j < num; j++){
                if (num % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        // Please run one program at a time!

        Main main = new Main();
//        main.SwapTwoNumbers();
//        main.SwapThreeNumbers();
//        main.EvenOrNot();
//        main.OddOrNot();
//        main.PrimeNumber();
//        main.Factorial();
//        main.Armstrong();
//        main.Palindrome();
        main.PrimeNumbers();
    }
}