package Gifts;

public class Vacation implements Surprisable{
    @Override
    public void activateSurprise() {
        System.out.println("You got a vacation! Congratulations!");
    }
}
