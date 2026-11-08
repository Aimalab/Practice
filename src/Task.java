import java.util.Scanner;

public class Task {
    static void main() {
        //       bandits();
        //       ThreeNums();
        //      coffee();
              numbers();
    }

    static void bandits() {
        IO.println("Введите число простреленных банок Ларри");
        int a = Integer.parseInt(IO.readln());
        IO.println("Введите число простреленных банов Гарри");
        int b = Integer.parseInt(IO.readln());
        System.out.println("Гарри не прострелил: " + (a - 1));
        System.out.printf("Ларри не прострелил:" + (b - 1));

    }

    static void ThreeNums() {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(" a - b = " + (a - b));
        System.out.println(" a - c = " + (a - c));
        System.out.println(" b - c = " + (b - c));
        System.out.println(" b - a = " + (b - a));
        System.out.println(" c - a = " + (c - a));
        System.out.println(" c - b = " + (c - b));

    }

    static void coffee() {
        IO.println("Сколько стоит чашка?");
        int cost = Integer.parseInt(IO.readln());
        if (cost > 300) {
            IO.println("Дороговато");
        }
        else if (150 <= cost) {
            IO.println("Норм");
        }
        else if (80 <= cost) {
            IO.println("Дешево");
        }
        else  {
            IO.println("А это в рублях?");
        }
    }

    static void numbers() {
        int sum = 0;
        int kol = 0;
        int kolPozNums = 0;
        int sumNegNums =0;
        while (sum <= 42) {
            IO.println("Введите целые числа");
            int number = Integer.parseInt(IO.readln());
            sum = sum + number;
            kol++;
            if (number > 0) {
                kolPozNums++;
            } else{
                sumNegNums = sumNegNums + number;
            }
        }
            IO.println("Всего введено чисел: " + kol);
            IO.println("Процент количества положительных чисел: " + (kolPozNums * 100 / kol));
            IO.println("Сумма отрицательных чисел равна:" + sumNegNums);

    }
}



