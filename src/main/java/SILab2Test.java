import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    public void MultipleCondition(){
        aUser user = new User("Tenda","123inernet", "whatever");

        assertFalse(SILab2.function(new User("Tenda","123internet","whatever"),null));
        assertFalse(SILab2.function(new User("Tenda","null","whatever"),null));
        assertFalse(SILab2.function(new User("null","whatever","whatever"),null));

        assertFalse(SILab2.function(new User("Tenda","123internet","whatever"),null));
        assertFalse(SILab2.function(new User("Tenda","123i","whatever"),null));
        assertFalse(SILab2.function(new User("Tenda","123interne","whatever"),null));

    }
}
