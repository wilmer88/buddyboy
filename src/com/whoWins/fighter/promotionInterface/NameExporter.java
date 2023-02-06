package com.whoWins.fighter.promotionInterface;

import com.whoWins.fighter.promotionInterface.Fighter;

class NameExporter implements Fighter.ExporterCorner {
    private String fighterName;
    public void storeFighterName(String fighterName){ this.fighterName = fighterName;}
     @Override public String toString(){
            return "{\"fighterName\" : \" " + fighterName + "\"}";
        }
    }

