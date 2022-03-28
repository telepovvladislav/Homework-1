/**
 * Java. Lesson 2. Homework 2
 */
public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(winthin10and20(-20,10));
        isPositiveOrNegative(0);
        System.out.println(isNegative(-5)); //true, если число отрицательное, false - если положительное.
        printWorldNTimes("Boom",2);
        System.out.println(checkYear (2022));
    }

    /** Пункт 1.
     */
     static boolean winthin10and20 (int x1, int x2) {
        int sum = x1 + x2;
        return (10 <= sum && sum <= 20)? true : false;
    }

    /** Пункт 2.
     */
     static void isPositiveOrNegative (int x) {
        System.out.println((x >= 0)? "Positive" : "Negative");
    }

    /** Пункт 3.
     */
     static boolean isNegative (int x) {
        return ( x < 0 )? true : false;
    }

    /** Пункт 4.
     */
     static void printWorldNTimes (String world, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(boom);
    }
}
