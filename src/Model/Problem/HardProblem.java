package Model.Problem;

import Abstract.Problem;
import lombok.Data;

@Data
public class HardProblem extends Problem{
    public HardProblem(){
        super.problemLevel = Level.HARD;
        super.problemTitle = "Hard Problem";
    }
}
