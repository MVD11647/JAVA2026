package Ejercicios1ev;

public class Hola extends HolaMundo {

    public static void main(String[] args) {
    	char a = 'a';
    	char b = '\u002a';
    	char c = '\100';
    	String d = "ab\nc";
    	String e = "\150\157\154\141";
    	String f = "\u0048\u006f\u006c\u0061\t\115undo!" + new StringBuilder().appendCodePoint(0x1F310);
    	System.out.print(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f);
    }

}