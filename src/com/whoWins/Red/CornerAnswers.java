package com.whoWins.Red;

import java.util.Scanner;

public class CornerAnswers {
    Scanner scanner = new Scanner(System.in);
       public   static void main(String... args) {
            CornerAnswers cornerAnswers = new CornerAnswers();
            cornerAnswers.askQuestions();

        }


        private String askForName (){
            //Asks for corner name
            System.out.println("enter a fighter name?: ");
            String nameOfFighter= scanner.nextLine();
            return nameOfFighter;
        }

        private   Double askOdds(String fighterName){

            System.out.println("what are " + fighterName + " odds?"  );
            String odds = scanner.nextLine();
            Double oddsForRedSide = Double.parseDouble(odds);
            return oddsForRedSide;
        }




       CornerAnswers askQuestions(){
            String allUseName = askForName();
            askOdds(allUseName);
            return new CornerAnswers();
        }







//    public  Integer askRedWins(){
//        //Asks for red corner win record and returns the answer
//        System.out.println("cuantas peleas a ganado la esquina roja?: ");
//        String redSideWins = scanner.nextLine();
//        Integer winsForRedSide = Integer.parseInt(redSideWins);
//        return winsForRedSide;
//    }
//
//    public  Integer askRedLosses(){
//        //Asks for red corner loss record and returns the answer
//        System.out.println("cuantas peleas a perdido la esquina roja?: ");
//        String redSideLosses = scanner.nextLine();
//        Integer lossesForRedSide = Integer.parseInt(redSideLosses);
//        return lossesForRedSide;
//    }

//    OddsForRedCalculator redOddsForRedCalculator = new OddsForRedCalculator();
//    Integer answerForRedOdds = redOddsForRedCalculator.redOddsCalculator(askRedOdds());



}
