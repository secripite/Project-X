package bio_3_2;

public class Organism {

    private String name;
    private String species;
    private String habitat;

    private String characteristic;

    private String lifeSpan;

    public static void displayInfo(Organism value, int num) {
        System.out.println(num + ". " + value.name + ", " + value.species + ", " + value.habitat);
    }


    public static void name_setter(Organism val, String value) {
        val.name = value;
    }

    public static void species_setter(Organism val, String value) {
        val.species = value;
    }

    public static void habitat_setter(Organism val, String value) {
        val.habitat = value;
    }

    public static void characteristic_setter(Organism val, String value) {
        val.characteristic = value;
    }

    public static void lifeSpan_setter(Organism val, String value) {
        val.lifeSpan = value;
    }

    public static String name_getter(Organism val) {
        return val.name;
    }

    public static String species_getter(Organism val) {
        return val.species;
    }

    public static String habitat_getter(Organism val) {
        return val.habitat;
    }

    public static String characteristic_getter(Organism val) {
        return val.characteristic;
    }

    public static String lifeSpan_getter(Organism val) {
        return val.lifeSpan;
    }


}