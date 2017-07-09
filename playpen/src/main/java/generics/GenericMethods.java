package generics;

/**
 * Created by darragh on 09/07/2017.
 */
public class GenericMethods {

    public static <T> void printMe(T[] arr){
        for (T item : arr)
            System.out.println(item.toString());

    }

    // Taken from literature, not used in my example.
    public static <T> T ship(T t){
        System.out.println("working");
        return t;
    }
}
