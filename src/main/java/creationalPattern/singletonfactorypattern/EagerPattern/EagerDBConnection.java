package creationalPattern.singletonfactorypattern.EagerPattern;

public class EagerDBConnection {
    //first eagerly creating an object as static, now it's a class object, as soon as class loads,it loads
    private static EagerDBConnection eagerDBConnection = new EagerDBConnection();

    //this constructor will restrict it to be just created once;
    private EagerDBConnection(){
        
    }
 // the object can be accessed using this function
    public static  EagerDBConnection getInstance() {
        return eagerDBConnection;
    }


}
