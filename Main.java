import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int NoItems;
        double Total;
        double Change;
        DecimalFormat df = new DecimalFormat("#.##");

        Scanner NameQuestion = new Scanner(System.in);
        System.out.println("Enter Name");
        String Customer = NameQuestion.nextLine();


        double Tendered = 20;
        double Apples = 0.60;
        int NoApples = 12;
        double IceCream = 3.59;
        int Containers = 2;
        double Rice = 1.39;
        int NoBag = 3;
        int BagWeight = 2;
        double KgToPound = 1/0.453592;


        double ApplesTotal = (Apples * NoApples);
        double IceCreamTotal = (IceCream * Containers);
        double RiceTotal = (((NoBag * BagWeight) * KgToPound) * Rice);


        Total = ApplesTotal + IceCreamTotal + RiceTotal;
        Change = Tendered - Total;
        NoItems = NoApples + Containers + NoBag;


        double AvgPerItem = Total / NoItems;


        System.out.println();
        System.out.println("Customer: " + Customer);
        System.out.println();
        System.out.println("Number of items: " + NoItems);
        System.out.println("Total Cost: $" + df.format(Total));
        System.out.println("Average Cost Per Item: $" + df.format(AvgPerItem));
        System.out.println();
        System.out.println("Tendered: $" + df.format(Tendered));
        System.out.println("Change: $" + df.format(Change));
        System.out.println("-----------");




















    }
}
