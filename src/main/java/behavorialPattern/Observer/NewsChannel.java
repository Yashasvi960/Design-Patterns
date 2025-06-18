package behavorialPattern.Observer;

public class NewsChannel implements Observer{
   public String channelName;
    public NewsChannel(String channelName) {
        this.channelName = channelName;
    }
    @Override
    public void update(String message) {
        System.out.println("message is:" + message);
    }
}
