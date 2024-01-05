import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonWithReflection{
    public static void main(String[] args){
        EagerInitializedSingleton firstSingletonInstance = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton secondSingletonInstance = null;

        try{
            Class<EagerInitializedSingleton> clazz = EagerInitializedSingleton.class;
            Constructor<EagerInitializedSingleton> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            secondSingletonInstance = constructor.newInstance();
        }catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e){
            e.printStackTrace();
        }
        System.out.println("Instance 1 hashcode: "+firstSingletonInstance.hashCode());
        System.out.println("Instance 2 hashcode: "+secondSingletonInstance.hashCode());
    }
}