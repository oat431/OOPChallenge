package Abstract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Problem {
    public static enum Level {
        EASY,
        MEDIUM,
        HARD
    } 
    protected String problemTitle;
    protected Level problemLevel;

    public Level getProblemLevel(){
        return this.problemLevel;
    }

}
