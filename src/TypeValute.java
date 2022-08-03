public enum TypeValute {
    Rub (new String[] {"рубль", "рубля", "рублей"}), Dollar (new String[] {"доллар", "доллара", "долларов"});

    private final String[] declinations;

    TypeValute(String[] declinations) {
        this.declinations = declinations;
    }

    public String declinationMoney(int money) {


        int p = money % 100;
        int t = money % 10;

        if (p >= 11 && p <= 15) {
            return declinations[2];
        }
        else if (t == 1) {
            return declinations[0];
        }
        else if (t == 2 || t == 3 || t == 4) {
            return declinations[1];
        }
        else {
            return declinations[2];
        }
    }
}

