
/**
 * Write a description of class Stars here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stars
{
    public static void main(String[] args) {
        starsA();
        System.out.println();
        starsB();
        System.out.println();
        starsC();
        System.out.println();
        starsD();
    }
    public static void starsA() 
     {
         int stars = 10;
         int spaces = 0;
         for (int rows = 10; rows >= 0; rows--) {
             printItem("*", rows);
             printItem(" ", 10 - spaces);
             spaces++;
             System.out.println();
            }
    }   
    public static void starsB() {
        int stars = 0;
        int spaces = 10;
        for (int rows = 10; rows >=0; rows--) {
            printItem(" ", spaces);
            printItem("*", stars);
            spaces--;
            stars++;
            System.out.println();
        }
    }
    public static void starsC() {
        int stars = 10;
        int spaces = 0;
        for(int rows = 10; rows >= 0; rows--) {
            printItem(" ", spaces);
            printItem("*", stars);
            stars--;
            spaces++;
            System.out.println();
        }
    }
    public static void starsD() {
        int stars = 1;
        int spaces = 4;
        for (int rows = 5; rows > 0; rows--) {
            printItem(" ", spaces);
            printItem("*", stars);
            printItem(" ", spaces);
            stars++;
            stars++;
            spaces--;
            System.out.println();
            }
        stars = 9;
        spaces = 0;
        for (int rows2 = 5; rows2 > 0; rows2--) {
            printItem(" ", spaces);
            printItem("*", stars);
            printItem(" ", spaces);
            stars--;
            stars--;
            spaces++;
            System.out.println();
        }
        }
         public static void printItem(String it, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(it);
        }
    }
    }

