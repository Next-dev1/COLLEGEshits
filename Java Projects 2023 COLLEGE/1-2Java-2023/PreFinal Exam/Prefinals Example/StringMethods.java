public class StringMethods {
    public static void main(String args[]) {
    
        String name = "Nicki";
        
        System.out.println("Character index: " + name.charAt(3)); //character based on index number
        System.out.println("Comparing name to Nicki Minaj: " + name.compareTo("Nicki Minaj")); //0 - equal, negative, positive
        System.out.println("Connecting another word: " + name.concat(" - Super Bass")); //connects another string
        System.out.println("Is it equal to Nicki only? " + name.equals("Nicki")); //true or false 
        System.out.println("Uppercase or lowercase: " + name.equalsIgnoreCase("nicki")); //disregards uppercase or lowercase
        System.out.println("Index of C is: " + name.indexOf("c")); //displays the index number of the character
        System.out.println("Last index of i: " + name.lastIndexOf("i")); //displays the last index number of the character
        System.out.println("Length of: " + name.length()); //displays the number of characters in the string
        System.out.println("Uppercase: " + name.toUpperCase()); //converts to uppercase
        System.out.println("Lowercase: " + name.toLowerCase()); //converts to lowercase
        System.out.println("Replacing i with o: " + name.replace('i', 'o')); //replaces the letter specified to another preferred letter. Separator is coma
        System.out.println("Start with the letter c: " + name.substring(2)); //defines the start of index of character to be displayed
        System.out.println("icki only: " + name.substring(1, 4)); //range of characters to be displayed
        System.out.println("Remove whitespaces: " + name.trim()); //removes whitespaces
    }
}