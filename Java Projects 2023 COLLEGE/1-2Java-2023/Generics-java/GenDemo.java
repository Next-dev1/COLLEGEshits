public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iData = new Gen<Integer>();
        Gen<String> sData = new Gen<String>();

        iData.setValue(1);
        iData.showType();  // Outputs: Type of T is java.lang.Integer

        sData.setValue("One");
        sData.showType();  // Outputs: Type of T is java.lang.String

        int num = iData.getValue();
        String str = sData.getValue();

        System.out.println("Integer value: " + num);  // Outputs: Integer value: 1
        System.out.println("String value: " + str);  // Outputs: String value: One
    }
}
