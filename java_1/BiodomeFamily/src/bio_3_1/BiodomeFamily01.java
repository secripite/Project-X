package bio_3_1;

import java.util.Scanner;

public class BiodomeFamily01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("이름, 종, 주요 서식지를 공백으로 구분하여 입력하세요. 입력을 끝내려면 0을 입력하세요. ex)펭귄 동물 남극");
        int cnt = 0;
        while (true){
            String name = scan.next();
            if(name.equals("0")) {
                break;
            }
            String specie = scan.next();
            String habit = scan.next();
            LifeNest.push(name, specie, habit,cnt++);
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
                if(LifeNest.organismList[i].name.equals(del_name)) {
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
                if(LifeNest.organismList[i].name.equals(change_name)) {
                    String change_habitat = scan.next();
                    LifeNest.change(i,change_habitat);
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.println("존재하지 않는 동물입니다. 다시 입력해 주십세요");
                String change_habitat = scan.next();
            }

        }

        print_all();

        System.out.println("Bonus 검색할 동물의 이름을 입력하세요. 입력을 끝내려면 0을 입력하세요. ex)고양이");
        while (true){
            String search_name = scan.next();
            if(search_name.equals("0")) {
                break;
            }
            LifeNest.searchOrganismByName(search_name);
        }
    }

    public static void print_all(){
        System.out.println("전체 동식물 목록 출력:");

        for(int i = 0, cnt = 1;i < LifeNest.organismList.length-1;i++) {
            if (LifeNest.memo[i] == 1) {
                System.out.println(cnt+". "+LifeNest.organismList[i].name+", "+LifeNest.organismList[i].species+", "+LifeNest.organismList[i].habitat);
                cnt++;
            }
        }
    }
}
