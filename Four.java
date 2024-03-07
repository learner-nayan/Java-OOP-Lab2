import java.util.Scanner;

class Four{
    static int fact(int n){
        if(n == 1){
            return 1;
        }else {
            return n * fact(n-1);
        }
    }

    public static void main(String[] args){
        System.out.println("Enter the number to find factorial: ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();

        int factorial = fact(number);
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}