package com.whoWins.Blue;

import java.util.Scanner;

public class BlueQuestions {
    Scanner scanner = new Scanner(System.in);
    public  Integer blueOdds(){
        //Asks for blue corner fight odds and returns the answer
        System.out.println("qual es la probialidades esquina azul/ probabilidades de lucha del desiafiador: ");
        String blueSideOdds = scanner.nextLine();
        Integer oddsForBlueSide = Integer.parseInt(blueSideOdds);
        return oddsForBlueSide;
    }
    public  Integer askForBlueWins(){
        //Asks for blue corner win record and returns the answer
        System.out.println("cuantas peleas a ganado la esquina azul/ desiafiador: ");
        String blueSideWins = scanner.nextLine();
        Integer winsForBlueSide = Integer.parseInt(blueSideWins);
        return winsForBlueSide;
    }

    public  Integer askBlueLosses(){
        //Asks for ble corner loss record and returns the answer
        System.out.println("cuantas peleas a perdido la esquina azul/ desiafiador: ");
        String blueSideLosses = scanner.nextLine();
        Integer lossesForBlueSide = Integer.parseInt(blueSideLosses);
        return lossesForBlueSide;
    }
}
