package classANDoop;
import java.util.Scanner;
public class TestItemToPurchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Item 1");
		System.out.println("Enter the item name:");
		String name = scnr.nextLine();
		System.out.println("Enter the item price:");
		int price = scnr.nextInt();
		System.out.println("Enter the item quantity:");
		int quantity = scnr.nextInt();
		ItemToPurchase item1 = new ItemToPurchase();
		item1.setPrice(price);
		item1.setQuantity(quantity);
		item1.setName(name);
		System.out.println();
		scnr.nextLine();
		System.out.println("Item 2");
		System.out.println("Enter the item name:");
		String name2 = scnr.nextLine();
		System.out.println("Enter the item price:");
		int price2 = scnr.nextInt();
		System.out.println("Enter the item quantity:");
		int quantity2 = scnr.nextInt();
		ItemToPurchase item2 = new ItemToPurchase();
		item2.setPrice(price2);
		item2.setQuantity(quantity2);
		item2.setName(name2);
//		
		System.out.println("TOTAL COST");
		System.out.println(item1.getName()+" "+ item1.getQuantity()+" @ $"+item1.getPrice()+" = $"+item1.totalOfItem());
		System.out.println(item2.getName()+" "+ item2.getQuantity()+" @ $"+item2.getPrice()+" = $"+item2.totalOfItem());
		scnr.close();	
		System.out.println("Total: $"+ItemToPurchase.Total);
	}

}
