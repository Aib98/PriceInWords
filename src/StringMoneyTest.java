import org.junit.Test;

import static org.junit.Assert.*;

public class StringMoneyTest {

    @Test
    public void declinationMoney() {
        int money = 11;
        String expected = "рублей";
        String actual = TypeValute.Rub.declinationMoney(money);
        assertEquals(expected, actual);
    }

    @Test
    public void testRub0() {
        int money = 0;
        String valute = "рублей";
        String expected = "нольрублей";
        String actual =StringMoney.moneyInWords(money) + TypeValute.Rub.declinationMoney(money);
        assertEquals(expected, actual);
    }

    @Test
    public void moneyInWords() {
        int number = 239;
        String expected = "двести тридцать девять";
        String actual = StringMoney.moneyInWords(number);
        assertEquals(expected, actual);
    }

    @Test
    public void testMoneyWord() {
        int number = 239;
        String expected = "двести тридцать девятьдолларов";
        String actusl = StringMoney.moneyInWords(number) + TypeValute.Dollar.declinationMoney(number);
        assertEquals(actusl, expected);
    }


}