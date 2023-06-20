class Test10{
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);

		for(int a=1; a<=n; a++){
			for(int i=1; i<=n; i++){
				if(a==i){
					System.out.print("¡Ú");
				}else{
					System.out.print("¡Ù");
				}
			}
			System.out.println("");
		}

	}
}