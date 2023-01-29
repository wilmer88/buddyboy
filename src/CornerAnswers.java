//import java.awt.*;
//import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


import static jdk.nashorn.internal.objects.Global.print;


class CornerAnswers {
Scanner scanner = new Scanner(System.in);

        public String askForName (){
            System.out.println("enter a fighter name?: ");

            String nameOfFighter = scanner.nextLine();


            if (nameOfFighter.isEmpty() || nameOfFighter.matches("[0-9]+" ) || nameOfFighter.matches(".*\\d+.*") ){

               return askForName();
            }

            return nameOfFighter;



        }

        public Integer askOdds(String fighterName){

            while (true){
                System.out.println("what are " + fighterName + " odds? ");

                try {
                    Integer fighter_odds = Integer.parseInt(scanner.nextLine());

                    return fighter_odds;

                }catch (NumberFormatException e){
                    System.out.println("bad input ");

                }
                
            }

//
//           if(scanner.hasNextInt()){
//               return fighter_odds;
//           }
//           return askOdds(fighterName);

        }









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
