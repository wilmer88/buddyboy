import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class CornerAnswers {
Scanner scanner = new Scanner(System.in);







        private String askForName (){

                     System.out.println("enter a fighter name?: ");
                     return scanner.nextLine();
        }

        private     Double askOdds(String fighterName){
            System.out.println("what are " + fighterName + " odds?"  );
            return scanner.nextDouble();

        }

        String answerToName = askForName();

        public  Object [] receivedAnswer() {
            Object[] theData = new Object[2];
            double answerToOdds = askOdds(answerToName);

            String name = answerToName;
            double odds = answerToOdds;
            theData[0] = name;
            theData[1] = odds;


            return  theData;
        }






//    private  Integer askRedWins(){
//        //Asks for red corner win record and returns the answer
//        System.out.println("c?: ");
//        String redSideWins = scanner.nextLine();
//        Integer winsForRedSide = Integer.parseInt(redSideWins);
//        return winsForRedSide;
//    }
//
//    public  Integer askRedLosses(){
//        //Asks for red corner loss record and returns the answer
//        System.out.println("?: ");
//        String redSideLosses = scanner.nextLine();
//        Integer lossesForRedSide = Integer.parseInt(redSideLosses);
//        return lossesForRedSide;
//    }

//    OddsForRedCalculator redOddsForRedCalculator = new OddsForRedCalculator();
//    Integer answerForRedOdds = redOddsForRedCalculator.redOddsCalculator(askRedOdds());



}
