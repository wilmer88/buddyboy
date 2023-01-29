package com.whoWins;

public class RedWinLossCalculator {
  public   Integer calculateRedWinLossPoints(Integer redSideWins, Integer redSideLoss){
      ////checks to see if career record is an odd number if it is makes it even
      // by subtracting one the career loss record
      Integer evenLoss;
      if(redSideLoss % 2 == 0 ){
          evenLoss = redSideLoss;
      }else{
          evenLoss = redSideLoss - 1;
      }
        Integer redTotalExperience = redSideWins + evenLoss;
        Integer lossMentalityAcceptance = evenLoss/2;
//        reducing having losses in career impact on points given
        Integer RedXp = redTotalExperience - lossMentalityAcceptance;
        Integer defaultRedXp = RedXp + 1;
        if(RedXp > 49){
            Integer calculatedExperiencePoints = redTotalExperience + 6;
            return calculatedExperiencePoints ;
        }
        else if(RedXp > 39){
            Integer calculatedExperiencePoints = redTotalExperience + 5;
            return calculatedExperiencePoints ;
        }
        else if(RedXp > 29){
            Integer calculatedExperiencePoints = redTotalExperience + 4;
            return calculatedExperiencePoints ;
        }
        else if(RedXp > 19){
            Integer calculatedExperiencePoints = redTotalExperience + 3;
            return calculatedExperiencePoints ;
        }
        else if(RedXp > 11){
            Integer calculatedExperiencePoints = redTotalExperience + 2;
            return calculatedExperiencePoints ;
        }else return defaultRedXp;

    }
}
