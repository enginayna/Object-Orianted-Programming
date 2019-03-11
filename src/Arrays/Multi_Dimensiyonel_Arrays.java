package Arrays;

public class Multi_Dimensiyonel_Arrays {
	public static void main(String[] args) {
		int[][] array = new int[3][3];
		int[][]arrays = {{1,2},{4,5}};//Single dimensiyonel yada multi dimensiyonel arrayler süslü parantez ile tanýmlanýr 
		int[][] arys = {{1,2,3},{4,5,6},{7,8,9}}; //3 e 3 multi array --SÜSLÜ PARANTEZ ÝLE TANIMLANIR--

		System.out.println(arys[1][2]); // Firs line Second column state(belirtmek)
		
		System.out.println(arrays[0][1]);
		
		System.out.println(array[2][2]); // empty int array =  0 -- empty String array = null 
		
		for (int i = 0; i < arys.length; i++) {
			for (int j = 0; j < arys.length; j++) {
				System.out.print(arys[i][j] + " ");
				if(j ==2) {
					System.out.println();	
				}
			}
		}
	} // multi dimensiyonel arrays show with two for loops  
	
	}
	