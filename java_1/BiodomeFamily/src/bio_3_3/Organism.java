public class Organism {
    protected String name;
    protected String species;
    protected String habitat;

    public Organism(String n, String specie, String habit) {
        this.name = n;
        this.species = specie;
        this.habitat = habit;
    }

    public void displayInfo() {
        System.out.println(name + ", " + species + ", " + habitat);
    }

    public String getName() {
        return name;
    }
}
