public class HelloBiodome07 {
    public static void main(String[] args) {
        try {
            String DNA = new String(args[0]);

            String DNA_space = new String(dna_sum(args));
            String DNA_no_space = new String(dna_sum_without_space(args));

            String say1 = new String(dna_zip_without_space(DNA_no_space)).toUpperCase();
            String say = new String(dna_zip(DNA_space)).toUpperCase();

            System.out.println(say1);
            System.out.println(say); //bonus
        } catch (Exception e) {
            System.out.println("염기서열이 입력되지 않았습니다.");
        }
    }

    public static String dna_sum_without_space(String[] DNA_with_space) {
        String DNA_sum = "";
        for (int i = 0;; i++) {
            try {
                DNA_sum += DNA_with_space[i];
            } catch (Exception e) {
                return DNA_sum;
            }
        }
    }
    public static String dna_sum(String[] DNA_with_space) {
        String DNA_sum = "";
        for (int i = 0;; i++) {
            try {
                DNA_sum += DNA_with_space[i];
                DNA_sum += " ";
            } catch (Exception e) {
                DNA_sum = DNA_sum.substring(0, DNA_sum.length() - 1);
                return DNA_sum;
            }
        }
    }

    public static String dna_zip_without_space(String DNA) {
        char temp = DNA.charAt(0);
        int cnt = 0;
        int flag = 0;
        String result = "";

        for (int i = 0; i < DNA.length(); i++) {

            if (DNA.charAt(i) != 'C' && DNA.charAt(i) != 'Y' && DNA.charAt(i) != 'J' && DNA.charAt(i) != 'E'
                    && DNA.charAt(i) != 'H' && DNA.charAt(i) != ' ' && DNA.charAt(i) != 'c' && DNA.charAt(i) != 'y' && DNA.charAt(i) != 'j' && DNA.charAt(i) != 'e'
                    && DNA.charAt(i) != 'h') {
                return "염기서열은 C, J, H, E, Y 다섯가지로만 입력됩니다. 확인하고 다시 입력해주세요";

            }

            if (DNA.charAt(i) == ' ') {
                i++;
                flag = 1;
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

    public static String dna_zip(String DNA) {
        char temp = DNA.charAt(0);
        int cnt = 0;
        String result = "";

        for (int i = 0; i < DNA.length(); i++) {

            if (DNA.charAt(i) != 'C' && DNA.charAt(i) != 'Y' && DNA.charAt(i) != 'J' && DNA.charAt(i) != 'E'
                    && DNA.charAt(i) != 'H' && DNA.charAt(i) != ' ' && DNA.charAt(i) != 'c' && DNA.charAt(i) != 'y' && DNA.charAt(i) != 'j' && DNA.charAt(i) != 'e'
                    && DNA.charAt(i) != 'h') {
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
