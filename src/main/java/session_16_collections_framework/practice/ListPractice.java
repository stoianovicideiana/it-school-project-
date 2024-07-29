package session_16_collections_framework.practice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        //initializam o lista
        List<Integer> myList = initializeList();

        List<Integer> updatedList = updateList(myList, 3, 7);
        System.out.println(updatedList);

        boolean isElementPresent = isElementPresent(myList, 3);
        System.out.println("Is my element present: " + isElementPresent);

    }

    public static boolean isElementPresent(List<Integer> list, int value) {
        // int value => integer value
        return list.contains(value);

    }

    //metoda statica pentru a putea modifica o lista
    public static List<Integer> updateList(List<Integer> list, int index, int value) {
        //conditie ca indexul exista
        if (index < 0 || index > list.size()) {
            System.out.println("Invalid index");
            return list;
        }

        List<Integer> result = new ArrayList<>(list);
        result.set(index, value);

        return result;
    }

    //metoda statica pentru ca este apelata din main, cream o lista
    public static List<Integer> initializeList() {
        List<Integer> list = new ArrayList<>();

        for (int index = 0; index < 10; index++) {
            list.add(index);
        }

        return list;
    }
}
