import generics.GenericMethods;

/**
 * Created by darragh on 09/07/2017.
 */

public class Driver {

    public static void main (String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Character[] charArray = {'a','b','c','d'};
        GenericMethods.printMe(intArray);
        GenericMethods.printMe(charArray);
    }




}
