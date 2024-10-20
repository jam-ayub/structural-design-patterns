package bridge;

public class SonyAdvancedRemoteControl extends AdvancedRemoteControl {
    @Override
    public void setChanel(int number) {
        System.out.println("Sony: setChanel.");
    }

    @Override
    public void turnOn() {
        System.out.println("Sony: turnOn.");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: turnOff.");
    }

}
