package Gifts;

public class Tickets implements Surprisable {
    @Override
    public void activateSurprise() {
        System.out.println("You got tickets! Congratulations!");
    }
}
