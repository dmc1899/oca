import java.util.ArrayList;
import java.util.List;

import generics.GenericMethods;
import collections.CollectionMethods;


/**
 * Created by darragh on 09/07/2017.
 */

public class Driver {

    public static void main (String[] args) {
        tryArrayList();
        //tryList();
        //tryGenerics();
    }

    private static void tryGenerics() {
        Integer[] intArray = {1,2,3,4,5};
        Character[] charArray = {'a','b','c','d'};
        GenericMethods.printMe(intArray);
        GenericMethods.printMe(charArray);
    }


    private static void tryList(){
        List<String> keywords = new ArrayList<String>();
        keywords.add("fat");
        keywords.add("bastard");
        GenericMethods ge = new GenericMethods();
        ge.printList(keywords);

        List<List> listList = new ArrayList<List>();
        listList.add(keywords);
        ge.printList(listList);

        ge = null;
    }

    private static void tryArrayList(){
        ArrayList<String> thisArrayList = new ArrayList<String>();

        GenericMethods ge = new GenericMethods();
        CollectionMethods ce = new CollectionMethods();
        thisArrayList = ce.createArrayListCollection(5,"this is my value");
        ge.printList(thisArrayList);

        ge = null;
        ce = null;
}
}
