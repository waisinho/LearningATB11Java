package Challenges;

public class firstChallenge {
    public static void main(String[] args) {
        double firstVar = 20.00;
        double secVar = 80.00;
        double sum = (firstVar + secVar) * 100.00d;
        System.out.println(sum);
        double remainder = sum%40.00;
        System.out.println("Remainder: " + remainder);

        //Checking Boolean variable to see if the remainder is exactly 0.00
        boolean isZeroRemainder = (remainder==0.00);
        System.out.println("Boolean Result: " + isZeroRemainder);

        //checking to see if the remainder is NOT zero
        if (!isZeroRemainder){
            System.out.println("got some remainder " + remainder);
        }



    }
}
