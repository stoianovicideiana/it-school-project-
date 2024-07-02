package session_9_arrays.challenge;

// Create a wishlist for christmas with ArrayList and print the values

import java.util.ArrayList;

public class Challenge2 {
    public static void main(String[] args) {
        ArrayList<String> christmasWishList = new ArrayList<>();
        christmasWishList.add("Books");
        christmasWishList.add("Board games, ex: Activity");
        christmasWishList.add("2 day snowboarding to Straja");
        christmasWishList.add("5 bootles of my favorite wine");

        //print the list header once
        System.out.println("My Christmas wishlist is: ");

        //for loop
        for (String wishList : christmasWishList) {
            System.out.println(wishList);
        }

    }
}
