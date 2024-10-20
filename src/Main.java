import bridge.AdvancedRemoteControl;
import bridge.RemoteControl;
import bridge.SamsungTV;
import bridge.SonyTV;

public class Main {
    public static void main(String[] args) {
        var remoteControl = new RemoteControl(new SonyTV());
        remoteControl.turnOn();

        var advancedRemoteControl = new AdvancedRemoteControl(new SonyTV());
        advancedRemoteControl.turnOn();

        var advancedRemoteControl1 = new AdvancedRemoteControl(new SamsungTV());
        advancedRemoteControl1.turnOn();
    }
}