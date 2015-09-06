import java.util.Arrays;
public class Mystery3 {
    public static void mystery(int[] arr, int x) {
        x = 0;
        arr[0] = arr[5];
        arr[1] = arr[2];
        arr[3] = arr.length;
    }

    static int getLengthAndStuff(String s)
    {
	int l = s.length();
	s += " Bye"; // be polite
	System.out.println("During call: " + s);
	return l;
    }
    public static void main(String[] args) {
        // Mystery array part
	int x = 5;
        int[] xs = {0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(xs));
        mystery(xs, x);
        // Point (B)
        System.out.println(Arrays.toString(xs));
        // String part
        System.out.println("\n\n\nString 'manipulation'\n\n");
        String s = "Hello";
        System.out.println("Before call : " + s);
        int l = getLengthAndStuff(s);
        System.out.println("After call: " + s);
        System.out.println(l);
        
    }
}
