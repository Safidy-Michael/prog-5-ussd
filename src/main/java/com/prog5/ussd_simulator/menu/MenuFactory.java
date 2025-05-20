package com.prog5.ussd_simulator.menu;
import com.prog5.ussd_simulator.action.*;
import com.prog5.ussd_simulator.engine.USSDEngine;

import java.util.ArrayList;
import java.util.List;

public class MenuFactory {

    public static List<Action> getMainMenu(USSDEngine engine) {
        final List<Action> mainMenu = new ArrayList<>();

        final MenuItem mobileMoney = new MenuItem("Mon Mobile Money");
        mobileMoney.addSubMenu(new MenuItem("Acheter Credit ou Offre ", MobileMoneyAction::acheterCreditOuOffre));
        mobileMoney.addSubMenu(new MenuItem("Transferer Argent(vers toute destination)", MobileMoneyAction::transfererArgent));
        mobileMoney.addSubMenu(new MenuItem("Mobile M Credit ou Epargne", MobileMoneyAction::MBCredit));
        mobileMoney.addSubMenu(new MenuItem("Retrait d'argent", MobileMoneyAction::retirerArgent));

        mobileMoney.addSubMenu(new MenuItem("Mon Compte", MobileMoneyAction::monCompte));
        mobileMoney.addSubMenu(new MenuItem("Recevoir de l'argent", MobileMoneyAction::recevoirArgent));
        mobileMoney.addSubMenu(new MenuItem("Banques et Micro-Finances", MobileMoneyAction::banquesEtMicroFinances));
        mobileMoney.addSubMenu(new MenuItem("Menu principal", () -> {
            engine.menuStack.clear();
            engine.currentMenu = engine.mainMenu;
        }));

        mainMenu.add(mobileMoney);
        mainMenu.add(new MenuItem("Rappelle moi", RappelActions::rappelleMoi));
        mainMenu.add(new MenuItem("SOS Credit", SosActions::sosCredit));
        mainMenu.add(new MenuItem("service ", MbActions::service));
        mainMenu.add(new MenuItem("Offre", MbActions::offre));
        mainMenu.add(new MenuItem("Produits et Divertissement", () -> {}));
        mainMenu.add(new MenuItem("Bank et Micro-finances", () -> {}));

        mainMenu.add(new MenuItem("Mon identité", MbActions::profile));
        mainMenu.add(new MenuItem("Configurer mon mobile", MbActions::configurerMobile));

        return mainMenu;
    }
}

