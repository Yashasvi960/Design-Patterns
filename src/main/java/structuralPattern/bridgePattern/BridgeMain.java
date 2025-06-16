package structuralPattern.bridgePattern;

public class BridgeMain {
    public static void main(String args[]) {
      RemoteControl remoteControl = new BasicRemoteToggle(new TvDevice());
      remoteControl.togglePower();
    }
}
