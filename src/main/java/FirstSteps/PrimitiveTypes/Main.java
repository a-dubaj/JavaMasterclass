package FirstSteps.PrimitiveTypes;

public class Main {
    public static void main(String[] args) {
        int myValue = 10000;
        int myMinInteger = Integer.MIN_VALUE;
        int myMaxInteger = Integer.MAX_VALUE;

        System.out.println("Integer Minimum value: " + myMinInteger);
        System.out.println("Integer Maximum value: " + myMaxInteger);
        System.out.println("My value: " + myValue);
        System.out.println("Busted MAX value: " + (myMaxInteger + 1));
    }
}
