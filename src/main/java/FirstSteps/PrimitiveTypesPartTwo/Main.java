package FirstSteps.PrimitiveTypesPartTwo;

public class Main {
    public static void main(String[] args) {
        int myValue = 1000;
        int myMinInteger = Integer.MIN_VALUE;
        int myMaxInteger = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value: " + myMinInteger);
        System.out.println("Integer Maximum Value: " + myMaxInteger);

        int myMaxIntegerTest = 2_147_483_647;
        System.out.println(myMaxIntegerTest);

        long myValueLong = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Value long: " + myValueLong);
        System.out.println("Max long value: "+ myMaxLongValue);
        System.out.println("Min long value: " +myMinLongValue);
    }
}
