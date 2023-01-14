package com.whoWins.Blue;

public class BlueCornerWinLossCalculator {
      public   Integer calculateBlueWinLossPoints(Integer redSideWins, Integer redSideLoss){

            Integer addedXp = redSideWins + redSideLoss;
            Integer xpPoints = addedXp - redSideLoss;
            Integer defaultReturn = xpPoints + 1;
            if(xpPoints > 49){
                Integer calculatedExperiencePoints = xpPoints + 6;
                return calculatedExperiencePoints ;
            }
            else if(xpPoints > 39){
                Integer calculatedExperiencePoints = xpPoints + 5;
                return calculatedExperiencePoints ;
            }
            else if(xpPoints > 29){
                Integer calculatedExperiencePoints = xpPoints + 4;
                return calculatedExperiencePoints ;
            }
            else if(xpPoints > 19){
                Integer calculatedExperiencePoints = xpPoints + 3;
                return calculatedExperiencePoints ;
            }
            else if(xpPoints > 11){
                Integer calculatedExperiencePoints = xpPoints + 2;
                return calculatedExperiencePoints ;
            }else return  defaultReturn;

        }
}
