public class Tests {
    public void testRub11() {

        System.out.println("Тест 11 рублей");

        int money = 11;
        String result = StringMoney.declinationMoney(money, TypeValute.Rub);

        if (result.equals("рублей")) {
            System.out.println("Тест пройден");
        }
        else {
            System.out.println("Тест не пройден");
        }
    }

    public void testRub0() {
        System.out.println("Тест 0 рублей");

        int money = 0;
        String result = StringMoney.declinationMoney(money, TypeValute.Rub);

        if (result.equals("рублей")) {
            System.out.println("Тест пройден");
        }
        else {
            System.out.println("Тест не пройден");
        }
    }

    public void testNumberWord() {
        System.out.println("Тест прописью 239");

        int number = 239;
        String result = StringMoney.moneyInWords(number);

        if (result.equals("двести тридцать девять")) {
            System.out.println("Тест пройден");
        }
        else {
            System.out.println("Тест не пройден");
        }
    }

    public void testMoneyWord() {
        System.out.println("Тест прописью 239 рублей");
        int number = 239;
        String result = StringMoney.moneyInWords(number, "руб");

        if (result.equals("двести тридцать девять рублей")) {
            System.out.println("Тест пройден");
        }
        else {
            System.out.println("Тест не пройден");
        }
    }

    public void testGreatValue(){
        System.out.println("Тест на большое значение");
        int number = 10158;
        String result = StringMoney.moneyInWords(number);

        if (result.equals("десять тысяч сто пятьдесят восемь")){
            System.out.println("тест пройден");
        }
        else {
            System.out.println("тест не пройден " + result);
        }


    }
}