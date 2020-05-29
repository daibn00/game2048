package BinarySearch;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;

/**
 * The {@code BinarySearch} class provides a static method for binary searching
 * for an integer in a sorted array of integers.
 * <p>
 * The <em>indexOf</em> operations takes logarithmic time in the worst case.
 * <p>
 * For additional documentation, see
 * <a href="https://algs4.cs.princeton.edu/11model">Section 1.1</a> of
 * <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 * @author Robert Sedgewick
 * @author Kevin Wayne
 */
public class BinarySearch {

	/**
	 * This class should not be instantiated.
	 */
	private BinarySearch() {
	}

	/**
	 * Returns the index of the specified key in the specified array.
	 *
	 * @param a   the array of integers, must be sorted in ascending order
	 * @param key the search key
	 * @return index of key in array {@code a} if present; {@code -1} otherwise
	 */
	public static int indexOf(int[] a, int key) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			// Key is in a[lo..hi] or not present.
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid])
				hi = mid - 1;
			else if (key > a[mid])
				lo = mid + 1;
			else
				return mid;
		}
		return -1;
	}

	/**
	 * Returns the index of the specified key in the specified array. This function
	 * is poorly named because it does not give the <em>rank</em> if the array has
	 * duplicate keys or if the key is not in the array.
	 *
	 * @param key the search key
	 * @param a   the array of integers, must be sorted in ascending order
	 * @return index of key in array {@code a} if present; {@code -1} otherwise
	 * @deprecated Replaced by {@link #indexOf(int[], int)}.
	 */
	@Deprecated
	public static int rank(int key, int[] a) {
		return indexOf(a, key);
	}

	/**
	 * Reads in a sequence of integers from the whitelist file, specified as a
	 * command-line argument; reads in integers from standard input; prints to
	 * standard output those integers that do <em>not</em> appear in the file.
	 *
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(new File("tinyT.txt"));
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		List<Integer> list = new ArrayList<Integer>();
		while(line != null) {
			list.add(Integer.parseInt(line.trim()));
			line = br.readLine();
		}
		
		int a[] = new int[list.size()];
		list.sort((b,c) -> b < c ? -1 : b==c ? 0 : 1);
		System.out.println(list);
		for (int i = 0 ; i < a.length ; i++) a[i] = list.get(i);
		
		for (int i = 0 ; i < a.length ; i++) System.out.print(a[i]+" ");
		System.out.println(BinarySearch.rank(50, a));
		br.close();
		fr.close();
		
	}
}