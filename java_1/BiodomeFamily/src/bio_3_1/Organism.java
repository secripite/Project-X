package bio_3_1;

public class Organism {

    public String name;
    public String species;
    public String habitat;
    public static void displayInfo(Organism value, int num) {
        System.out.println(num + ". " + value.name + ", " + value.species + ", " + value.habitat);
    }
}