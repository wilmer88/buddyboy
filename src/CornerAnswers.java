//import java.awt.*;
//import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//import static jdk.nashorn.internal.runtime.JSType.isString;

class CornerAnswers {
Scanner scanner = new Scanner(System.in);

        public String askForName (){
            System.out.println("enter a fighter name?: ");;

            String nameOfFighter = scanner.nextLine();


            while (nameOfFighter.isEmpty() || nameOfFighter.matches("[0-9]+" ) || nameOfFighter.matches(".*\\d+.*") ){

               return askForName();
            }
            return nameOfFighter;


        }

        def askOdds(String fighterName):


            while True:
            try:
            fighterOdds = int(input("what are " + fighterName + " odds?"  ))
                    return fighterOdds
            except valueError:
            print("what are " + fighterName + " odds?"  );






//    private  Integer askForWins(){
//        //Asks for red corner win record and returns the answer
//        System.out.println("c?: ");
//        String redSideWins = scanner.nextLine();
//        Integer winsForRedSide = Integer.parseInt(redSideWins);
//        return winsForRedSide;
//    }
//
//    public  Integer askForLosses(){
//        //Asks for red corner loss record and returns the answer
//        System.out.println("?: ");
//        String redSideLosses = scanner.nextLine();
//        Integer lossesForRedSide = Integer.parseInt(redSideLosses);
//        return lossesForRedSide;
//    }





}
