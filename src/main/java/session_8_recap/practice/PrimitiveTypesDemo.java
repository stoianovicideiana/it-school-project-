package session_8_recap.practice;

public class PrimitiveTypesDemo {
    public static void main(String[] args) {
        int myInt = 10;
        double myDouble = 12.5;
        char myChar = 'D';
        boolean myBoolean = true;
        long myLong = 4324324324L;

        System.out.println("Integer value: " + myInt);
        System.out.println("Double value: " + myDouble);
        System.out.println("Char value: " + myChar);
        System.out.println("Boolean value: " + myBoolean);
        System.out.println("Long value: " + myLong);

        MethodReturnTypes methodReturnTypes = new MethodReturnTypes();
        methodReturnTypes.testMethod();
    }

}
