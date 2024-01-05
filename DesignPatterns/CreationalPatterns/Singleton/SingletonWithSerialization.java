import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonWithSerialization {
    public static void main(String[] args) {

        EagerInitializedSingleton firstSingletonInstance = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton secondSingletonInstance = null;

        ObjectOutputStream outputStream = null;
        ObjectInputStream inputStream = null;
        try{
            //Saving the object state in a file in file system
            outputStream = new ObjectOutputStream(new FileOutputStream("FirstSingletonInstance.ser"));
            outputStream.writeObject(firstSingletonInstance);
            outputStream.close();

            // Retrieving the object state from the file
            inputStream = new ObjectInputStream(new FileInputStream("FirstSingletonInstance.ser"));
            secondSingletonInstance = (EagerInitializedSingleton) inputStream.readObject();
            inputStream.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("FirstSingletonInstance hashcode: "+firstSingletonInstance.hashCode());
        System.out.println("SecondSingletonInstance hashcode: "+secondSingletonInstance.hashCode());
    }
}
