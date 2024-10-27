public class ShiftRows {
	// 行位移运算
	public static byte[][] shift(byte[][] nibble)
	{
		byte[][] result = Basicfunction.Emptynibbles();
		result[0][0] = nibble[0][0];
		result[0][1] = nibble[0][1];
		result[1][0] = nibble[1][1];
		result[1][1] = nibble[1][0];
		return result;
	}
}
