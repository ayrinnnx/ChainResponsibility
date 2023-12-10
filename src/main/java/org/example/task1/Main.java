package org.example.task1;

public class Main {
    public static void main(String[] args) {
        int[] currencyDenomination = {1, 2, 5, 10, 20, 50, 100};
        int amount = 325;
        for (int i = 0; i < currencyDenomination.length; i++) {
            int index = currencyDenomination.length - 1 - i;
            int denomination = currencyDenomination[index];
            System.out.println("You should take " + amount / denomination + " of denomination " + denomination);
            amount = amount % denomination;
        }
    }
}