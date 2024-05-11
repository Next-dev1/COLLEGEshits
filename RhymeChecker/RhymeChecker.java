import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RhymeChecker {
    public static void main(String[] args) {
        while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("WELCOME TO RHYME GAME!! ");
        System.out.println("Enter the first word: ");
        String word1 = sc.nextLine();

        System.out.println("Enter the second word: ");
        String word2 = sc.nextLine();

        String sub = word1.substring(word1.length() - 2);

        Pattern pattern = Pattern.compile("[a-zA-Z]{1,2}" + sub + "$");
        Matcher matcher = pattern.matcher(word2);

        if (matcher.matches() && word1.matches("[a-zA-Z]{1,2}" + sub + "$")) {
            System.out.println(word2 + " rhymes with " + word1);
        } else {
            System.out.println("I'm not sure! Sorry!");
        }
            
        }
        
    }
}