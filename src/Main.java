import com.whoWins.PromptClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PromptClass askUser = new PromptClass();
      String answer =  askUser.promptUser();
      System.out.println(answer);
    }
}
//Scanner scanner = new Scanner(System.in);
//Asks for red corner fight odds and fight record then saves response
//System.out.println("qual es la probialidades esquina roja/ probabilidades de lucha del desiafiador: ");
//String redSideOdds = scanner.nextLine();
//System.out.println("pelas ganadas esquina roja/ record ganadas del desiafiador: ");
//String redSideWins = scanner.nextLine();
//System.out.println("pelas perdidas de esquina roja/ perdidas registradas del desiafiador: ");
//String redSideLoss = scanner.nextLine();
//Integer oddsForRedSide = Integer.parseInt(redSideOdds);
//Integer RedSideWins = Integer.parseInt(redSideWins);
//Integer RedSideLosses = Integer.parseInt(redSideLoss);
//get reds side points
//RedCorner pointsForRedCorner = new  RedCorner();
// pointsForRedCorner.addRedPoints(redSideOdds,redSideWins,redSideLoss)


//Asks for red corner fight odds and saves response to an integer
//System.out.println("what is blue corner odds ");
//String blueSideOdds = scanner.nextLine();
//Integer blueSidePoints = Integer.parseInt(blueSideOdds);


//Calls for predictor class that will return prediction
//Predictor predictionCreator = new Predictor();
//String prediction = predictionCreator.predict(pointsForRedSide,blueSidePoints);

// prints to the console the winner
// System.out.println(prediction);


//scanner.close();
//        return ;