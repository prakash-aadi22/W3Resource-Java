package Data_Types;

import java.math.BigInteger;

public class q_14 {
    public static void main(String[] args) {
        BigInteger bigVal = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println("BigInteger value: " + bigVal);
        long val_Long = bigVal.longValue();
        System.out.println("Convert the said BigInteger to an long value: " + val_Long);
        int val_Int = bigVal.intValue();
        System.out.println("Convert the said BigInteger to an int value: " + val_Int);
        short val_Short = bigVal.shortValue();
        System.out.println("Convert the said BigInteger to an short value: " + val_Short);
        byte val_Byte = bigVal.byteValue();
        System.out.println("Convert the said BigInteger to byte: " + val_Byte);
        long val_ExactLong = bigVal.longValueExact();
        System.out.println("Convert the said BigInteger to exact long: " + val_ExactLong);
    }
}
