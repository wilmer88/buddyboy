package com.whoWins.fighter.promotionInterface;
import java.util.Scanner;
public class Questions implements FighterInterface {
    public String askNameMethod(){
        Scanner scanner = new Scanner(System.in);
     String cholo = FighterInterface.askForName(scanner);
     return cholo;
    }
    }



