package collections;

import java.util.ArrayList;
import java.lang.reflect.*;

/**
 * Created by darragh on 15/07/2017.
 */
public class CollectionMethods {

    public ArrayList<String> createArrayListCollection(Integer items,  String valueItem){
        ArrayList<String> thisArrayList = new ArrayList<String>();

        StringBuilder sb = new StringBuilder();
        for (int i=0;i < items; i++){
            sb.delete(0,sb.length());
            thisArrayList.add(sb.append(i).append("-").append(valueItem).toString());
        }
        return thisArrayList;
    }
}
