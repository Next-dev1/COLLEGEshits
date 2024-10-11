public class StringsUsingEqualsMethod {
    public static void main(String args[]) {
        
        String name = "john";
        
        if(name.equalsIgnoreCase("John")){
            System.out.print("Your name is: " + name);
        }
    }
}