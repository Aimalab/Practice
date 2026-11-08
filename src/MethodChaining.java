public class MethodChaining {
    static void main(String args[]) {
        String strA = IO.readln("введите строку 1: ");
        String strB = IO.readln("введите строку 2: ");
        if (strA.equals(strB)) {
            System.out.printf("Строки равны!");
        } else {
            System.out.printf("Строки неравны!");
        }
    }

    static void oneExample() {
        String strC = IO.readln("введите строку 1: ");
        String strD = IO.readln("введите строку 2: ");
        if (strC.equals(strD)) {
            System.out.printf("Строки равны C и D!");
        } else {
            System.out.printf("Строки неравны!");
        }
    }
}
