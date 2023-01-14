package com.whoWins.Red;

public class RedWinLossCalculator {
  public   Integer calculateRedWinLossPoints(Integer redSideWins, Integer redSideLoss){
        Integer redExperience = redSideWins + redSideLoss;
        Integer RedXp = redExperience - redSideLoss;
        Integer defaultRedXp = RedXp + 1;
        if(RedXp > 49){
            Integer calculatedExperiencePoints = redExperience + 6;
            return calculatedExperiencePoints ;
        }
        else if(RedXp > 39){
            Integer calculatedExperiencePoints = redExperience + 5;
            return calculatedExperiencePoints ;
        }
        else if(RedXp > 29){
            Integer calculatedExperiencePoints = redExperience + 4;
            return calculatedExperiencePoints ;
        }
        else if(RedXp > 19){
            Integer calculatedExperiencePoints = redExperience + 3;
            return calculatedExperiencePoints ;
        }
        else if(RedXp > 11){
            Integer calculatedExperiencePoints = redExperience + 2;
            return calculatedExperiencePoints ;
        }else return defaultRedXp;

    }
}
