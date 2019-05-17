package factoryPattern;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void doStuffEnemy(EnemyShip enemyShip){
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }

    public static void main(String[] args) {
        // Static Code
        EnemyShip ufoShip = new UFOEnemyShip();
        doStuffEnemy(ufoShip);

        // Using Bad Design
        // Dynamic: but a lot of if-then-else statements
        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);
        String enemyShipOption = "";
        System.out.println("What type of ship (U/R)?");
        if(userInput.hasNextLine()){
            enemyShipOption = userInput.nextLine();
        }

        if(enemyShipOption.equals("U")){
            theEnemy = new UFOEnemyShip();
        } else if(enemyShipOption.equals("R")){
            theEnemy = new RocketEnemyShip();
        }
        doStuffEnemy(theEnemy);


        // Using Good Design
        // Using Factory Pattern
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        EnemyShip theEnemy2 = null;
        Scanner userInput2 = new Scanner(System.in);
        System.out.println("What type of ship (U/R)?");
        if(userInput2.hasNextLine()){
            String typeOfShip = userInput.nextLine();
            System.out.println("Entered char is:" + typeOfShip);
            theEnemy2 = enemyShipFactory.makeEnemyShip(typeOfShip);
        }

        if(theEnemy2 != null){
            doStuffEnemy(theEnemy2);
        }else{
            System.out.println("Enter a U, R or B next time");
        }
    }
}
