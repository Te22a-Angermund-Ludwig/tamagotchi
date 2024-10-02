import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class tamagotchi {
    private int hunger = 0;
    private int boredom = 0;
    private ArrayList<String> words;
    private boolean isAlive;
    public String name;
    private Random generator = new Random();

    public void Tick(){
        hunger++;
        boredom++;
        if (hunger > 10 || boredom > 10){
            isAlive = false;
        }
    }

    public void feed(){
        hunger--;
        if (hunger <= 0){
            hunger = 0;
        }
    }

    public void speak(){

    }

    public void teach(String word){
        words.add(word);
    }

    public void printStats(){

    }

    public boolean getAlive(){
        return isAlive;
    }

    private void reduceBoredome(){
        boredom--;
        if (boredom <= 0){
            boredom = 0;
        }
    }
}
