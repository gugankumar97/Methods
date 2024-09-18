package Methods;

public class PassByValueAndReference {

	public static void main(String[] args) {
		System.out.println(sum(1, 2, 3, 4, 5));
		System.out.println(sum(5));
		demoVarLenArgs(" Addition of ", 4,5,5,4);
	}

	private static int sum(int... number) { 
		int sum = 0;
		for (int i : number) {
			sum += i;
		}
		return sum;
	}



	private static void demoVarLenArgs(String s, int... num) {
		
		int sum = 0;
		int count =0;
		for (int j : num) {
			sum += j;
			count++;
		}
		System.out.printf("Result : %s %d numbers : "+sum ,s, count);

	}

	}


