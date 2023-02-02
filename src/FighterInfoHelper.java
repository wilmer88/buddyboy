import com.whoWins.calculators.OddsCalculator;
import com.whoWins.questionsAndAnswers.PromptAboutFighter;

public class FighterInfoHelper {

    private void cornerPoints(){
        PromptAboutFighter promptAboutFighter= new PromptAboutFighter();
        Object fighterInfo =  promptAboutFighter.answerSaver();
        System.out.println(fighterInfo);

//        oddsCalculator.oddsCalculator(int [] fighterInfo[2]);
    }

    public void helperOne(){
        cornerPoints();
    }


//    OddsCalculator oddsCalculator = new OddsCalculator();




}
