
public class House {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("This is the house that Jack built.");
	System.out.println("");
	Malt();
	System.out.println("");
	Rat();
	System.out.println("");
	Cat();
	System.out.println("");
	Dog();
	System.out.println("");
	Cow();
	System.out.println("");
	Maiden();
	}
	public static void Lay() {
		System.out.println("That lay in the house that Jack built.");
	}
	public static void Ate() {
		System.out.println("That ate the malt");
	}
	public static void Malt() {
		System.out.println("This is the malt");
		Lay();
	}
	public static void Rat() {
		System.out.println("This is the rat,");
		Ate();
		Lay();
	}

}
