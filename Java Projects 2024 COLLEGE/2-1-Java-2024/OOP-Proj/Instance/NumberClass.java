public class NumberClass {
    public static int num = 0;
    public static void main(String[] args) {
        NumberClass.num = 4;
        NumberClass nc1 = new NumberClass();
        NumberClass nc2 = new NumberClass();
        NumberClass nc3 = new NumberClass();

        nc1.num = 6;
        nc2.num = 5;
        nc3.num = 7;

        System.out.println(NumberClass.num);
    }
}
// Basically the instance method can call the static method or update a static variable so
// the static method nc3 will be the output for the static num by instancng it.