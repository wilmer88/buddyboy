package com.whoWins.fighter.promotionInterface;//import com.whoWins.fighter.promotionInterface.OddsCalculator;
//import com.whoWins.fighter.NameExporter;

import java.io.Reader;
import java.io.StringReader;

public class FighterInfoHelper {
    public void test() throws Exception {
        String stringName = "{ \"name\":\"wilmer\"}";
        Reader in = new StringReader(stringName);
        Fighter daddyPop = new Fighter(new NameImporter(in));

        Fighter.ExporterCorner exporterCorner = new NameExporter();
        daddyPop.nameExporter(exporterCorner);
        String stringFighter = exporterCorner.toString();

    }
//
//    private void cornerPoints(){
//        PromptAboutFighter promptAboutFighter= new PromptAboutFighter();
//        Object fighterInfo =  promptAboutFighter.answerSaver();
//        System.out.println(fighterInfo);
//
////        oddsCalculator.oddsCalculator(int [] fighterInfo[2]);
//    }
//
//    public void helperOne(){
//        cornerPoints();
//    }
//
//
////    OddsCalculator oddsCalculator = new OddsCalculator();
//
//
//
//
}
