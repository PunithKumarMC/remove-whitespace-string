//Write a Java Program to Remove Leading and Trailing White Space From a String in Java.
public class Main {
    public static void main(String[] args) {
        String sen = new String("     MR MC    ");
        String word = sen.trim();
        System.out.println("removed leading and trailing spaces "+word);
    }
}