package it.unibo.oop.lab05.ex1;

import java.util.*;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
    	final Set<String> tree = new TreeSet<>();
    	for (int i = 1; i <= 20; i++) {
    		tree.add(String.valueOf(i));
    	}
    	System.out.println(tree);
    	
    	final Iterator<String> iter = tree.iterator();
    	while (iter.hasNext()) {
    		if ((Integer.valueOf(iter.next()) % 3) == 0) {
    			iter.remove();
    		}
    	}
    	System.out.println(tree);
    	
    	boolean even = false;
    	while (iter.hasNext()) {
    		if ((Integer.valueOf(iter.next()) % 2) == 1) {
    			even = false;
    			break;
    		} else {
    			even = true;
    		}
    	}
    	System.out.println(even? "Only even numbers in this tree" : "Even and odd numbers in this tree");
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    }
}
