import java.lang.System.*;
import java.util.Scanner;

//NOVITA PERDANI - 14410100181

public class latihanpertemuan4_pencetakbilgenap_14410100181 {
	 public static void main(String args[]) {
		 
		 Scanner input = new Scanner(System.in);
		 System.out.print("Masukkan jumlah bilangan : ");
		 int n = input.nextInt();
		 int i=1;
		 int bilangangenap=0;
		 
		 
		 while (i<=n) {
			 System.out.println (i*2);
			 
			/*bilangangenap = bilangangenap + 2;
			System.out.println (i + bilangangenap);
			if(i % 2 == 0){
				System.out.println (i);
			}
			else{
				bilangangenap = bilangangenap + 1;
				System.out.println (bilangangenap);
			}*/
			
			 i++;
		 }
		 	 
	 
	 }
}