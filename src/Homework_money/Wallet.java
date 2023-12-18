package Homework_money;

public class Wallet {
    Money money;


    public Wallet(Money money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "money=" + money +
                '}';
    }
}
