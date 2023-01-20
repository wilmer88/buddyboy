package com.whoWins.Blue;

public class BlueCornerWinLossCalculator {
      public   Integer calculateBlueWinLossPoints(Integer blueSideWins, Integer blueSideLoss){
          Integer evenLoss;
          if(blueSideLoss % 2 == 0 ){
              evenLoss = blueSideLoss;
          }else{
              evenLoss = blueSideLoss + 1;
          }
            Integer addedXp = blueSideWins + evenLoss;
            Integer lossMentalityAcceptance = evenLoss/2;
            Integer xpPoints = addedXp - lossMentalityAcceptance;
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
