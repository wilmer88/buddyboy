import com.whoWins.fighter.promotionInterface.Questions;
public class Main {
    public static void main(String[] args) {
        Questions questions = new Questions();
        String name;
     name =  questions.askNameMethod();
                System.out.println(name);
    }}






//        PromptAboutFighter cholo = new PromptAboutFighter();
//      String fighterName = cholo.askName();
//        System.out.println(fighterName);
//        class MyClass implements FighterInterface {
////            Scanner scanner = new Scanner(System.in);
//
//            private void askForName() {
//
//            }
//        }

//Scanner scanea = new Scanner(System.in);
//   System.out.println("what up blood");
//        String blood = scanea.nextLine();
//        System.out.println("no sea guey " +blood +" puto");
//        String response = scanea.nextLine().toLowerCase();
//
//        switch (response){
//            case "si":
//                System.out.println("ok puto");
//                break;
//            case "no":
//                System.out.println("enontess");
//             String esteEs=   scanea.nextLine();
//             System.out.println("no seas joto " + esteEs);
//            default:
//                System.out.println("Asi te llamas guey? " + response+" ?");
//
//        }





//        switch (response){
//            case "wilmer":
//                System.out.println("great you doing it "+ name);
//        }
//        com.whoWins.fighter.promotionInterface.FighterInfoHelper infoHelper = new com.whoWins.fighter.promotionInterface.FighterInfoHelper();
//        infoHelper.helperOne();
//

//        com.whoWins.CornerAnswers c = new com.whoWins.CornerAnswers();
//      String askedName =  c.name = c.askForName();
//       double askedOdds = c.odds = c.askOdds(askedName);

//}}

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