package com.example.oop.basics.interface_challenge;

public class Chrome implements Browser{
    protected String url;

    @Override
    public void goToPage(String url) {
        this.url = url;
        System.out.println("Chrome url: " + url);
    }

    @Override
    public void refrehPage() {

    }

    @Override
    public void bookmarkPage() {

    }
}
