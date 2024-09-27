import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variables
        Scanner scan = new Scanner(System.in);
        double itemPrice;
        double salesTax;
        double totalPrice;

            //code
        System.out.println("What was the price of your items? ");
        itemPrice = scan.nextDouble();
        salesTax = itemPrice * 5/100;
        totalPrice = itemPrice + salesTax;
        System.out.println("The total price along with 5% sales tax is " + totalPrice);

    }
}