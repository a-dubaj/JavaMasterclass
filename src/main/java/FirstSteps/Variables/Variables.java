package FirstSteps.Variables;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Hello, Andrzej");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        System.out.println(myFirstNumber);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}
