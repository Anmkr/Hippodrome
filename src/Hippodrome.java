import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    public static Hippodrome game;

    private static List<Horse> horses = new ArrayList<>();

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            Thread.sleep(200);
            move();
            print();

        }
    }

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }

    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();

        }

    }

    public Horse getWinner() {
        Horse winner = horses.get(0);
        for (Horse horse : getHorses()) {
            if (horse.getDistance() > winner.getDistance()) {
                horse = winner;
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is" +" "+ getWinner().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<>());
        Horse horse1 = new Horse("horse1", 3, 0);
        Horse horse2 = new Horse("horse2", 3, 0);
        Horse horse3 = new Horse("horse3", 3, 0);
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game.run();
        game.getWinner();
        game.printWinner();

    }

}
