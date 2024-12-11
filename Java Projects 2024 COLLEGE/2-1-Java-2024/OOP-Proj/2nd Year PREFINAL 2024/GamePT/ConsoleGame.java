import java.util.Scanner;

interface Game {
    void startGame();
}

interface GameMode {
    void selectMode(int mode);
}

interface Player {
    void setPlayerName(String name);
}

class ConsoleGame implements Game, GameMode, Player {
    private String playerName;
    private String gameMode;

    @Override
    public void startGame() {
        System.out.println("Press P to start playing, " + playerName + ".");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("P")) {
            System.out.println("Starting game in " + gameMode + " mode. Have fun, " + playerName + "!");
        } else {
            System.out.println("Invalid input. Exiting game.");
        }
    }

    @Override
    public void selectMode(int mode) {
        if (mode == 1) {
            gameMode = "Story";
        } else if (mode == 2) {
            gameMode = "Survival";
        } else {
            System.out.println("Invalid mode selected. Defaulting to Story mode.");
            gameMode = "Story";
        }
    }

    @Override
    public void setPlayerName(String name) {
        playerName = name;
    }

    public static void main(String[] args) {
        ConsoleGame game = new ConsoleGame();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        game.setPlayerName(name);

        System.out.println("Press 1 or 2 to select your game mode.");
        System.out.println("1 - Story");
        System.out.println("2 - Survival");
        int mode = scanner.nextInt();
        game.selectMode(mode);

        game.startGame();
    }
}
