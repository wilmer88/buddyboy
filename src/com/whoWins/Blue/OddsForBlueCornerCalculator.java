package com.whoWins.Blue;

public class OddsForBlueCornerCalculator {
    Double BlueOddsCalculator(Integer oddsForBlue){
        if(oddsForBlue <= -1000){
            return 10.0;
        } else if (oddsForBlue <= -800) {
            return 8.0;
        }else if (oddsForBlue <= -600) {
            return 6.0;
        }else if (oddsForBlue <= -400) {
            return 4.0;
        }
        else if (oddsForBlue <= -200) {
            return 2.0;
        }
        return 1.0;
    }
}
