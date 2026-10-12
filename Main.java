import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("############## Pet Selector! #####################");
        // color
        System.out.println("Enter your favorite color (Either red, blue or green):");
        String favColor = scanner.nextLine().toLowerCase();
        // season
        System.out.println("Enter your favorite season (winter, spring, summer, fall):");
        String favSeason = scanner.nextLine().toLowerCase();
        // pet that the user already has
        System.out.println("Enter the pet that you already have (if one, if not then enter none):");
        String alreadyHave = scanner.nextLine().toLowerCase();
        // name
        System.out.println("Enter your name");
        String name = scanner.nextLine().toLowerCase();
        String pet = "none";
        // check for a real name
        if ("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0, 1)) == -1) {
            System.out.println("Please insert a real name.");
            return; // ends the program
        }
        // if statements
        //if the first letter is consonant
        String firstConsonant = (name.substring(0, 1));
        int number = (int)"aeiouAEIOU".indexOf(firstConsonant);
        boolean consonant = false;
        if (number == 0) {
            consonant=false;
        } else {
            consonant=true;
        }
        //
        if (favColor.equals("blue") && favSeason.equals("fall")){
            pet="alligator";
            }
        if (favColor.equals("blue") && favSeason.equals("spring")){
            pet="ostrich";
            }
        if (favColor.equals("green") && (consonant==true) && favSeason.equals("winter")){
            pet="giraffe";
         }
        if (favColor.equals("green") && !favSeason.equals("fall") && !alreadyHave.equals("giraffe")){
            pet="dog";
            }
        if (favColor.equals("red")){
          pet="panda";
        } else if (consonant==false) {
            pet="porcupine";
        }

        if (favSeason.equals("summer") && !alreadyHave.equals("dog") && !alreadyHave.equals("panda") && !alreadyHave.equals("porcupine")){
            pet="ponie";
            }
        if ((consonant==true) && (favColor.equals("blue")) && (!favSeason.equals("fall")) && (!favSeason.equals("summer")) && (!alreadyHave.equals("ostrich"))){
           pet="axolotl";
         }
        if (pet.equals("none")){
            pet="pet rock";
            }
        String firstLetter = pet.substring(0, 1);
        if (firstLetter.equals("a") || firstLetter.equals("e") || firstLetter.equals("i") || firstLetter.equals("o") || firstLetter.equals("u")) {
            System.out.println("You're perfect pet is an " + pet + "!");
            
        } else {
            System.out.println("You're perfect pet is a " + pet + "!");
        }
        
    }
}