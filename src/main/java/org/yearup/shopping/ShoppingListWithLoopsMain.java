package org.yearup.shopping;

import java.util.Scanner;

public class ShoppingListWithLoopsMain {


    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

        while (true) {

            System.out.println("Welcome to the store shop till your hearts content.");
            // Show the user a list of items for sale
            // Only show the product names and IDs, not the prices
            Item[] itemsForSale = ItemsForSale.itemsForSale;
            for (Item i : itemsForSale) {
                if (!i.isInStock()) continue;
                // System.out.println(i);
                System.out.println(i.getDescription() + " " + i.getDescription());

            }
            // Invite the user to buy something
            System.out.println("Choose a product to buy (provide first 4 digits): ");
            // Read in the user's response
            String selectedProductId = consoleInput.nextLine();
            // Parse their choice and get that item from the list

            Item selectedItem = null;

            for (Item currentItemInListInTheLoop : itemsForSale) {
                if (selectedProductId.equals(currentItemInListInTheLoop.getProductID())) {
                    selectedItem = currentItemInListInTheLoop;
                    done = true;
                    break;
                }
            }while (! done);
            System.out.println("The price of this item is: " + " $" + selectedItem.getPrice());
            System.out.println("Do you accept this price? (y/n)");
            String YesOrNo = consoleInput.nextLine();

            if (YesOrNo.equals("y")) {
                System.out.println("Thank you enjoy your day.");
                break;
            } else if (YesOrNo.equals("n")) ;
            {
                System.out.println("Take a look at what else we got in store.");

            }


        }
        // Tell the user they can have it for a price!
        // show them the price and ask them to accept it

        // Read their response
        //   if yes, tell them it's theirs
        //   if no, start over and show them the list again


    }
}
