package com.whoWins.Red;

public class OddsForRedCalculator {
    Double redOddsCalculator(Integer oddsForRed){
        if(oddsForRed <= -1000){
            return 10.0;
        } else if (oddsForRed <= -800) {
            return 8.0;
        }else if (oddsForRed <= -600) {
            return 6.0;
        }else if (oddsForRed <= -400) {
            return 4.0;
        }
        else if (oddsForRed <= -200) {
            return 2.0;
        }
        return 1.0;
    }
}
