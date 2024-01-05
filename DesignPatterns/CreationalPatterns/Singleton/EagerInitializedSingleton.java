import java.io.Serializable;
import java.util.Objects;

public class EagerInitializedSingleton implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();
    private EagerInitializedSingleton(){
        if (Objects.nonNull(INSTANCE)){
            throw new RuntimeException("This class can only be access through getInstance()");
        }
    }
    public static EagerInitializedSingleton getInstance(){
        return INSTANCE;
    }
    protected Object readResolve(){
        return getInstance();
    }
}
