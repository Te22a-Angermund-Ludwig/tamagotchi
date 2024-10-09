import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class tamagotchi {
    private int hunger = 0;
    private int boredom = 0;
    private ArrayList<String> words = new ArrayList<>();
    private boolean isAlive = true;
    public String name;
    private Random generator = new Random();
    Scanner input = new Scanner(System.in);

    public void Tick(){
        hunger++;
        boredom++;
        if (hunger >= 10 || boredom >= 10){
            if (boredom>=10)
            {
                System.out.println(name+" blev så uttråkad att den dog!");
            }
            if (hunger>=10) {
                System.out.println(name+" svälte till döds!");
            }
            if (hunger >=10 && boredom>=10){
                System.out.println("Du kan verkligen inte ta hand om "+name);
            }
            isAlive = false;
        }
    }

    public void feed(){
        hunger = hunger - 2;
        if (hunger <= 0){
            hunger = 0;
        }
        System.out.println("Du matar "+name+ " och den är nu inte lika hungrig");
    }

    public void speak(){
        if (words.isEmpty()){
            System.out.println("He cannot speak yet!");
        }
        else {
            System.out.println(words.get(generator.nextInt(words.size())));
        }
        reduceBoredome();
    }

    public void teach(){
        System.out.println("Vilket ord vill du att din tamagotchi ska kunna?");
        System.out.print("Ord: ");
        String word = input.next();
        words.add(word);
        reduceBoredome();
    }

    public void printStats(){
        System.out.println(name+ "'s stats");
        System.out.println("Hunger: " + hunger);
        System.out.println("Boredom: " + boredom);
    }

    public boolean getAlive(){
        return isAlive;
    }

    private void reduceBoredome(){
        boredom = boredom - 2;
        if (boredom <= 0){
            boredom = 0;
        }
    }

    public void newTamagotchi(String incomingName){
        name = incomingName;
    }

    public void gambleLife(){
        Random random = new Random();
        int gamble = random.nextInt(1,3);
        System.out.println("...");
        if (gamble == 1){
            System.out.println(name+"Klarade sig själv ett bra tag tills han dog utav ålder!");
        }
        else if (gamble == 2){
            System.out.println(name+"Klarade sig inte själv och dog strax efter du lämnade den...");
        }
    }

}
