package com.example.oop.basics;

class Wallet {
    float money;

    Wallet() {
        money = 3000.0f;
    }

    public void addMoney(float amount) {
        this.money += amount;
    }

    public void removeMoney(float amount) {
        this.money -= amount;
    }

    public void printAmount() {
        System.out.println(this.money);
    }
}

public class WalletExample {
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        for (int i = 0; i < 6; i++) {
            wallet.addMoney(5000);
            wallet.removeMoney(2000);
            wallet.removeMoney(1000);
        }
        wallet.printAmount();
    }
}
