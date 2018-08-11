package primitives;

import org.junit.Assert;
import org.junit.Test;

public class PrimitiveBasics {

    @Test
    public void bitwiseOps() {
        int a = 0b00110000;
        int z = a & (a - 1);
        System.out.println(Integer.toBinaryString(a));
    }

    @Test
    public void parityCheckPlain() {
        Assert.assertEquals(1, ParityCheck.parity(0b11000011) );
        Assert.assertEquals(1, ParityCheck.parity(0b00000000) );
        Assert.assertEquals(0, ParityCheck.parity(0b00000001) );
        Assert.assertEquals(0, ParityCheck.parity(0b11001011) );
    }
}
