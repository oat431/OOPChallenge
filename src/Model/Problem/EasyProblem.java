package Model.Problem;

import Abstract.Problem;
import lombok.*;

@Data
public class EasyProblem extends Problem {
    public EasyProblem(){
        super.problemLevel = Level.EASY;
        super.problemTitle = "Easy Problem";
    }    
}
