package Homework_money;

public class Wallet {
    Money money;
    Money [] massMoney;


    public Wallet(Money money) {
        this.money = money;
    }
    public Wallet(Money[] massMoney){
        this.massMoney = massMoney;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "money=" + money +
                '}';
    }
}
