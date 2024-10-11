public class StringNestedIf{
    public static void main(String args[]) {
        
        String month = "February";
        
        if(month.equalsIgnoreCase("January")){
            System.out.print("Month is January");
        }
        else if(month.equalsIgnoreCase("February")){
            System.out.print("Month is February");
        }
        else{
            System.out.print("Month is out of range");
        }
    }
}