package exercises3;

public class CopyArrayAndPigLatin {

	public static void main(String[] args) {
		String[] names = { "Alice", "Bob", "Carole", "David", "Elaine" };
		String[] copy = new String[names.length];
		// iterate to fill array, using a loop
		for (int i=0; i < names.length; ++i) {
			// append "ay" to each element copied over
			copy[i] = names[i] + "ay";
		}
		for (int i=0; i < names.length; ++i) {
			System.out.println("Original array names " + names[i]);
			System.out.println("Copy name is         " + copy[i]);
		}
		
		//shorthand way to iterate over the contents of an array
		for(String s : copy) {
			System.out.println(" copy is " + s);
		}
	}

}
