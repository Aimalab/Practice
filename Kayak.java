import java.util.Arrays;

public class Kayak {
    static void main() {

        //ввод данных

        int N = Integer.parseInt(IO.readln("Введите количество N человек: "));
        int D = Integer.parseInt(IO.readln("Введите грузоподъемность байдарки: "));
        int[] massa = new int[N];
        for (int i = 0; i < N; i++) {
           int M= Integer.parseInt(IO.readln("Введите массу участника: "));
massa [i] = M;

        }
        System.out.println(Arrays.toString(massa));
Arrays.sort(massa);
        System.out.println(Arrays.toString(massa));


        int countKayak = countKayaks(massa,D);


        //вывод данных
        System.out.println(countKayak);

    }

    public static int countKayaks(int[] massa, int gruzopod){
        //вычисление
        int min = 0;
        int max = massa.length-1;
        int countKayak =0;
        while (min <= max) {
            if (massa[min] + massa[max] <= gruzopod) {
                countKayak++;
                min++;
                max--;
            } else {
                max--;
                countKayak++;
            }

        }
        return countKayak;
    }


}
