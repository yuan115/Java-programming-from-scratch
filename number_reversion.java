package yuan;

public class number_reversion {
	
	public static void main(String args[]) {
		int x = -96463453;
		
		if(x>0){			
			System.out.println(reverse(x));
		} else if(x < 0) {
			x = Math.abs(x);
			char[] cTmp = reverse(x);
			x = Integer.valueOf(String.copyValueOf(cTmp));
			x = Math.negateExact(x);
			System.out.println(x);
		} else {
			System.out.println(0);
		}
	}
	
	public static char[] reverse(int x){
		String str = String.valueOf(x);
		char[] cArray = str.toCharArray();
		char[] cRet = new char[cArray.length];
		
		int j = 0;
		for(int i = cArray.length-1; i>=0; i --){
			cRet[j] = cArray[i];
			j ++;
		}
		
		return cRet;
	}
}
