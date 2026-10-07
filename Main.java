import java.util.Scanner;

public class Main() {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("############## Pet Selector! #####################");
        // color
        System.out.println("Enter your favorite color (Either red, blue or green):");
        String favColor = scanner.nextLine()
        // season
        System.out.println("Enter your favorite season (winter, spring, summer, fall):");
        String favSeason = scanner.nextLine()
        // pet that the user already has
        System.out.println("Enter the pet that you already have (if one, if not then enter none):");
        String alreadyHave = scanner.nextLine()
        // name
        System.out.println("Enter your name");
        String name = scanner.nextLine()
        String pet = "none";
        if (favColor.equals("blue") && favSeason.equals("fall")){
            pet="alligator";
            }
        if (favColor.equals("blue") && favSeason.equals("spring")){
            pet="ostrich";
            }
        // if (favColor.equals(”green”) && **ADD** && favSeason.equals(“winter”)){
        //pet=”giraffe”;
        // }
        if (favColor.equals("green") && !favSeason.equals("fall") && !alreadyHave.equals("giraffe")){
            pet="dog";
            }
        // If favColor.equals(”red”) **ADD**:

        if (favSeason.equals("summer") && !alreadyHave.equals("dog") && !alreadyHave.equals("panda") && !alreadyHave.equals("porcupine")){
            pet="ponie";
            }
        // If **ADD** && favColor.equals(“blue”) && !favSeason.equals(“fall”) && !favSeason.equals(“summer”) && !alreadyHave.equals(“ostrich”){
        //   pet=”axolotl”
        // }
        if (pet.equals("none")){
            pet="pet rock";
            }
        System.out.println("Youre perfect pet is a" + pet);
    }
}