class Name {

    public String mate (String name1){
        return name1;
    }
    public String mate (String name1, String name2){
        return name1 + name2;
    }
    public String mate (String name1, String name2, String name3){
        return name1 + name2 + name3;
    }
}

public class NameMethod {
    public static void main (String [] args){

        Name obj = new Name();


        System.out.println(obj.mate("Skibidi "));
        System.out.println(obj.mate("Fanum ", "Taxx"));
        System.out.println(obj.mate("Rizzler ", "Ohio ", "Shizumi uwu"));

    } 
}
// This is the example of method overloading in java.
//Programmed by Sean :>>