package session_8_recap.practice;

import javax.sound.midi.Soundbank;

public class MethodReturnTypes {
    public static void main(String[] args) {
        int intValue = getInt();
        printInt();

    }
    //return something
    //this two classes will be appealed from public static void main
    public static int getInt() {
        return 10;
    }

    public static void printInt() {
        System.out.println(340);
    }

    //this method can be used in my code
    public void testMethod() {
    }

}
