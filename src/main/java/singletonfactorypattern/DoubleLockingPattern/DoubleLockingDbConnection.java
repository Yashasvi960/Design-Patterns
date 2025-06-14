package singletonfactorypattern.DoubleLockingPattern;

public class DoubleLockingDbConnection {

    private static DoubleLockingDbConnection connObject;

    private DoubleLockingDbConnection() {

    }

    private static DoubleLockingDbConnection getInstance() {
        if(connObject==null) {
            synchronized (DoubleLockingDbConnection.class) {
                if(connObject==null) {
                    connObject = new DoubleLockingDbConnection();
                }
            }
        }
        return connObject;
    }
}
