package com.prog5.ussd_simulator.action;

public class MobileMoneyAction {
    private MobileMoneyAction() {
        throw new UnsupportedOperationException("Utility class");
    }
    public static void acheterCreditOuOffre(){
        System.out.println("Acheter Credit ou Offre ");
    }

    public static void transfererArgent(){
        System.out.println("Transferer argent");
    }

    public static void mbCredit() {
        System.out.println("Mobile money Credit...");
    }

    public static void retirerArgent() {
        System.out.println("Retrait d'argent...");
    }

    public static void monCompte() {
        System.out.println("Solde Mobile money...");
    }

    public static void recevoirArgent(){
        System.out.println("recevoir de l'argent");
    }

    public static void banquesEtMicroFinances(){
        System.out.println("banques et microfinances");
    }

}
