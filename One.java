import java.util.Scanner;

class One{
    public static void main(String[] args){
        float principle, time, rate, interest;

        System.out.println("Enter principle amount: ");
        Scanner p = new Scanner(System.in);
        principle = p.nextInt();

        System.out.println("Enter time in year: ");
        Scanner t = new Scanner(System.in);
        time = t.nextInt();

        System.out.println("Enter rate in percentage: ");
        Scanner r = new Scanner(System.in);
        rate = r.nextInt();

        interest = (principle*time*rate)/100;

        System.out.println("The interest is: "+ interest);

    }
}