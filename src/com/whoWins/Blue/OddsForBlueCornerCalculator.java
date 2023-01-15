package com.whoWins.Blue;

public class OddsForBlueCornerCalculator {
   public Integer blueOddsCalculator(Integer oddsForBlue){
        if(oddsForBlue <= -1000){
            return 10;
        } else if (oddsForBlue <= -800) {
            return 8;
        }else if (oddsForBlue <= -600) {
            return 6;
        }else if (oddsForBlue <= -400) {
            return 4;
        }
        else if (oddsForBlue <= -200) {
            return 2;
        }
        else if (oddsForBlue > 0) {
            return 1;
        }
        else return 1;

    }
}
