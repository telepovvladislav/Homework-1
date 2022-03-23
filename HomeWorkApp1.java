        /**
	 * Java. Lesson 1. Homework 1
	 */
   public class HomeWorkApp {
	    public static void main(String[] args) {
	        printThreeWords ();
	        checkSumSign();
	        printColor();
	        compareNumbers();
	    }
	    /** ПУНКТ 2.
             */
	    public static void printThreeWords () {
	      System.out.println("Orange");
	      System.out.println("Banana");
	      System.out.println("Apple");
	    }
	    /** ПУНКТ 3.
	     */
	    public static void checkSumSign () {
	        int a = 2;
	        int b = -3;
	        if ((a + b) >= 0) {
	            System.out.println("The amount is positive!");
	        } else System.out.println("The amount is negative!");
	    }
	    /** ПУНКТ 4.
	     */
	    public static void printColor () {
	        int value = 10;
	        if (value <= 0) {
	            System.out.println("Red!");
	        } if (value > 0 && value <= 100) {
	            System.out.println("Yellow!");
	        } if (value > 100 ) {
	            System.out.println("Green!");
	        }
	    }
	    /** ПУНКТ 5.
	     */
	    public static void compareNumbers () {
	        int a = 3;
	        int b = 4;
	        if (a >= b) {
	            System.out.println("a >= b");
	        } else System.out.println("a < b");
	    }
	}

