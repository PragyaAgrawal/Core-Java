package programs99;

public class Prgrm61 {

	/**
	 * Floyd's Triangle
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,num=1;
		for (i = 1;  i<=4 ; i++) {
			for(j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
			
		}

	}

}
