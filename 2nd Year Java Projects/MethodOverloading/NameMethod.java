class Name {

    public String mate1 (String name1, String name2){
        return name1 + name2;
    }
    public String mate2 (String name1, String name2){
        return name1 + name2;
    }
    public String mate3 (String name1, String name2){
        return name1 + name2;
    }
}

public class NameMethod {
    public static void main (String [] args){

        Name obj = new Name();

        
        System.out.println(obj.mate1("Skibidi ", "Toilet"));
        System.out.println(obj.mate2("Fanum ", "Taxx"));
        System.out.println(obj.mate2("Rizzler ", "Ohio"));

    } 
}
// This is the example of method overloading in java.
//Programmed by Sean :>>