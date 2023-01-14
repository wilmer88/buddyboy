package com.whoWins;

import com.whoWins.Blue.BlueCornerWinLossCalculator;
import com.whoWins.Blue.BlueQuestions;
import com.whoWins.Blue.OddsForBlueCornerCalculator;
import com.whoWins.Red.OddsForRedCalculator;
import com.whoWins.Red.PreguantaParaEsquinaRoja;
import com.whoWins.Red.RedWinLossCalculator;


public class PromptClass {

  public String promptUser(){


      /** creates a new instance of questions to ask for Red corner
   then saves the response to be used later   */
        PreguantaParaEsquinaRoja preguantaParaEsquinaRoja = new PreguantaParaEsquinaRoja();
      Integer answerForRedOdds =  preguantaParaEsquinaRoja.askRedOdds();
      Integer answerForRedWins = preguantaParaEsquinaRoja.askRedWins();
      Integer answerForRedLosses = preguantaParaEsquinaRoja.askRedLosses();
      /** creates a new instance of questions to ask for Blue corner
       then saves the response to be used later   */
      BlueQuestions preguantaParaEsquinaAzul = new BlueQuestions();
      Integer answerForBlueOdds =  preguantaParaEsquinaAzul.blueOdds();
      Integer answerForBlueWins = preguantaParaEsquinaAzul.askForBlueWins();
      Integer answerForBlueLosses = preguantaParaEsquinaAzul.askBlueLosses();
      /** calls the Red winLoss calculator with red win and loss saved answers for parameters
       saves the return to an integer variable to be used later  */
      RedWinLossCalculator redWinLossCalculator = new RedWinLossCalculator();
      Integer returnedRedWinLossPoints = redWinLossCalculator.calculateRedWinLossPoints(answerForRedWins,answerForRedLosses);
      /** calls the Blue winLoss calculator with blue win and loss saved answers for parameters
       saves the return to an integer variable to be used later  */
      BlueCornerWinLossCalculator blueCornerWinLossCalculator = new BlueCornerWinLossCalculator();
      Integer returnedBlueWinLossPoints = blueCornerWinLossCalculator.calculateBlueWinLossPoints(answerForBlueWins,answerForBlueLosses);
      /** calls the Blue and Red odds calculator with blue and red saved odd answers for parameters
       saves the return points to an integer variable to be used later  */
      OddsForRedCalculator oddsForRedCalculator = new OddsForRedCalculator();
      OddsForBlueCornerCalculator oddsForBlueCornerCalculator = new OddsForBlueCornerCalculator();
      Integer redOddPoints = oddsForRedCalculator.redOddsCalculator(answerForRedOdds);
      Integer blueOddPoints = oddsForBlueCornerCalculator.blueOddsCalculator(answerForBlueOdds);
      /** predict the winner of the fight using the returned points for odds and win loss points using
       * the predictor class */
      Predictor predictor = new Predictor();
      String prediction = predictor.predict(redOddPoints,returnedRedWinLossPoints,blueOddPoints,returnedBlueWinLossPoints);
       return prediction;







    }


}
