package Homework_money;


public class MainMoney {
    public static void main(String[] args) {

        Wallet wallet1 = new Wallet(new Money("paper", "EUR", 100));
        Wallet wallet2 = new Wallet(new Money("paper","USD",20));
        Wallet wallet3 = new Wallet(new Money("electronic", "BTC",5));

        System.out.println(wallet1);
        System.out.println(wallet2);
        System.out.println(wallet3);
    }



}



