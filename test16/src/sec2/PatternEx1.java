package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Pattern : Æ¯Á¤ µ¥ÀÌÅÍ°¡ Çü½ÄÀÌ ¸Â´Â´Â ºñ±³ÇÏ·Á°í ÇÒ °æ¿ì  µ¥ÀÌÅÍ Çü½ÄÀ» ÁöÁ¤ÇÏ´Â Å¬·¡½º 
//Matcher : Æ¯Á¤ ÆĞÅÏÀÇ ÇüÅÂ°¡ ¸Â´ÂÁö ºñ±³ÇÏ´Â Å¬·¡½º 
//Á¤±Ô½Ä(Reg Expression) => RegEx
public class PatternEx1 {
	public static void main(String[] args) {
		String[] dt = {"bag","kim1004","9 to 6","8 to 5","Single","Mom","ABC","±è±âÅÂ","^*^","123123"};
		//Pattern p = Pattern.compile("[a-z]*"); //¿µ¹® ¼Ò¹®ÀÚ·Î¸¸ ±¸¼ºµÈµ¥ÀÌÅÍ
		//Pattern p = Pattern.compile("S[A-Z a-z]*"); //s·Î ½ÃÀÛÇÏ¸é¼­ ¿µ¹® ´ë¼Ò¹®ÀÚ·Î ±¸¼ºµÈ µ¥ÀÌÅÍ
		//Pattern p = Pattern.compile("[°¡-ÆR]*"); //s·Î ½ÃÀÛÇÏ¸é¼­ ¿µ¹® ´ë¼Ò¹®ÀÚ·Î ±¸¼ºµÈ µ¥ÀÌÅÍ
		//Pattern p = Pattern.compile("[e]$*"); //Æ¯Á¤ ¹®ÀÚ·Î ³¡³ª´Â °æ¿ì$  ¾È³ª¿È
		//Pattern p = Pattern.compile("^b"); //Æ¯Á¤ ¹®ÀÚ·Î ½ÃÀÛÇÏ´Â°æ¿ì		¾È³ª¿È
		  Pattern p = Pattern.compile("[0-9]*"); //¸ğµç°ªÀÌ ¼ıÀÚÀÎ µ¥ÀÌÅÍ  ???????^Â÷ÀÌ°¡ ¸ÓÀÓ???????????????
		for(int i=0 ; i<dt.length; i++) {
			Matcher m = p.matcher(dt[i]);
			if(m.matches()) {
				System.out.println("Çü½Ä ÀÏÄ¡ :"+dt[i]);
				
			}
		}
	}
}
