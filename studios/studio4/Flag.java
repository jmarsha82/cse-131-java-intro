package studio4;
 
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
 
import cse131.ArgsProcessor;
import sedgewick.StdAudio;
import sedgewick.StdDraw;
import sedgewick.StdIn;
 
public class Flag {
 
 
       public static void main(String[] args) throws FileNotFoundException {
              //
              //  Add code for your studio below here.
              //
              StdDraw.setPenColor(Color.BLACK);
              StdDraw.rectangle(.5, .5, .5, .5);
              StdDraw.setPenColor(Color.WHITE);
              StdDraw.filledRectangle(.5, (2.0/3.0 + 1.0/6.0), .5, 1.0/6.0);
              StdDraw.setPenColor(Color.BLUE);
              StdDraw.filledRectangle(.5, (2.0/3.0 - 1.0/6.0), .5, 1.0/6.0);
              StdDraw.setPenColor(Color.RED);
              StdDraw.filledRectangle(.5, (1.0/3.0 - 1.0/6.0), .5, 1.0/6.0);
 
              double x = 0;
              double y = 1;
 
              while (x<1){
 
                     x = x + .1;
                     y = y - .1;
 
                     StdDraw.show(100);
                     StdDraw.setPenColor(Color.BLACK);
                     StdDraw.text(x, y, "Russia");
 
              }            
              while (true){
                     System.setIn(new FileInputStream("music/National_Anthem.txt"));
 
                     // repeat as long as there are more integers to read in
                     while (!StdIn.isEmpty()) {
 
                           // read in the pitch, where 0 = Concert A (A4)
                           int pitch = StdIn.readInt();
 
                           // read in duration in seconds
                           double duration = StdIn.readDouble();
 
                           // build sine wave with desired frequency
                           double hz = 440 * Math.pow(2, pitch / 12.0);
                           int N = (int) (StdAudio.SAMPLE_RATE * duration);
                           double[] a = new double[N+1];
                           for (int i = 0; i <= N; i++) {
                                  a[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
                           }
 
                           // play it using standard audio
                           StdAudio.play(a);
                     }
              }
       }
 
}
