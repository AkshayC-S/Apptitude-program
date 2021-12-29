class Skanadagiri{
	public static void main(String []hills){ 
			System.out.println("main() started");
			int num=0;
			for(int i=0;i<hills.length;i++){
			
				if(num==8){
				System.out.println();
				num = 0;
				}
				
				hills[0] = "Skanadagiri hills ";
				System.out.print(hills[i]+"\t");
				num = num+1;
			}
			System.out.println();
			System.out.println("main() End");
		}
}