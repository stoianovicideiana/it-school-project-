package session_8_recap.practice;

import java.util.Arrays;

public class ForPractice {

    public static void main(String[] args) {
        int[] myArray = {1, 3, 4, 5};

        // for (datatype instance : collection)
        for(int number : myArray) {
            //System.out.println(number);
        }
        System.out.println("Array lenght " + myArray.length);

        // for (initialization; booleanExpression; updateStatement)

        // for (int index = 0; index < 3; index++) {
        // System.out.println(myArray[index]);

        for (int index = 0; index < myArray.length; index++) {
            System.out.println(myArray[index]);
        }
    }
}
