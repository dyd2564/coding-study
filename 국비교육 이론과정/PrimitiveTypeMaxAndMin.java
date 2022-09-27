package primitive;

public class PrimitiveTypeMaxAndMin {
	public static void main(String[] args) {
		System.out.println("byteÅ¸ÀÔÀÇ ÃÖ¼Ú°ª : "+Byte.MIN_VALUE);
		System.out.println("byteÅ¸ÀÔÀÇ ÃÖ´ñ°ª : "+Byte.MAX_VALUE);
		byte minValue = -128;
		byte maxValue = 127;
		
		System.out.println((int)Character.MIN_VALUE); // °ø¹é ¹®ÀÚ
		System.out.println((int)Character.MAX_VALUE); // ?
		
		System.out.println("shortÅ¸ÀÔÀÇ ÃÖ´ñ°ª :"+Short.MAX_VALUE);
		System.out.println("shortÅ¸ÀÔÀÇ ÃÖ¼Ú°© :"+Short.MIN_VALUE);
		short maxShValue  = 32767;
		short minShValue  = -32768;
		
		System.out.println("floatÅ¸ÀÔÀÇ ÃÖ´ñ°ª : "+Float.MAX_VALUE);
		System.out.println("floatÅ¸ÀÔÀÇ ÃÖ´ñ°ª : "+Float.MIN_VALUE);
		
		System.out.println("shortÅ¸ÀÔÀÇ ÃÖ´ñ°ª : "+Double.MAX_VALUE);
		System.out.println("shortÅ¸ÀÔÀÇ ÃÖ¼Ú°ª : "+Double.MIN_VALUE);
		
	}
}
