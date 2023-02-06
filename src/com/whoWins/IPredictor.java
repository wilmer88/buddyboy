package com.whoWins;

public interface IPredictor {
    public default String predict(Integer redCornerOddsPoints, Integer redCornerRecordPoints,
                                  Integer blueCornerOddsPoints, Integer blueCornerRecordPoints){
        Integer redTotalPoints = redCornerOddsPoints + redCornerRecordPoints;
        Integer blueTotalPoints = blueCornerOddsPoints + blueCornerRecordPoints;
        if(redTotalPoints > blueTotalPoints){
            return "Red Corner wins.";
        }
        else if(blueTotalPoints > redTotalPoints){
            return "Blue Corner wins.";
        }
        else if(blueTotalPoints == redTotalPoints){
            return "Fight is a draw.";
        }

        else return "something went wrong";
    }

    abstract class PromptAboutFighter implements IFighterInterface {
        public static String askForName() {
            return null;
        }
   //'     {
   //         return null;
   //     }'
   //    {
   //        String nameOfFighter;
   //        System.out.println("enter a fighter name?: ");
   //        nameOfFighter = scanner.nextLine();
   ////335
   ////        if ( nameOfFighter.isEmpty() || nameOfFighter.matches("[0-9]+") || nameOfFighter.matches(".*\\d+.*")){
   ////            return askForName();
   ////        }
   //        return nameOfFighter;
   //    }



   //     public String askName(){
   //       return   fighterInterface.askForName();
   //     }

        //    Scanner sc = new Scanner(System.in);
   //    public String runPromptAboutFighter() {
   //        System.out.println("what is fighter A name ");
   //
   //        String fighterName = sc.nextLine();
   //
   //        return fighterName;
   //    }
       }
}
