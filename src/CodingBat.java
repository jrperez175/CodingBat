
public class CodingBat {

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
	
	
	public static void main(String[] args) {
		//int[] test = { 1, 1, 2, 3, 1 };
		String texto = "kitten";
		//boolean respuesta = array123(test);
		String respuesta= altPairs(texto);
	}
}
