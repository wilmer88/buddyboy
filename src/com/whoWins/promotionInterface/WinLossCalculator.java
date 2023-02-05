package com.whoWins.promotionInterface;

public interface WinLossCalculator {
  public static Integer calculateRedWinLossPoints(Integer redSideWins, Integer redSideLoss){
      ////checks to see if career record is an odd number if it is makes it even
      // by subtracting one the career loss record
      Integer evenLoss;
      if(redSideLoss % 2 == 0 ){
          evenLoss = redSideLoss;
      }else{
          evenLoss = redSideLoss - 1;
      }
        int redTotalExperience = redSideWins + evenLoss;
        int lossMentalityAcceptance = evenLoss/2;
//        reducing having losses in career impact on points given
        int RedXp = redTotalExperience - lossMentalityAcceptance;
        Integer defaultRedXp = RedXp + 1;
        if(RedXp > 49){

            return redTotalExperience + 6;
        }
        else if(RedXp > 39){

            return redTotalExperience + 5;
        }
        else if(RedXp > 29){

            return redTotalExperience + 4;
        }
        else if(RedXp > 19){

            return redTotalExperience + 3;
        }
        else if(RedXp > 11){

            return redTotalExperience + 2;
        }else return defaultRedXp;

    }
}
