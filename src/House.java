
public class House {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("This is the house that Jack built.");
	System.out.println("");
	malt();
	System.out.println("");
	rat();
	System.out.println("");
	cat();
	System.out.println("");
	dog();
	System.out.println("");
	cow();
	System.out.println("");
	maiden();
	}
	public static void lay() {
		System.out.println("That lay in the house that Jack built.");
	}
	public static void ate() {
		System.out.println("That ate the malt");
	}
	public static void killed() {
		System.out.println("That killed the rat,");
	}
	public static void worried() {
		System.out.println("That worried the cat,");
	}
	public static void tossed() {
		System.out.println("That tossed the dog,");
	}
	public static void milked() {
		System.out.println("That milked the cow with the crumpled horn,");
	}
	public static void malt() {
		System.out.println("This is the malt");
		lay();
	}
	public static void rat() {
		System.out.println("This is the rat,");
		ate();
		lay();
	}
	public static void cat() {
		System.out.println("This is the cat,");
		killed();
		ate();
		lay();
	}
	public static void dog() {
		System.out.println("This is the dog,");
		worried();
		killed();
		ate();
		lay();
	}
	public static void cow() {
		System.out.println("This is the cow with the crumpled horn,");
		tossed();
		worried();
		killed();
		ate();
		lay();
	}
	public static void maiden() {
		System.out.println("This is the maiden all forlorn");
		milked();
		tossed();
		worried();
		killed();
		ate();
		lay();
	}
	

}
