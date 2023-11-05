package bio_3_2;

import java.util.Scanner;

public class BiodomeFamily02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("이름, 종, 주요 서식지, (Bonus) 특징과 수명을 \",\"으로 구분하여 입력하세요. 입력을 끝내려면 0을 입력하세요. ex)펭귄 동물 남극");
        int cnt = 0;
        while (true){
            String temp = scan.nextLine();
            String[] arr = null;
            try
            {
                arr = temp.split(",");
                if(arr[0].equals("0")) {
                    break;
                }
            }
            catch (Exception e){
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            String name = arr[0];
            String specie = arr[1];
            String habit = arr[2];
            String character = arr[3];
            String  life = arr[4];
            LifeNest.push(name, specie, habit, character, life, cnt++);
        }

        print_all();

        System.out.println("삭제할 동물의 이름을 입력하세요. 입력을 끝내려면 0을 입력하세요.ex)강아지");
        while (true){
            String del_name = scan.next();
            if(del_name.equals("0")) {
                break;
            }
            int flag = 0;
            for(int i = 0; i<LifeNest.organismList.length - 1;i++){
                if(Organism.name_getter(LifeNest.organismList[i]).equals(del_name)) {
                    LifeNest.pop(i);
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.println("존재하지 않는 동물입니다. 다시 입력해 주십세요");
            }

        }

        System.out.println("수정할 동물의 이름과 서식지를 입력하세요. 입력을 끝내려면 0을 입력하세요. ex)소나무 바다");
        while (true){
            String change_name = scan.next();
            if(change_name.equals("0")) {
                break;
            }
            int flag = 0;
            for(int i = 0; i<LifeNest.organismList.length - 1;i++){
                if(Organism.name_getter(LifeNest.organismList[i]).equals(change_name)) {
                    String change_habitat = scan.next();
                    LifeNest.change_habitat(i,change_habitat);
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.println("존재하지 않는 동물입니다. 다시 입력해 주십세요");
                String change_habitat = scan.next();
            }

        }


        print_all();

        System.out.println("(Bonus)수정할 동물의 이름과 특징을 입력하세요. 입력을 끝내려면 0을 입력하세요. ex)소나무 불에 강하다");
        while (true){
            String change_name = scan.next();
            if(change_name.equals("0")) {
                break;
            }
            int flag = 0;
            for(int i = 0; i<LifeNest.organismList.length - 1;i++){
                if(Organism.name_getter(LifeNest.organismList[i]).equals(change_name)) {
                    String change_charater = scan.nextLine();
                    LifeNest.change_charater(i,change_charater);
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.println("존재하지 않는 동물입니다. 다시 입력해 주십세요");
                String change_habitat = scan.next();
            }
        }

        print_all();
    }

    public static void print_all(){
        System.out.println("전체 동식물 목록 출력:");

        for(int i = 0, cnt = 1;i < LifeNest.organismList.length-1;i++) {
            if (LifeNest.memo[i] == 1) {
                System.out.println(cnt+". "+Organism.name_getter(LifeNest.organismList[i])+", "+Organism.species_getter(LifeNest.organismList[i])+", "+Organism.characteristic_getter(LifeNest.organismList[i])+", "+Organism.habitat_getter(LifeNest.organismList[i])+", "+Organism.lifeSpan_getter(LifeNest.organismList[i]));
                cnt++;
            }
        }
    }
}
