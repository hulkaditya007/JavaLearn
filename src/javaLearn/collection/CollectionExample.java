package javaLearn.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExample {
    public static void main(String[] args) {
        // Creating a Collection (ArrayList) of Strings
        Collection<String> collection1 = new ArrayList<>();
        
        // 1. add() - Adding elements to the collection
        collection1.add("Apple");
        collection1.add("Banana");
        collection1.add("Cherry");
        System.out.println("After adding elements: " + collection1); 
        // Output: After adding elements: [Apple, Banana, Cherry]

        // 2. addAll() - Adding all elements from another collection
        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Date");
        collection2.add("Elderberry");
        collection2.addAll(collection1);
        System.out.println("After adding collection1 to collection2: " + collection2); 
        // Output: After adding collection1 to collection2: [Date, Elderberry, Apple, Banana, Cherry]

        // 3. remove() - Removing an element from the collection
        collection2.remove("Banana");
        System.out.println("After removing 'Banana': " + collection2); 
        // Output: After removing 'Banana': [Date, Elderberry, Apple, Cherry]

        // 4. removeAll() - Removing all elements from another collection
        collection2.removeAll(collection1);
        System.out.println("After removing all elements from collection1: " + collection2); 
        // Output: After removing all elements from collection1: [Date, Elderberry]

        // 5. retainAll() - Retaining only common elements from another collection
        collection1.add("Date");  // Add common element
        collection1.retainAll(collection2);
        System.out.println("After retaining only common elements: " + collection1); 
        // Output: After retaining only common elements: [Date]

        // 6. size() - Get the size of the collection
        System.out.println("Size of collection1: " + collection1.size()); 
        // Output: Size of collection1: 1

        // 7. contains() - Check if an element exists
        System.out.println("Contains 'Apple'? " + collection1.contains("Apple")); 
        // Output: Contains 'Apple'? false
        System.out.println("Contains 'Date'? " + collection1.contains("Date")); 
        // Output: Contains 'Date'? true

        // 8. containsAll() - Check if all elements of another collection are present
        System.out.println("collection2 contains all elements of collection1? " + collection2.containsAll(collection1)); 
        // Output: collection2 contains all elements of collection1? true

        // 9. isEmpty() - Check if the collection is empty
        System.out.println("Is collection1 empty? " + collection1.isEmpty()); 
        // Output: Is collection1 empty? false
        
        // 10. iterator() - Iterating through the collection
        Iterator<String> iterator = collection1.iterator();
        System.out.println("Iterating over collection1: "+collection1);
        System.out.println("has next"+iterator.next());
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        // Output: Iterating over collection1: Date

        // 11. toArray() - Convert collection to array
        Object[] array = collection1.toArray();
        System.out.print("Array from collection1: ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();
        // Output: Array from collection1: Date 

        // 12. clear() - Clear all elements from the collection
        collection1.clear();
        System.out.println("After clearing collection1: " + collection1); 
        // Output: After clearing collection1: []
        System.out.println("Is collection1 empty now? " + collection1.isEmpty()); 
        // Output: Is collection1 empty now? true
    }
}
