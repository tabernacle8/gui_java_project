import java.util.ArrayList;
import java.util.Random;


class MainRunner {

    protected static ArrayList < String > locations = new ArrayList < > ();
    protected static boolean running = false;
    protected static int spacesleft = 9;
    protected static boolean gameInSession = true;

    public MainRunner() {

    }

    public static void computerTurn() {
        if (gameInSession == true) {
            boolean choseSpace = false;

            if (spacesleft == 0) {
                System.out.println("\n\nIt's a tie!!!\n\n");
                System.exit(0);
            }
            while (choseSpace == false) {
                Random rand = new Random();
                int chosen = rand.nextInt(9);
                if (locations.get(chosen).equals("none")) {
                    locations.set(chosen, "Computer");
                    choseSpace = true;
                    ButtonPannel.disable(chosen + 1);
                    spacesleft--;
                }
            }
        }
    }

    public static String checkPlayerWin() {
        if (locations.get(0).equals("Player") && locations.get(1).equals("Player") && locations.get(2).equals("Player")) {
            return ("r1");
        }
        if (locations.get(3).equals("Player") && locations.get(4).equals("Player") && locations.get(5).equals("Player")) {
            return ("r2");
        }
        if (locations.get(6).equals("Player") && locations.get(7).equals("Player") && locations.get(8).equals("Player")) {
            return ("r3");
        }

        if (locations.get(0).equals("Player") && locations.get(3).equals("Player") && locations.get(6).equals("Player")) {
            return ("c1");
        }
        if (locations.get(1).equals("Player") && locations.get(4).equals("Player") && locations.get(7).equals("Player")) {
            return ("c2");
        }
        if (locations.get(2).equals("Player") && locations.get(5).equals("Player") && locations.get(8).equals("Player")) {
            return ("c3");
        }
        if (locations.get(0).equals("Player") && locations.get(4).equals("Player") && locations.get(8).equals("Player")) {
            return ("d1");
        }
        if (locations.get(1).equals("Player") && locations.get(4).equals("Player") && locations.get(6).equals("Player")) {
            return ("d2");
        }

        return ("none");
    }

    public static String checkComputerWin() {
        if (locations.get(0).equals("Computer") && locations.get(1).equals("Computer") && locations.get(2).equals("Computer")) {
            return ("r1");
        }
        if (locations.get(3).equals("Computer") && locations.get(4).equals("Computer") && locations.get(5).equals("Computer")) {
            return ("r2");
        }
        if (locations.get(6).equals("Computer") && locations.get(7).equals("Computer") && locations.get(8).equals("Computer")) {
            return ("r3");
        }

        if (locations.get(0).equals("Computer") && locations.get(3).equals("Computer") && locations.get(6).equals("Computer")) {
            return ("c1");
        }
        if (locations.get(1).equals("Computer") && locations.get(4).equals("Computer") && locations.get(7).equals("Computer")) {
            return ("c2");
        }
        if (locations.get(2).equals("Computer") && locations.get(5).equals("Computer") && locations.get(8).equals("Computer")) {
            return ("c3");
        }
        if (locations.get(0).equals("Computer") && locations.get(4).equals("Computer") && locations.get(8).equals("Computer")) {
            return ("d1");
        }
        if (locations.get(1).equals("Computer") && locations.get(4).equals("Computer") && locations.get(6).equals("Computer")) {
            return ("d2");
        }

        return ("none");
    }

    public static void main(String[] args) {
        System.out.println("Boot!");
        running = true;
        for (int i = 0; i < 9; i++) {
            locations.add("none");
        }
        ButtonPannel.main(args);
        GraphicsPannel.main(args);
    }
}