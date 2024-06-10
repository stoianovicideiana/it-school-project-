package session_3_java_operators.practice;

public class NumericPromotion {

    public static void main(String[] args) {
        short e = 10;
        int f = e + 5;

        long a = 10000000000000L;

        //wrapper classes - sa vedem valoarea maxima sau minima a unei primitive
        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;

        int maxIntValue = Integer.MAX_VALUE;

        System.out.println("Max long value: " + maxLongValue);
        System.out.println("Min long value: " + minLongValue);
        System.out.println("Max integer value: " + maxIntValue);

        long testLongValue = 123129483458464555L;
        //max int: 1213456
        //max long: 124283578758785778

        int newIntValue = (int) testLongValue;

        System.out.println("Test long value: " + testLongValue);
        System.out.println("New int value: " + newIntValue);


    }
}
