class Fibonacci{
	public static void main(String args[]){
		int n=10;
		int num1=0,num2=1;
		
		System.out.println("Fibonacci Numbers are");
		System.out.print(num1+"\t"+num2+"\t");
		
		for(int i=1;i<=n;i++){
			
			
			int total=num1+num2;
			num1=num2;
			num2=total;
			System.out.print(total+"\t");
		}
	}
}