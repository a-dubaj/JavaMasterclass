package FirstSteps.Casting;

public class Main {
    public static void main(String[] args) {
        int myMinIntValue = Integer.MIN_VALUE;
        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myTotal / 2);
        short myShortValue = (short) (myTotal / 2);

        System.out.println(myNewByteValue);
        System.out.println(myShortValue);
    }
}
