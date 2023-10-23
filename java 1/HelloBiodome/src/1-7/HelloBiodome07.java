public class HelloBiodome07 {
    public static void main(String[] args) {
        try {
            String DNA = new String(args[0]);

            DNA = dna_sum(args, DNA);

            String say = dna_zip(DNA);

            System.out.println(say);
        } catch (Exception e) {
            System.out.println("염기서열이 입력되지 않았습니다.");
        }
    }

    public static String dna_sum(String[] DNA_with_space, String DNA_sum) {
        DNA_sum = "";
        for(int i=0;;i++){
            try {
                DNA_sum += DNA_with_space[i];
                DNA_sum += " ";
            } catch (Exception e) {
                DNA_sum = DNA_sum.substring(0, DNA_sum.length() - 1);
                return DNA_sum;
            }
        }
    }

    public static String dna_zip(String DNA) {
        char temp = DNA.charAt(0);
        int cnt = 0;
        String result = "";

        for (int i = 0; i < DNA.length(); i++) {

            if (DNA.charAt(i) != 'C' && DNA.charAt(i) != 'Y' && DNA.charAt(i) != 'J' && DNA.charAt(i) != 'E'
                    && DNA.charAt(i) != 'H' && DNA.charAt(i) != ' ') {
                return "염기서열은 C, J, H, E, Y 다섯가지로만 입력됩니다. 확인하고 다시 입력해주세요";

            }

            if (DNA.charAt(i) == ' ') {
                result += temp;
                result += cnt;
                result += " ";
                i++;
                temp = DNA.charAt(i);
                cnt = 0;
            } else if (DNA.charAt(i) != temp) {
                result += temp;
                result += cnt;
                temp = DNA.charAt(i);
                cnt = 0;
            }
            cnt++;
        }
        result += temp;
        result += cnt;

        return result;
    }
}