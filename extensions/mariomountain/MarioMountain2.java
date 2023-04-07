package mariomountain;
/**

 * @param integer size
 * @sum return mountain
 */
import cse131.ArgsProcessor;

public class MarioMountain2 {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int size = ap.nextInt("How tall is the mountain?");
        for (int i = 0; i < size; i++) {
          for (int j = 1; j <= i; j++)
                System.out.print(" ");
            for (int j = 0; j < size-i; j++)
                System.out.print("#");
            System.out.println();

        }

    }

}
