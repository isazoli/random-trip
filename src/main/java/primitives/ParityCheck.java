package primitives;

public class ParityCheck {

    public static byte parity(int x) {
        byte parityFlag = 1;

        while (x > 0) {
            int isOne = x & 1;
            parityFlag ^= isOne;
            x >>>= 1;
        }
        return parityFlag;
    }
}
