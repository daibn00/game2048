package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * The {@code ResizingArrayBag} class represents a bag (or multiset) of generic
 * items. It supports insertion and iterating over the items in arbitrary order.
 * <p>
 * This implementation uses a resizing array. See {@link LinkedBag} for a
 * version that uses a singly linked list. The <em>add</em> operation takes
 * constant amortized time; the <em>isEmpty</em>, and <em>size</em> operations
 * take constant time. Iteration takes time proportional to the number of items.
 * <p>
 * For additional documentation, see
 * <a href="https://algs4.cs.princeton.edu/13stacks">Section 1.3</a> of
 * <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 * @author Robert Sedgewick
 * @author Kevin Wayne
 */
public class ResizingArrayBag<Item> implements Iterable<Item> {
	private Item[] a; // array of items
	private int n; // number of elements on bag

	/**
	 * Initializes an empty bag.
	 */
	public ResizingArrayBag() {
		a = (Item[]) new Object[2];
		n = 0;
	}

	/**
	 * Is this bag empty?
	 * 
	 * @return true if this bag is empty; false otherwise
	 */
	public boolean isEmpty() {
		return n == 0;
	}

	/**
	 * Returns the number of items in this bag.
	 * 
	 * @return the number of items in this bag
	 */
	public int size() {
		return n;
	}

	// resize the underlying array holding the elements
	private void resize(int capacity) {
		assert capacity >= n;
		Item[] temp = (Item[]) new Object[capacity];
		for (int i = 0; i < n; i++)
			temp[i] = a[i];
		a = temp;
	}

	/**
	 * Adds the item to this bag.
	 * 
	 * @param item the item to add to this bag
	 */
	public void add(Item item) {
		if (n == a.length)
			resize(2 * a.length); // double size of array if necessary
		a[n++] = item; // add item
	}

	/**
	 * Returns an iterator that iterates over the items in the bag in arbitrary
	 * order.
	 * 
	 * @return an iterator that iterates over the items in the bag in arbitrary
	 *         order
	 */
	public Iterator<Item> iterator() {
		return new ArrayIterator();
	}

	// an iterator, doesn't implement remove() since it's optional
	private class ArrayIterator implements Iterator<Item> {
		private int i = 0;

		public boolean hasNext() {
			return i < n;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

		public Item next() {
			if (!hasNext())
				throw new NoSuchElementException();
			return a[i++];
		}
	}

	/**
	 * Unit tests the {@code ResizingArrayBag} data type.
	 *
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {
		ResizingArrayBag<String> bag = new ResizingArrayBag<String>();
        
		List<Integer> bag1 = new ArrayList<Integer>();
		
		int a[] = {9,8,7,6,5,3,4,3,1};
	   for (int i : a) {
        bag1.add(i);		
	}
	   bag1.sort((b,c) -> b < c ? -1 : 1);

		for (int i = 0; i < a.length; i++) {
			System.out.println(bag1.get(i));
		}
			
	}

}
