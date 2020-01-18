package MP21616範例程式碼.course.c05;

public class AutoPromotion {

	public static void main(String[] args) {

		/* Automatic Promotion for assign small to large*/
		byte x1 = 10;
		short x2 = x1;
		int y1 = 10;
		long y2 = y1;
		
		float z1 = 10.0f;
		double z2 = z1;
		
		/* Automatic Promotion for assign integer to floating */
		float e = 2;		// 4,4
		double f = 2;		// 8,4
		float g = 2L;		// 4,8
		double h = 2L;		// 8,8
		
		/* Can not assign floating to integer!! 
		 * will cause the lost of decimal point!! */
		float a = 2.34f;		// 4,4
		float b = 2.34f;		// 8,4
		double c = 2.34;		// 4,8
		double d = 2.34;		// 8,8

	}

}
