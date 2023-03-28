package assignment.Feb27;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collections {
    public static void main(String[] args) {

        // Create  a sub list, sub set and sub map from an existing one.
        // Create head & tail of set and map

        // LIST
        var numbers = List.of(1,4,6,2,786,12123,7989,12,43);
        var newno = new ArrayList<>(numbers);
        System.out.println("List : " + newno);

        // SUBLIST
        var subList = newno.subList(3, 7);
        System.out.println("Sublist : " + subList);
        System.out.println();

        // **********************************************************************************************************************

        // MAP 
        var map = Map.of("Albania","Tirana","Canada", "Ottawa", "Kosovo","Pristine");
        var newmap = new TreeMap(map);
        System.out.println("Map : " + newmap);

        // SUBMAP
        var subMap = newmap.subMap("Albania", "Canada");
        System.out.println("Submap : " + subMap);

        // HEAD 
        var mapHead = newmap.headMap("Canada");
        System.out.println("Head : " + mapHead);

        // TAIL
        var mapTail = newmap.tailMap("Canada");
        System.out.println("Tail : " + mapTail);
        System.out.println();

       // **********************************************************************************************************************

       // SET
       var set = Set.of(34,56,78,2,3,6576,90,31);
       var newset = new TreeSet(set);
       System.out.println("Set : " + newset);

       // SUBSET
       var subSet = newset.subSet(2, 100);
       System.out.println("SubSet : " + subSet);

       // HEAD
       var setHead = newset.headSet(50);
       System.out.println("Head : " + setHead);

       // TAIL
       var setTail = newset.tailSet(60);
       System.out.println("Tail : " + setTail);
    }

}
