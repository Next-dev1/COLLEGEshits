public class EnumTutorial {
    public static void main(String[] args) {
        for (Cereals cereals : Cereals.values()) {
            System.out.println("");
            System.out.println(cereals + " " + cereals.getLevelOfDeliciousness());
            System.out.println("");

        }
    
    /*DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;
    
    if (day == DaysOfTheWeek.THURSDAY) {
        System.out.println("");
        System.out.println("Yay it's almost Friday!!");
        System.out.println("");

    }
    
    for (DaysOfTheWeek myDay : DaysOfTheWeek.values()){
        System.out.println(myDay);
    }*/
    }
}
