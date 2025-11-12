class Ejee1{
	public static void main(String args[]){
		int i;
		for(i=1;i<=100;i++){
			if(i%3==0 && i%5==0){
				System.out.println("FIZZbuzz");
			}else{
				if(i % 3== 0){
					System.out.println("fizz");
				}else{
					if(i%5==0){
						System.out.println("Buzz");
					}else{
						System.out.println(i);
					}
				}
			}
		}
	}
}