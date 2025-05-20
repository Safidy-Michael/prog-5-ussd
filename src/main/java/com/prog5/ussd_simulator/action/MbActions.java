package com.prog5.ussd_simulator.action;

public class MbActions {
    private MbActions() {
        throw new UnsupportedOperationException("Utility class");
    }
    public static void service() {
        System.out.println("service");
    }

    public static void offre() {
        System.out.println("offre");
    }

    public static void profile() {
        System.out.println("Info profile");
    }

    public static void configurerMobile() {
        System.out.println("Configuration mobile...");
    }
}
