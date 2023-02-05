package com.whoWins.fighter;

class NameExporter implements Fighter.ExporterCorner {
    private String fighterName;
    public void storeFighterName(String fighterName){ this.fighterName = fighterName;}
     @Override public String toString(){
            return "{\"fighterName\" : \" " + fighterName + "\"}";
        }
    }

