public class PriceInWords {
    public static void main (String[] args){
        int price = 4879;
        String priceInWords = "";

        int thousand;
        int hundred;
        int ten;
        int number;

        thousand = price/1000;
        price %= 1000;

        hundred = price/100;
        price %= 100;

        ten = price/10;
        price %=10;

        number = price;

        if (thousand == 1) priceInWords += " одна тысяча";
        if (thousand == 2) priceInWords += " две тысячи";
        if (thousand == 3) priceInWords += " три тысячи";
        if (thousand == 4) priceInWords += " четыре тысячи";
        if (thousand == 5) priceInWords += " пять тысяч";
        if (thousand == 6) priceInWords += " шесть тысяч";
        if (thousand == 7) priceInWords += " семь тысяч";
        if (thousand == 8) priceInWords += " восемь тысяч";
        if (thousand == 9) priceInWords += " девять тысяч";

        if (hundred == 1) priceInWords += " сто";
        if (hundred == 2) priceInWords += " двести";
        if (hundred == 3) priceInWords += " триста";
        if (hundred == 4) priceInWords += " четыреста";
        if (hundred == 5) priceInWords += " пятьсот";
        if (hundred == 6) priceInWords += " шестьсот";
        if (hundred == 7) priceInWords += " семьсот";
        if (hundred == 8) priceInWords += " восемьсот";
        if (hundred == 9) priceInWords += " девятьсот";

        if (ten == 1){
            if (number == 0) priceInWords += " десять";
            if (number == 1) priceInWords += " одиннадцать";
            if (number == 2) priceInWords += " двенадцать";
            if (number == 3) priceInWords += " тринадцать";
            if (number == 4) priceInWords += " четырнадцать";
            if (number == 5) priceInWords += " пятнадцать";
            if (number == 6) priceInWords += " шестнадцать";
            if (number == 7) priceInWords += " семнадцать";
            if (number == 8) priceInWords += " восемнадцать";
            if (number == 9) priceInWords += " девятнадцать";
        }
        if (ten == 2) priceInWords += " двадцать";
        if (ten == 3) priceInWords += " тридцать";
        if (ten == 4) priceInWords += " сорок";
        if (ten == 5) priceInWords += " пятьдесят";
        if (ten == 6) priceInWords += " шестьдесят";
        if (ten == 7) priceInWords += " семьдесят";
        if (ten == 8) priceInWords += " восемьдесят";
        if (ten == 9) priceInWords += " девяносто";

        if (ten != 1) {
            if (number == 1) priceInWords += " один";
            if (number == 2) priceInWords += " два";
            if (number == 3) priceInWords += " три";
            if (number == 4) priceInWords += " четыре";
            if (number == 5) priceInWords += " пять";
            if (number == 6) priceInWords += " шесть";
            if (number == 7) priceInWords += " семь";
            if (number == 8) priceInWords += " восемь";
            if (number == 9) priceInWords += " девять";
        }

        if ((number ==1) && (ten !=1)) priceInWords += " рубль";
        if (((number == 2)||(number==3)||(number==4))&&(ten!=1))priceInWords += " рубля";
        if (((number !=1)&&(number!=2)&&(number!=3)&&(number!=4)||(ten == 1)))priceInWords += " рублей";


        System.out.println(priceInWords);
    }

}
