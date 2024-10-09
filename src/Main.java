import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vad vill du att din Tamagotchi ska heta?");
        System.out.print("Namn: ");
        String namn = input.next();
        tamagotchi nummer1 = new tamagotchi();
        nummer1.newTamagotchi(namn);

        while(true) {
            System.out.print("Vad vill du göra med "+nummer1.name+"?");
            System.out.println("1. Mata");
            System.out.println("2. lära ord");
            System.out.println("3. prata med "+nummer1.name);
            System.out.println("4. visa stats");
            System.out.println("5. Avsluta");
            switch(input.next()) {
                case "1":
                    nummer1.feed();
                    break;
                case "2":
                    nummer1.teach();
                    break;
                case "3":
                    nummer1.speak();
                    break;
                case "4":
                    nummer1.printStats();
                    break;
                case "5":
                    System.out.println(nummer1.name +" säger Hejdå!");
                    nummer1.gambleLife();
                    return;
                default:
                    break;

            }
            nummer1.Tick();
        }


    }
}