public class Multiples {
    public static void main(String[] args) {
        int num = 0;
        for (int a = 1; a < 1000; a++){
            boolean divisibleBy3 = a % 3 == 0;
            boolean divisibleBy5 = a % 5 == 0;
            if (divisibleBy5 || divisibleBy3){
                num++;
            }
        }
        System.out.println(num);
    }
}
