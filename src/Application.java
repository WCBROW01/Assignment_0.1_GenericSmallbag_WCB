/**
 * Test application for SmallBag and Item
 * @author Will Brown
 * @version 1.0
 * Fall 2021
 */
public class Application {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		Item<String> name = new Item<String>();
		name.setE("Will Brown");
		
		Item<Integer> xkcd = new Item<Integer>();
		xkcd.setE(927); // you know what to do
		
		SmallBag<Item> itemBag = new SmallBag<Item>();
		
		itemBag.setItem(name);
		System.out.println(itemBag.getItem().getE());
		
		itemBag.setItem(xkcd);
		System.out.println(itemBag.getItem().getE());
	}

}
