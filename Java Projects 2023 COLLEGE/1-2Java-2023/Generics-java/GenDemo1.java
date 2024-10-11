public class GenDemo1 {
    public static void main(String[] args) {
        Gen<Integer, String> mixData = new Gen<>();
        Gen<Integer, Integer> iData = new Gen<>();

        mixData.setValue(1, "One");
        iData.setValue(7, 25);

        int mdType1 = mixData.getT1Value();
        String mdType2 = mixData.getT2Value();
        int idType1 = iData.getT1Value();
        int idType2 = iData.getT2Value();

        System.out.println("First pair: " + mdType1 + " and " + mdType2);  // Outputs: First pair: 1 and One
        System.out.println("Second pair: " + idType1 + " and " + idType2);  // Outputs: Second pair: 7 and 25
    }
}
