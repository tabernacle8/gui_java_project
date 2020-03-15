import java.util.ArrayList;
import java.util.Random;


class MainRunner{

    protected static ArrayList<String> locations = new ArrayList<>();
    protected static boolean running = false;
    protected static int spacesleft = 9;

    public MainRunner(){

    }

    public static void computerTurn(){

        boolean choseSpace = false;
        
        if(spacesleft==0){
            System.out.println("\n\nIt's a tie!!!\n\n");
            System.exit(0);
        }
        while(choseSpace ==false){
             Random rand = new Random();
             int chosen = rand.nextInt(9);
             if(locations.get(chosen).equals("none")){
                locations.set(chosen,"Computer");
                choseSpace = true;
                ButtonPannel.disable(chosen+1); 
                spacesleft--;
             }
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