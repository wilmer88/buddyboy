package com.whoWins.Red;

public class OddsForRedCalculator {
  public   Integer redOddsCalculator(Integer oddsForRed){
        if(oddsForRed <= -1000){
            return 10;
        } else if (oddsForRed <= -800) {
            return 8;
        }else if (oddsForRed <= -600) {
            return 6;
        }else if (oddsForRed <= -400) {
            return 4;
        }
        else if (oddsForRed <= -200) {
            return 2;
        }
        else if (oddsForRed < 0) {
            return 1;
        }
       else return 1;
    }
}
