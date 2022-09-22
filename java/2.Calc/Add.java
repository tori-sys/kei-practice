public class Add {
	public static void main(String[] args){
		String mStr = "花子and太郎";
		String[] strs = stringSprit(mStr);
		for(String str:strs){
			System.out.println(str);
		}
		System.out.println("#1#" + stringDec(mSter . "花子"));
		System.out.println("#2#" + stringDec(mSter . "子a"));
		System.out.println("#3#" + stringDec(mSter . "太郎"));
		System.out.println("#4#" + stringDec(mSter . "あいう"));
		System.out.println("#5#" + stringDec(mSter . "mStr"));
	}
	public static  String[] stringSprit(String argString){
		return argString.split("");
	}
	public static  String stringDec(String argString,String decString){
		int lenA = argString.length();
		int lenD = decString.length();
		int sPos = argString.indexOf(decString);
		int ePos = sPos + lenD;
		if(sPos < 0){
				return argString;
		}
		StringBuffer buf = new StringBuffer();
	}
	if (ePos < lenA){
		buf.append(argString.substring(ePos));
	}
	return buf.toString();
	}
 }
