import java.awt.*;
import java.util.Arrays;

public class PromptClass {
    CornerAnswers cornerAnswers = new CornerAnswers();


    private String askQuestion(){
        String redName = cornerAnswers.askForName();
        return redName;
    }
        String theFighterName = askQuestion();


    private Integer oddsAnswer(){

       Integer  answerForOdds = cornerAnswers.askOdds(theFighterName);
        return answerForOdds;
    }

    public Object[] startProject(){
//        String theFighterName = askQuestion();
        Integer  theFighterOdds = oddsAnswer();
      return new Object[] {theFighterOdds };

    }


//    class fighterBlue extends CornerAnswers{
//
//
//    return
//class fighterRed extends CornerAnswers {
//
//
////    CornerAnswers cornerAnswers = new CornerAnswers() {
////        String redName = as
////    }
//











}
