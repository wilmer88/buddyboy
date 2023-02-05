package com.whoWins.questionsAndAnswers;
import com.whoWins.promotionInterface.FighterInterface;
 public abstract class PromptAboutFighter implements FighterInterface{
     public static String askForName() {
         return null;
     }
//'     {
//         return null;
//     }'
//    {
//        String nameOfFighter;
//        System.out.println("enter a fighter name?: ");
//        nameOfFighter = scanner.nextLine();
////335
////        if ( nameOfFighter.isEmpty() || nameOfFighter.matches("[0-9]+") || nameOfFighter.matches(".*\\d+.*")){
////            return askForName();
////        }
//        return nameOfFighter;
//    }



//     public String askName(){
//       return   fighterInterface.askForName();
//     }

     //    Scanner sc = new Scanner(System.in);
//    public String runPromptAboutFighter() {
//        System.out.println("what is fighter A name ");
//
//        String fighterName = sc.nextLine();
//
//        return fighterName;
//    }
    }



//              class QuestionBetter<T> implements FighterInterface {
//                  T[] contents = (T[]) new Object();
//                  private int stackPointer = 0;
//
//                  public void push(T item){
//
//                      assert stackPointer<contents.length : "push to full stack";
//                      contents[stackPointer++] = item;
//                  }
//                  public T pop() {
//                      assert  stackPointer > 0 : "pop from empty stack";
//                      return contents[ --stackPointer];
//                  }
//                  public void pushManny( T[] items ){
//                      assert ( stackPointer + items.length) <= contents.length
//                                                                : "too Many items";
//                      System.arraycopy(items, 0, contents, stackPointer, items.length);
//                  }
//
//                  public int size(){ return contents.length;}
//
//              }









//    CornerQuestions cornerAnswers = new Co;
//    private String askName(){
//        return cornerAnswers.askForName();
//    }
//
//    private Integer oddsAnswer(String theFighterName){
//        return cornerAnswers.askOdds(theFighterName);
//    }
//
//    private  int promptWins(String theFighterName){
//     return new Object[] {theFighterOdds,winsAndLosses };
//   }
