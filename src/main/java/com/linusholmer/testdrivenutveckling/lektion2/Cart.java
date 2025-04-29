package com.linusholmer.testdrivenutveckling.lektion2;

public class Cart {

    public void calculateTotal(double discount, Item... items) {
        double total = 0;

        for (Item item : items) {
            total += item.getTotalPrice();
        }

        System.out.println("Total before discount: $" + total);

        double discountAmount = total * (discount / 100);
        System.out.println("Discount: $" + discountAmount);

        double finalTotal = total - discountAmount;
        System.out.println("Total after discount: $" + finalTotal);
    }
}
