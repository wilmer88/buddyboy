package com.whoWins;

import com.whoWins.Blue.BlueQuestions;
import com.whoWins.Red.PreguantaParaEsquinaRoja;


public class PromptClass {

  public void promptUser(){


      // creates a new instance of questions to ask for red corner
      //then saves the response to be used later
        PreguantaParaEsquinaRoja preguantaParaEsquinaRoja = new PreguantaParaEsquinaRoja();
      Integer answerForRedOdds =  preguantaParaEsquinaRoja.askRedOdds();
      Integer answerForRedWins = preguantaParaEsquinaRoja.askRedWins();
      Integer answerForRedLosses = preguantaParaEsquinaRoja.askRedLosses();
      BlueQuestions preguantaParaEsquinaAzul = new BlueQuestions();
      Integer answerForBlueOdds =  preguantaParaEsquinaAzul.blueOdds();
      Integer answerForBlueWins = preguantaParaEsquinaAzul.askForBlueWins();
      Integer answerForBlueLosses = preguantaParaEsquinaAzul.askBlueLosses();





    }


}
