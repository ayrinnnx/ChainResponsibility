package org.example.first;

public class ATM {
    private Tray firstTray;
    public ATM() {
        firstTray = new Tray500();
        Tray traytwoh = new Tray200();
        firstTray.setNext(traytwoh);
        traytwoh.setNext(new Tray5());
    }

    public void process(int amount) {
        firstTray.process(amount);
    }
}
