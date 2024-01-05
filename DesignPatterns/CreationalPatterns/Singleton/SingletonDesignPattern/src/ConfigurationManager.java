import java.io.Serializable;

public class ConfigurationManager implements Serializable {

    private static volatile ConfigurationManager instance = null;

    /**
     * Private constructor to prevent instantiation
     */
    private ConfigurationManager(){
        if (instance!=null){
            throw new IllegalStateException("Singleton instance already created. Use getInstance() method");
        }
    }

    public static ConfigurationManager getInstance(){
        if (instance==null){
            synchronized (ConfigurationManager.class){
                if (instance==null){
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    /**
     * Prevent serialization issues
     * @return the existing instance during deserialization
     */
    protected Object readResolve(){
        return getInstance();
    }

    /**
     * Methods and properties related to configuration management
     */
    public void printConfiguration(){
        System.out.println("Printing configuration details...");
    }
}


