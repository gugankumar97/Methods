package Methods;

public class VariableLengthArguments {

	public static void main(String[] args) {
		System.out.println(sum(1, 2, 3, 4, 5));
		System.out.println(sum(5));
		demoVarLenArgs(" Addition of ", 4,5,5,4,5,8);
		
		
	}

	private static int sum(int... number) {
		int sum = 0;
		for (int i : number) {
			sum += i;
		}
		return sum;
	}



	private static  void demoVarLenArgs(String s, int... num) {
		
		int sum = 0;
		
		for (int j : num) {
			sum += j;
			
		}
		
		System.out.printf("Result numbers : "+sum ,s);

             

}
}

