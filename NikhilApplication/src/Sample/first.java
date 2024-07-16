package Sample;

import java.util.ArrayList;

import java.util.List;

import java.util.ListIterator;


public class first {
    public static void main(String[] args) {
        // Create a list
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Grapes");

        // Create a list iterator
        ListIterator<String> iterator = myList.listIterator();

        // Iterate forward and remove an element
        while (iterator.hasNext()) {
            String currentElement = iterator.next();
            if (currentElement.equals("Banana")) {
                iterator.remove();
            }
        }

        // Print the updated list
        System.out.println("Updated List after removing 'Banana': " + myList);
    }
}