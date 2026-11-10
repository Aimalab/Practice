public class Сonditioner {
    public static void main() {
        //Пользователь вводит troom, tcond, режим работы кондиционера
        String[] parts = IO.readln("Введите температуру в комнате и желаемую температуру:  ").split(" ");
        int tRoom = Integer.parseInt(parts[0]);
        int tCond = Integer.parseInt(parts[1]);
        String mode = IO.readln("Введите режим работы кондиционера: ");

        // Рассчитать температуру, которая устанвоится через час
        int temp = finalTemp(tRoom, tCond, mode);
        //Вывести температуру, которая установится через час
        IO.println(temp);

    }

    static int finalTemp(int tRoom, int tCond, String mode) {
        int temp = 0;
        switch (mode) {
            case "freeze":
                if (tRoom < tCond) {
                    temp = tRoom;
                } else {
                    temp = tCond;
                }
            break;
            case "heat": if (tRoom > tCond) {
                temp = tRoom;
            } else {
                temp = tCond;
            }
                break;
            case "auto":
                temp = tCond;
                break;
            case "fan":
                temp = tRoom;
                break;
        }
        return temp;
    }


}
