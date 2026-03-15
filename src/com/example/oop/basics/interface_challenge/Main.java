package com.example.oop.basics.interface_challenge;

public class Main {
    public static void main(String[] args) {
        Browser browserSth = new Chrome();
        Browser browserSth2 = new Firefox();
        browserSth.goToPage("www.google.com");
        browserSth2.goToPage("www.sth.com");
    }
}
