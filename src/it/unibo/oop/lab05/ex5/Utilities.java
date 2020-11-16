package it.unibo.oop.lab05.ex5;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 */
public final class Utilities {

    private Utilities() {
    }

    /**
     * Copies all the element of the first collection in the second collection.
     * 
     * @param source
     *            the source collection
     * @param target
     *            the target collection
     * @param <X>
     *            Collection type
     */
    public static <X> void copyAll(final Collection<X> source, final Collection<? super X> target) {
    	target.addAll(source);
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     * 
     */
    public static <X> X getRandomElement(final Collection<X> coll) {
        Iterator<X> iter = coll.iterator();
        X randomElem = null;
        int i = ((int)(Math.random() * 100) % coll.size() + 1);
        int num = 0;
        do {
        	randomElem = iter.next();
        } while (++num < i);
        return randomElem;
    }

    /**
     * @param one
     *            first collection
     * @param two
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> one, final Collection<Y> two) {
    	Iterator<X> iter1 = one.iterator();
    	Iterator<Y> iter2 = two.iterator();
        X randomElem1 = null;
        Y randomElem2 = null;
        
        int ran1 = ((int)(Math.random() * 100) % one.size() + 1);
        int ran2 = ((int)(Math.random() * 100) % one.size() + 1);
        int num = 0;
        do {
        	randomElem1 = iter1.next();
        } while (++num < ran1);
        num = 0;
        do {
        	randomElem2 = iter2.next();
        } while (++num < ran2);
        
        Pair<X, Y> returnPair = new Pair<>(randomElem1, randomElem2);
        return returnPair;
    }
}
