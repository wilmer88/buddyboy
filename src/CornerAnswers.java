import java.util.Scanner;
class CornerAnswers {
Scanner scanner = new Scanner(System.in);
        public String askForName (){
            System.out.println("enter a fighter name?: ");

            String nameOfFighter = scanner.nextLine();

            if (nameOfFighter.isEmpty() || nameOfFighter.matches("[0-9]+" ) || nameOfFighter.matches(".*\\d+.*") ){

               return askForName();
            }

            return nameOfFighter;
        }
        public Integer askOdds(String fighterName){

            while (true){
                System.out.println("what are " + fighterName + " odds? ");

                try {
//                    Integer fighter_odds = Integer.parseInt(scanner.nextLine());

                    return Integer.parseInt(scanner.nextLine());

                    }catch (NumberFormatException e){

                    System.out.println("bad input ");

                }
            }
        }
}