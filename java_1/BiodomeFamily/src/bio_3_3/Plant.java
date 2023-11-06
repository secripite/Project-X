public class Plant extends Organism {
    private int flowering_time;
    private boolean exixt_Fruit;

    public Plant(String name, String species, String habitat, int flowering_t, boolean T_F) {
        super(name, species, habitat);
        this.flowering_time = flowering_t;
        this.exixt_Fruit = T_F;
    }


    public void displayInfo() {
        System.out.print(name + ", " + species + ", " + habitat + ", " + flowering_time + "월, 열매 ");
        if(exixt_Fruit){
            System.out.println("있음");
        }
        else {
            System.out.println("없음");
        }
    }
}
