import java.util.LinkedList;

public class MyLinkedList{
    public static void main (String [] args){
        LinkedList <String> games = new LinkedList<>();

        games.add("Valorant");
        games.add("Counter Strike");
        games.add("The Crew 2");
        games.add("Fallout 4");

        System.out.println(games);
        
        for (String loop : games) {
            System.out.println(loop);
        }
    }
}