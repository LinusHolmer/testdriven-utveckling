package com.linusholmer.testdrivenutveckling.lektion2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
        // Items
        String item1Name = "Laptop";
        double item1Price = 1000.00;
        int item1Quantity = 1;

        String item2Name = "Phone";
        double item2Price = 500.00;
        int item2Quantity = 2;

        // Prices before discount
        double item1Total = item1Price * item1Quantity;
        double item2Total = item2Price * item2Quantity;
        double totalBeforeDiscount = item1Total + item2Total;
        System.out.println("Total before discount: $" + totalBeforeDiscount);

        // Discount
        double discount = 10.0;
        double discountAmount = totalBeforeDiscount * (discount / 100);
        double totalAfterDiscount = totalBeforeDiscount - discountAmount;
        System.out.println("Discount: $" + discountAmount);
        System.out.println("Total after discount: $" + totalAfterDiscount);

        // förbättrade koden
        Item item = new Item("Laptop", 1000, 2);
        Item item2 = new Item("Phone", 500, 2);

        Cart cart = new Cart();
        cart.calculateTotal(10, item, item2);

        //

        // Another method of calculating total for the same items
        double anotherItem1Total = item1Price * item1Quantity;
        double anotherItem2Total = item2Price * item2Quantity;
        double anotherTotalBeforeDiscount = anotherItem1Total + anotherItem2Total;
        double anotherDiscountAmount = anotherTotalBeforeDiscount * (discount / 100);
        double anotherTotalAfterDiscount = anotherTotalBeforeDiscount - anotherDiscountAmount;
        System.out.println("Another total before discount: $" + anotherTotalBeforeDiscount);
        System.out.println("Another total after discount: $" + anotherTotalAfterDiscount);

 */

        ArrayList<Bird> birds = new ArrayList<>();

        Bird myBird = new Bird("Fågel");
        Dog myDog = new Dog("Hund");

       /*
        birds.add(myBird);
        birds.add(myDog);
        System.out.println(birds.getFirst().getName());
        */

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(myDog);
        animals.add(myBird);

        System.out.println(animals.getFirst().getName() +" " + animals.get(1).getName());

    }
}
