package creationalPattern.singletonfactorypattern.synchronizationPattern;

public class SynchronizedDBConnection {

    private static SynchronizedDBConnection connObject;

    private SynchronizedDBConnection() {

    }
  //expensive
    synchronized public static SynchronizedDBConnection getInstance() {
        if(connObject==null) {
            connObject = new SynchronizedDBConnection();
        }

        return connObject;
    }
}
