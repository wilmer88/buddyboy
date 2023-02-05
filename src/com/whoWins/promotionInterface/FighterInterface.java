package com.whoWins.promotionInterface;

import java.util.Scanner;

//public interface FighterInterface <T> {
public interface FighterInterface {


            Scanner scanner = new Scanner(System.in);

            private void askForName (){
                System.out.println("enter a fighter name?: ");

                String nameOfFighter = scanner.nextLine();
                System.out.println(nameOfFighter);

                if (nameOfFighter.isEmpty() || nameOfFighter.matches("[0-9]+" ) || nameOfFighter.matches(".*\\d+.*") ){

                  System.out.println("valles verga");
                }

            }

            private Integer askOdds(String fighterName){

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
//
//            private void askWins( String fighterName) {
//
//                while (true) {
//                    System.out.println("what are " + fighterName + " wins?");
//
//                    try {
//                        scanner.nextInt();
//
//                    } catch (NumberFormatException e) {
//
//                        System.out.println("bad input ");
//
//                    }
//                }
//            }
//
//            private void askLosses( String fighterName){
//
//                while (true){
//
//                    System.out.println("what are " + fighterName + " losses?");
//
//                    try {
//                        scanner.nextInt();
//
//                    }catch (NumberFormatException e){
//
//                        System.out.println("bad input ");
//
//                    }
//                }
//            }


}