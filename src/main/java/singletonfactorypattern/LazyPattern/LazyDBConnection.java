package singletonfactorypattern.LazyPattern;

public class LazyDBConnection {

    private static LazyDBConnection connObject;

    private LazyDBConnection() {

    }
//problem with this is that if 2 threads or multiple threads come together, 2 objects might be created which is not singleton pattern
    public static LazyDBConnection getInstance() {
        if(connObject==null) {
            connObject = new LazyDBConnection();
        }

        return connObject;
    }
}
