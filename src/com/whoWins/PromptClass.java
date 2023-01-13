package com.whoWins;

import java.util.Scanner;


public class PromptClass {

  public void promptUser(){

      Scanner scanner = new Scanner(System.in);
      //Asks for red corner fight odds and saves response to an integer
      System.out.println("qual es la probialidades esquina roja/ probabilidades de lucha del desiafiador: ");
      String redSideOdds = scanner.nextLine();
      Integer pointsForRedSide = Integer.parseInt(redSideOdds);

      //Asks for red corner fight odds and saves response to an integer
      System.out.println("what is blue corner odds ");
      String blueSideOdds = scanner.nextLine();
      Integer blueSidePoints = Integer.parseInt(blueSideOdds);


      //Calls for predictor class that will return prediction
      Predictor predictionCreator = new Predictor();
      //String prediction = predictionCreator.predict(pointsForRedSide,blueSidePoints);

     // prints to the console the winner
     // System.out.println(prediction);


      scanner.close();
        return ;

    }


}
