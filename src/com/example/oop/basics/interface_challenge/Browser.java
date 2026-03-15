package com.example.oop.basics.interface_challenge;

public interface Browser {
    static final String ENGINE = "WebKit";

    default String getEngine() {
        return Browser.ENGINE;
    }

    ;

    public void goToPage(String url);

    public void refrehPage();

    public void bookmarkPage();
}
