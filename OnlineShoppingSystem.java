abstract class Product{
		String productId;
		String name;
		double price;
		Product(String productId,String name,double price){
			this.productId=productId;
			this.name=name;
			this.price=price;
		}
		abstract double calculateDiscountPrice();
		void displayProductDetails(){
			System.out.println("Product Id:"+productId);
			System.out.println("Name:"+name);
			System.out.println("Orginal price:$"+price);
			System.out.println("Discounted price:$"+calculateDiscountPrice());
		}
}
class Electronic extends Product{
		Electronic(String productId,String name,double price){
			super(productId,name,price);
		}
		@Override
		double calculateDiscountPrice(){
			return price-(price*0.10);
		}
}
class Clothing extends Product{
		Clothing(String productId,String name,double price){
		super(productId,name,price);
		}
		@Override
		double calculateDiscountPrice(){
			return price-(price*0.15);
		}
}
public class OnlineShoppingSystem{
		public static void main(String args[]){
			Electronic loptop=new Electronic("E101","Loptop",1000);
			Clothing shirts=new Clothing("C202","Shirt",50);
			loptop.displayProductDetails();
			shirts.displayProductDetails();
		}
}
