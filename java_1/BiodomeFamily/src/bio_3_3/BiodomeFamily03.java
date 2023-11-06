public class BiodomeFamily03 {
    public static void main(String[] args) {
        Animal animal1, animal2;
        Plant plant1, plant2;

        animal1 = new Animal("펭귄", "동물", "남극", "육식", "물고기");
        animal2 = new Animal("코알라", "동물", "호주", "초식", "유칼립투스");
        plant1 = new Plant("선인장", "식물", "사막", 11, true);
        plant2 = new Plant("페퍼민트", "식물", "정원", 7, false);

        LifeNest lifeNest = new LifeNest();

        lifeNest.push(animal1);
        lifeNest.push(animal2);
        lifeNest.push(plant1);
        lifeNest.push(plant2);

        lifeNest.print_all();

        lifeNest.pop(animal2);
        lifeNest.pop(plant1);

        lifeNest.print_all();


        Mammal mammal = new Mammal("고래", "동물", "바다", "육식", "물고기", true);
        Bird bird = new Bird("새", "동물", "하늘", "육식", "벌레", 50);
        Fish fish = new Fish("물고기", "동물", "민물", "육식", "작은 물고기", 30);

        lifeNest.push(mammal);
        lifeNest.push(bird);
        lifeNest.push(fish);

        System.out.println();

        mammal.giveBirth();
        bird.fly();
        fish.swim();

    }
}
