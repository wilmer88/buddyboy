package com.whoWins;

public class Predictor {
    public String predict(Integer redCornerOddsPoints, Integer redCornerRecordPoints,
                          Integer blueCornerOddsPoints, Integer blueCornerRecordPoints){
        Integer redTotalPoints = redCornerOddsPoints + redCornerRecordPoints;
        Integer blueTotalPoints = blueCornerOddsPoints + blueCornerRecordPoints;
        if(redTotalPoints < blueTotalPoints){
            return "Red Corner wins.";
        }
        else if(blueTotalPoints < redTotalPoints){
            return "Blue Corner wins.";
        }
        else if(blueTotalPoints == redTotalPoints){
            return "Fight is a draw.";
        }

        else return "something went wrong";
    }
}
