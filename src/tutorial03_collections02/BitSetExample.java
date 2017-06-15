package tutorial03_collections02;

import java.util.BitSet;

public class BitSetExample {

    public static void main(String[] args) {

        int size = 1000;

        BitSet bitField = new BitSet(size);

        bitField.set(1, true); // set the bit at index to the boolean given
        bitField.clear(1); // clears the bit at index
        bitField.cardinality(); // the number of set bits
        bitField.set(1, 45); // set all the bits from start to end to true
        bitField.clear(1, 45); // clears all the bits in the range
        bitField.and(new BitSet()); // and the current bitField with the one given in the parameter
        // BitSet is not immutable so this operation will change the current state of the object
        // and much more
    }

}
