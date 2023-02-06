package com.whoWins;

public class Fighter {
    private String fighterName;
    public Fighter(String fighterName){ this.fighterName = fighterName;}
    interface ImporterCorner { String fetchFighterName();}
    interface ExporterCorner { void storeFighterName(String fighterName);}
    public Fighter(ImporterCorner source){
        fighterName = source.fetchFighterName();
    }
    public void nameExporter(ExporterCorner destination){
        destination.storeFighterName(fighterName);
    }

}
//    private int fighterOdds;
//public int FighterOdds(int fighterOdds){ return this.fighterOdds = fighterOdds;}
//public String FighterOdds(String FighterName){ return this.fighterName = fighterName;}
//interface ImporterCorner { String fetchName(); int fetchOdds();}
