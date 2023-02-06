package com.whoWins;

import java.io.Reader;

public  class NameImporter implements Fighter.ImporterCorner {
private Reader in;
public NameImporter(Reader in){ this.in = in;}
    public String fetchFighterName(){
        //..
        return "wilmer";

    }

}
