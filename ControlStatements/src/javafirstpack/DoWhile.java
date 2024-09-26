package javafirstpack;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, sum=0;
		do {
			sum += i;
			++i;
		}while(i<=10);
		System.out.println("summation is : "+ sum);
	}

}
