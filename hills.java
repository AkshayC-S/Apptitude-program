class Hills{
	public static void main(String []aks){
		System.out.println("Main() started");
		int num=0;
		
		for(int i=0;i<=aks.length;i++){
			
			if(num==8){
				System.out.println();
				num=0;
			}	
			
			aks[1]= "NandiHills";
			System.out.print(aks[i]+"\t");
			num++;
		}		
	}
}