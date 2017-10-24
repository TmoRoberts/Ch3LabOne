
/**
 * Produces a multiplication table.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultiplicationTable
{
    public static void main (String[] args) 
     {
    // instance variables - replace the example below with your own
    int startNum = 1;
    int nextNum = 1;
    while (startNum < 14 && nextNum < 14) {
        System.out.print("\t" + startNum * nextNum);
        nextNum++;
        if (nextNum == 13) {
            startNum++;
            nextNum = 1;
            System.out.println(" ");
        }
        if (startNum == 13) {
            System.exit(0);
        }
        }
  }
}
