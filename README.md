 # buddyboy
> What is it?
> - Buddy boy is code name for fight predictor. Prompts user for both, red corner and blue corners: vegas odds, career wins and losses based on the data given calculates the winner of the fight.

 
---
> Stable version release
 - [buddyboy v1.1](https://github.com/wilmer88/buddyboy/releases/tag/v1.1)
### To run this aplication on you local machine.  
- click on ( buddyboy v1.1 ) link that is under ( Stable version release ) above
- download (Source code zip file)
- go to search, file explorer, then click downloads (or your default downloads location) on your computer 
- find buddyboy-1.1.zip and unzip folder
- a new folder will be created called buddyboy-1.1 
- inside buddyboy-1.1 will be a fightPredictor.iml 
- right click fightPredictor.iml file and open with your preferred java IDE/ (intelliJ)
- inside buddyboy-1.1 folder will be src folder click on the src folder 
- inside will be Main class click on Main 
- at the top of your IDE (intllij) click Run
- then click Run Main.java
- answer all prompts correctly with accurate information including the negative number symbols for the favorite.
- if answered correctly the application will display the winner
---
# Documentation
> #### I would like to give credit to Pluralsight for teaching me about Java OO design patterns. I also give credit to OpenAI language model trained by OpenAI, the regular expression ` .matches(".*[^a-zA-Z0-9 ].*")` and capturing the mistakes on the Scanner object that was being miss use inside the `static method asKForName()` in the FighterInterface file  that was analyze.

- #### inside the`src/com.whoWins.fighter.promotionInterface` package 
Prompts user for to input fighter the fighter name and the if statement checks for an empty string, integers, doubles, and special characters to return wrong.
```
    static String askForName(Scanner scanner) {
        String nameOfFighter;
        System.out.println("enter a fighter name?: ");
        nameOfFighter = scanner.nextLine();
        if (nameOfFighter.isEmpty() || nameOfFighter.matches("[0-9]+") || nameOfFighter.matches(".*\\d+.*") || nameOfFighter.matches(".*[^a-zA-Z0-9 ].*")) {
            return "wrong";
        }
        return nameOfFighter;
    }
```
 


