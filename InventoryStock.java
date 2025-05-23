public class InventoryStock{
	public static void main(String[] args){
		int[] stock={3,5,7,3,10};
		int miniStock=stock[0];
		int minIndex=0;
		boolean outOfStock=false;
		for(int i=0;i<stock.length;i++){
			if(miniStock>stock[i]){
				miniStock=stock[i];
				minIndex=i;
		}
		if(stock[i]==0){
			outOfStock=true;
		}
	}
System.out.println("Product with lowest stock:Product "+(minIndex+1)+" (stock:"+miniStock+")");
System.out.println("Any product is out of stock:"+(outOfStock?"YES":"NO"));
}
}
