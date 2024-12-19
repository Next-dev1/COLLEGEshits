import java.util.Random;
import java.util.Scanner;
/*Members:

Cajila, Jasther N.
Mandayo, Sean V.
Regino, Xavier Bill A.
Singson, Jason Karl Bryan
Tarrayo, Jurelle S. */

public class PokemonGame {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("[Pokemon Game] ");
            System.out.println("1 - Play");
            System.out.println("2 - Exit");
            System.out.print("Press 1 or 2: ");
            int ch = s.nextInt();
            s.nextLine();

            if (ch == 1) {
                System.out.print("\nEnter trainer's name: ");
                String p1 = s.nextLine();

                while (true) {
                    System.out.println("_______________________________________________________________");
                    System.out.println("Professor Samuel Oak: ");

                    String intro = "Welcome to the Pokémon Adventure Game, Trainer " + p1 +
                                   ".\nIn this game, you will become a Pokémon Trainer." +
                                   "\nYou will battle Pokémons to become a Pokémon Master!";
                    Delay(intro, 90);

                    System.out.println("_______________________________________________________________");
                    System.out.println("Press enter to continue...");
                    s.nextLine();

                    System.out.print("Professor Samuel Oak: ");
                    String a = "Choose your Pokémon...";

                    Delay(a, 90);
                    Thread.sleep(500);

                    System.out.println("1 - Pikachu");
                    System.out.println("2 - Charmander");
                    System.out.println("3 - Squirtle");

                    System.out.print("Press the number to choose your favorite Pokemon: ");
                    int pokemon = s.nextInt();
                    s.nextLine();

                    System.out.println();

                    Pokemon opponent1 = null, opponent = null, user = null;

                    switch (pokemon) {
                    case 1:
                        user = new Pikachu();
                        opponent = new Charmander();
                        opponent1 = new Squirtle();
                        break;
                    case 2:
                        user = new Charmander();
                        opponent = new Squirtle();
                        opponent1 = new Pikachu();
                        break;
                    case 3:
                        user = new Squirtle();
                        opponent = new Pikachu();
                        opponent1 = new Charmander();
                        break;
                    default:
                        System.out.println("Invalid option. Please choose a number between 1 and 3.");
                    }

                    if (user == null) {
                        continue;
                    }

                    opponent.reset();
                    user.reset();

                    Pokemon[] pokemons = {opponent, opponent1};

                    for (int i = 0; i < pokemons.length; i++) {
                        Pokemon pokemonOpponent = pokemons[i];

                        if (i > 0) {
                            String b = "\nA new Pokémon appears!\n";
                            Delay(b, 90);
                            String op = "Your opponent is " + opponent1.getName();
                            Delay(op, 90);
                            Thread.sleep(500);
                            pokemonOpponent.opponentStats();
                        }

                        pokemonOpponent.reset();
                        user.reset();

                        while (user.getHP() > 0 && pokemonOpponent.getHP() > 0) {
                            System.out.println("\nYour turn! Choose your attack:");
                            System.out.println("1 - Normal Attack");
                            System.out.println("2 - Special Attack");
                            System.out.print("Attack: ");
                            int attack = s.nextInt();
                            System.out.println();

                            int damage = (attack == 2) ? user.specialAttack() : user.normalAttack();
                            pokemonOpponent.lowHP(damage);

                            System.out.println(pokemonOpponent.getName() + "'s HP: " + pokemonOpponent.getHP());

                            if (pokemonOpponent.getHP() <= 0) {
                                System.out.println("\nYou Win!\n" + pokemonOpponent.getName() + " is defeated.");
                                break;
                            }

                            Thread.sleep(300);
                            System.out.println("\n" + pokemonOpponent.getName() + "'s turn");
                            String atk = "Attacking...\n";
                            Delay(atk, 90);

                            Thread.sleep(1000);

                            int opponentDamage = Math.random() < 0.5 ? pokemonOpponent.normalAttack() : pokemonOpponent.specialAttack();
                            user.lowHP(opponentDamage);

                            System.out.println(user.getName() + "'s HP: " + user.getHP());

                            if (user.getHP() <= 0) {
                                System.out.println("\nYou Lose!\n" + user.getName() + " is defeated.");
                                break;
                            }
                        }
                    }

                    System.out.println("_______________________________________________________________");
                    System.out.print("Professor Samuel Oak: ");
                    String m = "Do you want to battle pokemons again or proceed to the final level?";
                    Delay(m, 90);
                    Thread.sleep(500);
                    System.out.println("A - Final Level \nP - Battle Pokemons \nX - Exit");

                    System.out.print("Professor Samuel: What will be your decision? ");
                    char yn = s.next().toUpperCase().charAt(0);

                    if (yn == 'A') {
                        System.out.println("\nProfessor Oak: The final challenge! Your opponent is MEWTWO!");

                        Pokemon boss = new Mewtwo();
                        boss.opponentStats();
                        boss.reset();
                        user.reset();

                        while (user.getHP() > 0 && boss.getHP() > 0) {
                            System.out.print("\nYour move! (1-Normal, 2-Special): ");
                            int attack = s.nextInt();

                            int damage = (attack == 2) ? user.specialAttack() : user.normalAttack();
                            boss.lowHP(damage);
                            System.out.println(boss.getName() + "'s HP: " + boss.getHP());

                            if (boss.getHP() <= 0) {
                                System.out.println("\nVictory! You defeated " + boss.getName() + "!");
                                break;
                            }

                            System.out.println("\nMewtwo attacks!");
                            user.lowHP(Math.random() < 0.5 ? boss.normalAttack() : boss.specialAttack());
                            System.out.println(user.getName() + "'s HP: " + user.getHP());

                            if (user.getHP() <= 0) {
                                System.out.println("\nDefeat! " + boss.getName() + " wins. Try again!");
                            }
                        }

                        if (user.getHP() > 0) {
                            System.out.println("\nProfessor Billy: Congratulations, Trainer! You have earned a reward.");
                            System.out.println("Choose your reward Pokémon:");
                            System.out.println("1 - Raichu");
                            System.out.println("2 - Greninja");
                            System.out.println("3 - Charizard");
                            System.out.print("Enter the number of your choice: ");

                            int choice = s.nextInt();
                            String rewardPokemon = "";

                            switch (choice) {
                                case 1:
                                    rewardPokemon = "Raichu";
                                    break;
                                case 2:
                                    rewardPokemon = "Greninja";
                                    break;
                                case 3:
                                    rewardPokemon = "Charizard";
                                    break;
                                default:
                                    System.out.println("Invalid choice. No Pokémon rewarded.");
                            }

                            if (!rewardPokemon.isEmpty()) {
                                System.out.println("\nYou received " + rewardPokemon + " and a Badge! Congratulations!");
                            }

                            System.out.println("\nDo you want to play again? (Y/N)");
                            char replay = s.next().toUpperCase().charAt(0);
                            if (replay == 'N') {
                                System.out.println("Thank you for playing! Goodbye!");
                                break;
                            }
                        }
                    } else if (yn == 'X') {
                        System.out.println("Thank you...\nSee you next time, Trainer!");
                        break;
                    } else if (yn == 'P') {
                        continue;
                    }
                }
            } else {
                System.out.println("Thank you...\nSee you next time, Trainer!");
                break;
            }
        }
    }

    public static void Delay(String message, int delay) {
        for (char letter : message.toCharArray()) {
            System.out.print(letter);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Error in delay");
            }
        }
        System.out.println();
    }
}

abstract class Pokemon {
    String name;
    int HP;
    int low_HP;
    int attack;
    int s_attack;
    Random random = new Random();

    public Pokemon(String name, int HP, int attack, int s_attack) {
        this.name = name;
        this.HP = HP;
        this.attack = attack;
        this.s_attack = s_attack;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return low_HP;
    }

    public void lowHP(int damage) {
        low_HP = Math.max(low_HP - damage, 0);
    }

    public void reset() {
        low_HP = HP;
    }

    public int normalAttack() {
        int damage = random.nextInt((attack / 4) + 1);
        System.out.println(name + " uses Normal Attack and deals " + damage + " damage!");
        return damage;
    }

    public int specialAttack() {
        int damage = random.nextInt((s_attack / 2)) + (s_attack / 2);
        System.out.println(name + " uses Special Attack and deals " + damage + " damage!");
        return damage;
    }

    public abstract void userStats();

    public abstract void opponentStats();
}

class Pikachu extends Pokemon {
    public Pikachu() {
        super("Pikachu", 60, 70, 85);
    }
    public void userStats() {
        System.out.println(getName() + "'s stats:");
        System.out.println("HP: " + HP);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: 40");
        System.out.println("Special Attack: " + s_attack);
        System.out.println("Special Defense: 45");
        System.out.println("Speed: 90");
    }
    public void opponentStats() {
        System.out.println(getName() + "'s stats:");
        System.out.println("HP: " + HP);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: 40");
        System.out.println("Special Attack: " + s_attack);
        System.out.println("Special Defense: 45");
        System.out.println("Speed: 90");
    }
}

class Charmander extends Pokemon {
    public Charmander() {
        super("Charmander", 60, 52, 60);
    }

    public void userStats() {
        System.out.println(getName() + "'s stats:");
        System.out.println("HP: " + HP);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: 39");
        System.out.println("Special Attack: " + s_attack);
        System.out.println("Special Defense: 49");
        System.out.println("Speed: 65");
    }
    public void opponentStats() {
        System.out.println(getName() + "'s stats:");
        System.out.println("HP: " + HP);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: 39");
        System.out.println("Special Attack: " + s_attack);
        System.out.println("Special Defense: 49");
        System.out.println("Speed: 65");
    }
}

class Squirtle extends Pokemon {
    public Squirtle() {
        super("Squirtle", 60, 48, 50);
    }

    public void userStats() {
        System.out.println(getName() + "'s stats:");
        System.out.println("HP: " + HP);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: 65");
        System.out.println("Special Attack: " + s_attack);
        System.out.println("Special Defense: 64");
        System.out.println("Speed: 43");
    }
    public void opponentStats() {
        System.out.println(getName() + "'s stats:");
        System.out.println("HP: " + HP);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: 65");
        System.out.println("Special Attack: " + s_attack);
        System.out.println("Special Defense: 64");
        System.out.println("Speed: 43");
    }
}

class Mewtwo extends Pokemon {
    public Mewtwo() {
        super("Mewtwo", 100, 80, 120);
    }
    public void userStats() {
        System.out.println(getName() + "'s stats:");
        System.out.println("HP: " + HP);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: 65");
        System.out.println("Special Attack: " + s_attack);
        System.out.println("Special Defense: 64");
        System.out.println("Speed: 43");
    }
    public void opponentStats() {
        System.out.println(getName() + "'s stats: HP=" + HP + ", Attack=" + attack + ", Special Attack=" + s_attack);
    } 
}
