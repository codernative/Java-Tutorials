package disitionOfWhichCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        

        /*
         * Considor :
         * 1. What you need the collections to do.
         * 2. aRE using the fastestst collection for the purposes
         * (Think about insertion/deletion ,retrievel and traversal)
         */

         //////////////////  LISTS  /////////////////////////////////

         // Shopping List
         // Strore List of Objects.
         // Duplicates are allowed 
         // Objects remain in order
         // Elements are indexed via an integer
         // Cheking for particular item in List is slow
         // Looking an item up by index is fast
         // Iteratin through list is relatively fast
         // Note : You can Sort list if you want to

         // If you Add or Remove item at the End of the List use " ArrayList "
            List<String> list1 = new ArrayList<>();
 
         // Removing or adding item else where in List use " LisnkedList "
            List<String> list2 = new LinkedList<>();

         ///////////////  SETS  /////////////////////////////////////
         
         // Only stores unique values
         // Great for removing duplicates
         // Not indexed unlike Lists
         // Very fast check if particular objrct exists
         // If you want to use your own object you must implement hashode() and equals().

         // Order is unimpotent and OK if it changes ?
         // (1,2,3....,a,b,c.....etc)
            Set<String> set1 = new HashSet<>();

         // Sorted in Natural order use " TreeSet " --- must implement Comparable for custom types
            Set<String> set2 = new TreeSet<>();
         
         // Elements remain in order they where added
            Set<String> set3 =  new LinkedHashSet<>();

        //////////////////  MAPS  /////////////////////////////////////    

        // Key values pairs
        // Like lookup tables
        // Retrieving value by key is Fast
        // Iterating over map values is very Slow
        // Maps are not optimised for Iteration
        // If you want to use your own Objects as key, You must implement hashCode() and equals().

        // Keys not in any particular order ,and order liable to change
            Map<String ,String> map1 = new HashMap<>();

        // Keys Stored in natural order
            Map<String ,String> map2 = new TreeMap<>();
    
        // Keys remain in order added
            Map<String ,String> map3 = new LinkedHashMap<>();

        // There are also SortedSet and SortedMap interfaces.   


    }
    
}