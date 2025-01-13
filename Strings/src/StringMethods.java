import java.util.Arrays;
import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Senith";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('e'));
        
    }
}
