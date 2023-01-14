package com.whoWins.Red;

public class RedWinLossCalculator {
    Integer addRedPoints(Integer redSideWins, Integer redSideLoss){
        Integer experiencePoints = redSideWins - redSideLoss;
        if(experiencePoints > 49){
            Integer calculatedExperiencePoints = experiencePoints + 6;
            return calculatedExperiencePoints ;
        }
        else if(experiencePoints > 39){
            Integer calculatedExperiencePoints = experiencePoints + 5;
            return calculatedExperiencePoints ;
        }
        else if(experiencePoints > 29){
            Integer calculatedExperiencePoints = experiencePoints + 4;
            return calculatedExperiencePoints ;
        }
        else if(experiencePoints > 19){
            Integer calculatedExperiencePoints = experiencePoints + 3;
            return calculatedExperiencePoints ;
        }
        else if(experiencePoints > 11){
            Integer calculatedExperiencePoints = experiencePoints + 2;
            return calculatedExperiencePoints ;
        }else return ++experiencePoints;

    }
}
