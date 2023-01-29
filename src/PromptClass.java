public class PromptClass {
    CornerAnswers cornerAnswers = new CornerAnswers();

    private String askQuestion(){

        return cornerAnswers.askForName();

    }

    String theFighterName = askQuestion();


    private Integer oddsAnswer(){

        return cornerAnswers.askOdds(theFighterName);

    }

    public Object[] startProject(){

//        String theFighterName = askQuestion();

        Integer  theFighterOdds = oddsAnswer();

        return new Object[] {theFighterOdds };

    }

}
