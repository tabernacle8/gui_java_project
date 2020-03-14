import java.util.ArrayList;
import java.util.Random;

/*
Run Like:
otherfile.main(args);
*/

class MainRunner{

    protected static ArrayList<String> locations = new ArrayList<>();
    protected static boolean running = false;

    public MainRunner(){

    }

    public static void computerTurn(){

        boolean choseSpace = false;
        while(choseSpace ==false){
             Random rand = new Random();
             int chosen = rand.nextInt(9);
             if(locations.get(chosen).equals("none")){
                locations.set(chosen,"Computer");
             }
             choseSpace = true; 
        }
    }

    public static void main (String[] args)
	{
        System.out.println("Boot!");
        running = true;
        for(int i=0; i<9;i++){
        locations.add("none");
        }
        ButtonPannel.main(args);
        GraphicsPannel.main(args);


    }
}