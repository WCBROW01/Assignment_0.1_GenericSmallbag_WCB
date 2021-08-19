/**
 * Item class
 * @author Will Brown
 * @version 1.0
 * Fall 2021
 * @param <T>
 */
public class Item<T> {
	
	private T e;

	/**
	 * @return the value of e
	 */
	public T getE() {
		return e;
	}

	/**
	 * @param e the value of e to set
	 */
	public void setE(T e) {
		this.e = e;
	}

}
