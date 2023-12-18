package Homework_money;

public class Money {

    public String type;
    public String currency;

    public int denomination;

    public Money(String type, String currency, int denomination) {

        this.type = type;
        this.currency = currency;
        this.denomination = denomination;

    }

    @Override
    public String toString() {
        return "Money{" +
                "type='" + type + '\'' +
                ", currency='" + currency + '\'' +
                ", denomination=" + denomination +
                '}';
    }
}
