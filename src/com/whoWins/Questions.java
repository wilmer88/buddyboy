package com.whoWins;
import java.util.Scanner;
public class Questions implements IFighterInterface {
    public String askNameMethod(){
        Scanner scanner = new Scanner(System.in);
     String cholo = IFighterInterface.askForName(scanner);
     return cholo;
    }
    }



