package Homework_money;


import java.util.Arrays;

public class MainMoney {
    public static void main(String[] args) {

        Wallet wallet1 = new Wallet(new Money("paper", "EUR", 100));
        Wallet wallet2 = new Wallet(new Money("paper","USD",20));
        Wallet wallet3 = new Wallet(new Money("electronic", "BTC",5));

        System.out.println(wallet1);
        System.out.println(wallet2);
        System.out.println(wallet3);
        System.out.println();

        //Variant s massivom

        Money money1 = new Money("paper", "USD", 10);
        Money money2 = new Money("coin", "eurocent", 2);
        Money money3 = new Money ("electronic", "Bitcoin", 1);
        Money money4 = new Money ("paper", "EUR", 50);

        Money[] massMoney1 = {money1, money2};
        Money[] massMoney2 = {money3, money4};

        Wallet massWallet1 = new Wallet (massMoney1);
        System.out.println("Wallet 1 contains: " + Arrays.toString(massWallet1.massMoney));

        Wallet massWallet2 = new Wallet (massMoney2);
        System.out.println("Wallet 2 contains: " + Arrays.toString(massWallet2.massMoney));


    }



}



