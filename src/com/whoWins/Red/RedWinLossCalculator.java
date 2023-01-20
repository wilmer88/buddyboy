package com.whoWins.Red;

public class RedWinLossCalculator {
  public   Integer calculateRedWinLossPoints(Integer redSideWins, Integer redSideLoss){
        Integer redTotalExperience = redSideWins + redSideLoss;
        Integer lossMentalityAcceptance = redSideLoss/2;
        Integer RedXp = redTotalExperience - redSideLoss;
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
