package c4q.lighterletter;

import java.util.BitSet;
import java.util.Set;

/**
 * Created by c4q-john on 11/24/15.
 * <p/>
 * A bit vector behaves like a list of booleans; however, the booleans are encoded as individual bits in a larger
 * integer type such as int or long. This is eight times as efficient as an array of boolean, each of which occupies
 * one byte.
 * <p/>
 * Write a BitVector class. It should accept a length, in bits, at construction, and provide set(index, bit)
 * and get(index) methods, where the individual bits are represented by booleans. Your class should use about
 * length / 32 integer values or length / 64 long values to store the bits.
 */
public class BitVector {

    private final byte[] bArr;
    private int length;

    public BitVector(int length) {
        this.bArr = new byte[(length + 7) / 8];
        this.length = length;
    }
    public int length() {
        return length;
    }
    public boolean get(int index) {
//        int position = index / 8;
//        int bitPosition = index % 8;
//        byte b = bArr[position];
//        byte mask = (byte) (1 << bitPosition);
//        boolean result = (byte) (b & mask) != 0;
//        return result;

        // Same as code above.
        return (bArr[index / 8] & (byte) (1 << (index % 8))) != 0;
    }
    public void set(int bitIndex, boolean val) {
        int position = bitIndex / 8;
        int bitPosition = bitIndex % 8;
        byte b = bArr[position];
        byte mask = (byte) (1 << bitPosition);
        boolean result = (byte) (b & mask) != 0;

        if (val) {
            bArr[position] = (byte) (b | mask);
        } else {
            bArr[position] = (byte) (b & ~mask);
        }
    }
}
class run {
    public static void main(String[] args) {
        BitVector b = new BitVector(100);
        for (int i = 0; i < 10; i++) {
            b.set(i * i, true);
        }
        for (int i = 0; i < b.length(); i++) {
            System.out.print(b.get(i) ? "x" : ".");
        }
    }
}
