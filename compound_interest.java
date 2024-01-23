package pathfind;

import java.util.Scanner;

public class compound_interest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double p = scanner.nextDouble();

        System.out.print("Enter the time period: ");
        double t = scanner.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double r = scanner.nextDouble();

        double compoundInterest = calculateCompoundInterest(p, t, r);

        System.out.printf("The compound interest is %.2f%n", compoundInterest);
    }

    public static double calculateCompoundInterest(double p, double t, double r) {
        double amount = p * Math.pow((1 + r / 100), t);
        double interest = amount - p;
        return interest;
    }
}
