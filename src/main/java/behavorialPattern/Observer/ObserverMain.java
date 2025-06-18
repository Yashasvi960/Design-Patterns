package behavorialPattern.Observer;

public class ObserverMain {

    public static void main(String args[]) {
        NewsChannel channel1 = new NewsChannel("CNN");
        NewsChannel channel2 = new NewsChannel("BBC");

        NewsAgency agency = new NewsAgency();
        agency.attach(channel1);
        agency.attach(channel2);

        agency.setNews("Yashasvi is mastermind");


    }


}
