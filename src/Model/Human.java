package Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import Abstract.LivingThing;
import Abstract.Problem;
import Abstract.Problem.Level;
import Interface.Communicate;
import Interface.Intelligent;
import Interface.Survival;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Human extends LivingThing implements Communicate,Intelligent,Survival {

    @Override
    public void solving(Problem problem) {

        if(problem.getProblemLevel() == Level.EASY){
            System.out.println("doing stuff");
        }
        if(problem.getProblemLevel() == Level.MEDIUM){
            System.out.println("doing harder stuff");
        }
        if(problem.getProblemLevel() == Level.HARD){
            System.out.println("doing very hard stuff");
        }
    }

    @Override
    public void greeting() {
        System.out.println("Hello");
    }

    @Override
    public void complaining() {
       System.out.println("What the hell is this?"); 
    }

    @Override
    public void talking(String message) {
        System.out.println(message);
    }

    @Override
    public boolean startFire() {
        return true;
    }

    @Override
    public boolean Hunting() {
        return true;
    }

    @Override
    public boolean FoodMaintaining() {
        return true;
    }

    
}
