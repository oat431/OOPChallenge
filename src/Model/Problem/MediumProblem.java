package Model.Problem;

import lombok.Data;
import Abstract.Problem;

@Data
public class MediumProblem extends Problem{
    public MediumProblem(){
        super.problemLevel = Level.MEDIUM;
        super.problemTitle = "Medium Problem";
    } 
}
