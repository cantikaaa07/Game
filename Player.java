
package game;

public class Player {
    String name;
    int speed;
    int healtPoint;
    int damage;
    int armor;
    
    void run (){
        System.out.println(name +" is running");
        System.out.println("Speed " + speed);
    }
    
    void attack (String a){
        System.out.println(name +" is attacking.........kela");
        System.out.println("damage " + damage);
        
    }
    
    void defend(){
        System.out.println(name + " is defend ");
        System.out.println("armor " + armor);
    }
    boolean isDead(){
       if (healtPoint <= 0) return true;
       return false;    
       
    }
    
}
