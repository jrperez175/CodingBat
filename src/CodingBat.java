
public class CodingBat {
	
	public static void main(String[] args) {
		int[] nums = {6, 7, 2, 6};
		//String a = "xxcaazz";
		//String b = "xxbaaz";
		//String str = "xabxxxcdx";
		//boolean respuesta = array123(test);
		//String respuesta= altPairs(texto);
		//int respuesta= arrayCount9(nums);
		//int respuesta=stringMatch(a, b);
		//String respuesta=stringYak(str);
		//boolean respuesta= has271(nums);
		//int respuesta = countXX(str);
		//String respuesta = stringSplosion(str);
		//boolean respuesta= arrayFront9(nums);
		//String respuesta=stringX(str);
		int respuesta= array667(nums);
		System.out.println(respuesta);
	}

	private static int array667(int[] nums) {
		int count =0;
		for (int i=0; i<nums.length-1;i++) {
			if((nums[i]==6 && nums[i+1]==6) || (nums[i]==6 && nums[i+1]==7)) {
				count++;
			}
		}
		return count;
	}

	private static String stringX(String str) {
		String respuesta="";
		String inicio="";
		String fin="";
		
		if (str.substring(0,1).equals("x")) inicio="x";
		if (str.substring(str.length()-1).equals("x")) fin="x";
		
		for (int i=0;i<str.length();i++) {
			if (!str.substring(i,i+1).equals("x")) {
				respuesta= respuesta+str.substring(i,i+1);
			}
		}
		return inicio+respuesta+fin;
	}

	private static boolean arrayFront9(int[] nums) {
		int end= nums.length;
		
		if (end>4) end=4;
		
		for(int i=0;i<end;i++) {
			if (nums[i]==9)	return true;
			
		}
		return false;
	}

	private static String stringSplosion(String str) {
		String respuesta = "";
		for(int i=str.length();i>=0;i--) {
			respuesta = str.substring(0, i)+respuesta;
		}
		return respuesta;
	}

	private static int countXX(String str) {
		int count = 0 ;
		for (int i=0; i<str.length()-1;i++) {
			if(str.charAt(i)=='x' && str.charAt(i+1)=='x') {
				count++;
			}
		}
		return count;
		
	}

	private static boolean has271(int[] nums) {
		for(int i=0; i<nums.length-1;i++) {
			if (nums[i+1]==nums[i]+5 && Math.abs(nums[i+2] - (nums[i]-1)) <= 2) {
				return true;
			}
		}
		return false;
	}

	private static String stringYak(String str) {
		int contador=str.indexOf("yak");
		String respuesta ="";
		 
		while (contador !=-1) {
			respuesta=respuesta+str.substring(0, contador);
			str=str.substring(contador+3);
			contador=str.indexOf("yak");
		}
	
		return (respuesta + str);
	}

	private static int stringMatch(String a, String b) {
		// TODO Auto-generated method stub
		int menor=0;
		int respuesta=0;
		
		menor = Math.min(a.length(), b.length());
		 
		for (int i=0;i<=menor-2;i++) {
			if(a.substring(i,i+2).equals(b.substring(i,i+2))) {
				respuesta++;
			}
		}
		return respuesta;
	}

	private static int arrayCount9(int[] nums) {
		// TODO Auto-generated method stub
		int respuesta=0;
		
		for (int i=0;i<nums.length;i++) {
			if (nums[i]==9) {
			respuesta=respuesta+1;	
			}
		}
		return respuesta;
	}
	
	public static boolean array123(int[] nums) {
		String secuencia = "";
		//String secuenciaABuscar="123";
		
		for (int i = 0; i < nums.length - 2; i++) {
			secuencia = String.valueOf(nums[i]) + String.valueOf(nums[i + 1]) + String.valueOf(nums[i + 2]);
			if (secuencia.equals("123")) {
				return true;
			}
		}
		return false;
	}

	public static String altPairs(String str) {
		  String resultado ="";
		  int contador=0;
		  for(int i=0; i <= str.length()-1;i++){
		    if (contador!=2){
		      resultado = resultado+str.substring(i,i+1); 
		      contador=contador+1;
		    }else{
		      i=i+1;
		      contador =0;
		    }
		  }
		  return resultado;
		}
	
}
