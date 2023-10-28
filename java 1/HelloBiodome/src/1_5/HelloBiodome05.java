public class HelloBiodome05 {
    public static void main(String[] args) {
        for (int g = 0; g < 16; g++) {
            for (int h = 0; h < 16; h++) {
                if ((g & 1 >> g << 2 | h + g ^ h) == 1 && (g % 2 << h >> g | 1 & 0 ^ 0) == 2) {
                    System.out.printf("h의 값 : %d, g의 값 : %d, (h*h+g)*(h<<h)+(g<<g) = %d",h , g,(h*h+g)*(h<<h)+(g<<g));
                }
            }
        }
    }
}
