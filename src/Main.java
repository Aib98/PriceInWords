import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        System.out.println("Введите число от 1 до 9999. Нажмите Enter или пробел и введите валюту руб или $." + '\n' +
                "Чтобы завершить программу напишите выход");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String money = scanner.next();

            if (money.equals("выход"))
                break;
            String currency = scanner.next();


            String result = StringMoney.moneyInWords(Integer.parseInt(money), currency);
            System.out.println(result);
        }
    }
}

