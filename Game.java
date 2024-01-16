
package game;

public class Game {

    public static void main(String[] args) {
       Player hero = new Player ();
       Player enemy = new Player ();
       
       hero.name = "tata";
       hero.speed = 68;
       hero.damage = 70;
       hero.armor = 20;
       hero.healtPoint = 0;
       
       enemy.name = "kela";
       enemy.speed = 20;
       enemy.damage = 18;
       enemy.armor = 5;
       enemy.healtPoint = 30;
       
       
       hero.run();
       hero.attack(enemy.name);
       
       
       if(hero.isDead()){
           System.out.println("Game Over :(" );
       }
    }
    
}
