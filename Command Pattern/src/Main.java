import CombatAndConquer.*;
import HomeAutomation.*;

import java.lang.Character;

public class Main {
    public static void main(String[] args) {

        Farmer fr = new Farmer(12, 14);
        Rabbit rb = new Rabbit(22, 2);

        Charakter frF = new FarmerFight(fr);
        Charakter rbF = new RabbitFight(rb);

        Controller c = new Controller();

        c.setChar(frF);
        c.fighting();

        c.setChar(rbF);
        c.fighting();



//        GarageDoor gd = new GarageDoor("Garage: ");
//        Stereo st = new Stereo("Living: ");
//
//        Command gdC = new GarageDoorCommand(gd);
//        Command stC = new StereoCommand(st);
//
//        RemoteControl rm = new RemoteControl();
//
//        rm.setCd(gdC);
//        rm.pressbuttonOn();
//
//        rm.setCd(stC);
//        rm.pressbuttonOn();
//
//        rm.setCd(gdC);
//        rm.pressbuttonOff();
//
//        rm.setCd(stC);
//        rm.pressbuttonOff();


    }
}