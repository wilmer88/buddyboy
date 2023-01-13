package com.whoWins;

public class CompareClass {
    Integer compare(Integer fighterA_WinRecord, Integer bFighterLossRecord){
        Integer winLossResponse = (fighterA_WinRecord - bFighterLossRecord);

        return winLossResponse;
    }
}
