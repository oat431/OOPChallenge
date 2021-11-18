package Abstract;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class LivingThing {
    public static enum sex {
        FEMALE,
        MALE,
        BOTH
    } ;
    String specieName;
    double height;
    double weight;
}
