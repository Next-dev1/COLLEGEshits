import java.util.Scanner;

interface GameMode {
    void start();
}

class StoryMode implements GameMode {
    private String playerName;
    
    public StoryMode(String playerName) {
        this.playerName = playerName;
    }

    public void start() {
        System.out.println("Starting story mode, " + playerName + "...");
    }
}

class SurvivalMode implements GameMode {
    private String playerName;
    
    public SurvivalMode(String playerName) {
        this.playerName = playerName;
    }

    public void start() {
        System.out.println("Starting survival mode, " + playerName + "...");
    }
}

interface Player {
    void enterName();
    void selectMode();
}

interface Game {
    void play();
}

class TextGame implements Player, Game {
    private Scanner scanner = new Scanner(System.in);
    private String playerName;
    private GameMode gameMode;

    public void enterName() {
        System.out.print("Enter your name: ");
        playerName = scanner.nextLine();
    }

    public void selectMode() {
        System.out.println("Press 1 or 2 to select your game mode.");
        System.out.println("1 - Story");
        System.out.println("2 - Survival");
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        if (choice == 1) {
            gameMode = new StoryMode(playerName);
        } else if (choice == 2) {
            gameMode = new SurvivalMode(playerName);
        } else {
            System.out.println("Invalid choice. Defaulting to Story mode.");
            gameMode = new StoryMode(playerName);
        }
    }

    public void play() {
        System.out.println("Press P to start playing, " + playerName + ".");
        String start = scanner.nextLine();
        
        if (start.equalsIgnoreCase("P")) {
            gameMode.start();
        } else {
            System.out.println("Invalid input. Exiting game.");
        }
    }

    public static void main(String[] args) {
        TextGame game = new TextGame();
        game.enterName();
        game.selectMode();
        game.play();
    }
}
