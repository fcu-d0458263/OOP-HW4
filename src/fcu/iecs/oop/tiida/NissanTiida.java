package fcu.iecs.oop.tiida;

public class NissanTiida {
	public void loop(int number){
		int i,j,k;
		for(k=0;k<number;k++){
			System.out.println((k+1)+" time tiida()");			
			for(i=0;i<k+1;i++){
				for(j=0;j<k+1;j++){
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}
	}
}
