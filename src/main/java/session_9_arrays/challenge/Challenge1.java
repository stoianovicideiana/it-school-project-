package session_9_arrays.challenge;

//Create a shopping list with Array and print the values

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Challenge1 {

    public static void main(String[] args) {
        String[] shoopingList = {"Broccoli", "Milk", "Cheese", "Watermelon"};

        //print the list header once
        System.out.println("My shooping list: ");

        //for loop
        for (String item : shoopingList) {
            System.out.println(item);
        }
    }
}
