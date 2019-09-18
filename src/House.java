
public class House {

	public static void main(String[] args) {
		thisIs();
		malt();
		thatLay();
		rat();
		ateMalt();
		cat();
		killedRat();
		dog();
		worriedCat();
		cow();
		tossedDog();
		maiden();
		milkedCow();
	}
	
	public static void thisIs() {
		System.out.println("This is the house that Jack built");
	}
    
	public static void malt() {
		System.out.println("This is the malt");
	}
	
	public static void thatLay() {
		System.out.println("That lay in the house that Jack built");
	}
	public static void rat() {
		System.out.println("This is the rat,");
	}
	
	public static void ateMalt() {
		System.out.println("That ate the malt");
		thatLay();
	}
	
	public static void cat() {
		System.out.println("This is the cat,");
		killedRat();
	}
	
	public static void killedRat() {
		System.out.println("That killed the rat,");
		ateMalt();
	}
	
	public static void dog() {
		System.out.println("This is the dog,");
		worriedCat();
	}
	
	public static void worriedCat() {
		System.out.println("That worried the cat,");
		killedRat();
	}
	
	public static void cow() {
		System.out.println("This is the cow with the crumpled horn,");
	    tossedDog();
	}
	
	public static void tossedDog() {
		System.out.println("That tossed the dog");
		worriedCat();
	}
	
	public static void maiden() {
		System.out.println("This is the maiden all forlorn");
		milkedCow();
	}
	
	public static void milkedCow() {
		System.out.println("That milked the cow with the crumpled horn,");
		tossedDog();
	}
}