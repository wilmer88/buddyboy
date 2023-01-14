package com.whoWins.Red;

import java.util.Scanner;

public class PreguantaParaEsquinaRoja {
    Scanner scanner = new Scanner(System.in);
    public  Integer askRedOdds(){
        //Asks for red corner fight odds and returns the answer
        System.out.println("qual es la probialidades esquina roja/ probabilidades de lucha del desiafiador: ");
        String redSideOdds = scanner.nextLine();
        Integer oddsForRedSide = Integer.parseInt(redSideOdds);
        return oddsForRedSide;
    }
    public  Integer askRedWins(){
        //Asks for red corner win record and returns the answer
        System.out.println("cuantas peleas a ganado la esquina roja/ desiafiador: ");
        String redSideWins = scanner.nextLine();
        Integer winsForRedSide = Integer.parseInt(redSideWins);
        return winsForRedSide;
    }

    public  Integer askRedLosses(){
        //Asks for red corner loss record and returns the answer
        System.out.println("cuantas peleas a perdido la esquina roja/ desiafiador: ");
        String redSideLosses = scanner.nextLine();
        Integer lossesForRedSide = Integer.parseInt(redSideLosses);
        return lossesForRedSide;
    }

}
