public class HelloBiodome02 {
    public static void main(String[] args) {
        try {
            int energy1 = Integer.parseInt(args[0]);
            int energy2 = Integer.parseInt(args[1]);
            int energy3 = Integer.parseInt(args[2]);

            double sum = energy1+energy2+energy3;

            if(energy1<0){
                System.out.println("�����Դϴ�.");
                return;
            }
            if(energy2<0){
                System.out.println("�����Դϴ�.");
                return;
            }
            if(energy3<0){
                System.out.println("�����Դϴ�.");
                return;
            }

            System.out.println("�� ������ ��뷮�� " + (int)sum +"�Դϴ�.");
            System.out.printf("�¾籤 %.7f%%, ǳ�� %.7f%%, ���� %.7f%%",(energy1/sum*100),(energy2/sum*100),(energy3/sum*100));
        } catch (Exception e)
        {
            System.out.println("����!");
        }
    }
}