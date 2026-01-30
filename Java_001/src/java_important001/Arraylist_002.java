package java_important001;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_002 {
	
	

	public static void main(String[] args) {
		
	
	        ArrayList<String> list = new ArrayList<>();

	        // ---------- ADD METHODS ----------
	        list.add("A");                  // add at end
	        list.add("B");
	        list.add("C");
	        list.add(1, "X");               // add at index

	        System.out.println("After add: " + list);

	        // ---------- GET METHOD ----------
	        System.out.println("Get index 2: " + list.get(2));

	        // ---------- SET METHOD ----------
	        list.set(2, "Y");
	        System.out.println("After set: " + list);

	        // ---------- REMOVE METHODS ----------
	        list.remove("X");              // remove by value
	        list.remove(1);                // remove by index
	        System.out.println("After remove: " + list);

	        // ---------- CONTAINS ----------
	        System.out.println("Contains A? " + list.contains("A"));

	        // ---------- SIZE ----------
	        System.out.println("Size: " + list.size());

	        // ---------- ISEMPTY ----------
	        System.out.println("Is Empty? " + list.isEmpty());

	        // ---------- ADDALL ----------
	        ArrayList<String> list2 = new ArrayList<>();
	        list2.add("P");
	        list2.add("Q");

	        list.addAll(list2);
	        System.out.println("After addAll: " + list);

	        // ---------- CLEAR ----------
	        list2.clear();
	        System.out.println("List2 clear: " + list2);

	        // ---------- INDEXOF & LASTINDEXOF ----------
	        list.add("A");
	        System.out.println("Index of A: " + list.indexOf("A"));
	        System.out.println("Last index of A: " + list.lastIndexOf("A"));

	        // ---------- SORT ----------
	        Collections.sort(list);
	        System.out.println("Sorted list: " + list);

	        // ---------- LOOP ----------
	        System.out.println("Using for-loop:");
	        for (String s : list) {
	            System.out.println(s);
	            
	            System.out.println();
	        }
	    }
	
}

