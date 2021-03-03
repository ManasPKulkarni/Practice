package hackerrank;

public class TestFurniture {
	
	   public static void main(String [] args) {
		   
		   Furniture fun2 = null;
		   FurnitureOrder order = new FurnitureOrder();
		   order.addToOrder(Furniture.CHAIR,80);
		   order.addToOrder(Furniture.TABLE,20);
		   order.addToOrder(Furniture.COUCH,6);
//		   System.out.println("Adding the element to HashMap Furniture!!!");
//		   System.out.println("Total Order Count for type " + Furniture.CHAIR + " : " + order.getTypeCount(Furniture.CHAIR));
//		   System.out.println("Total Order Count for type " + Furniture.TABLE + " : " + order.getTypeCount(Furniture.TABLE));
//		   System.out.println("Total Order Count for type " + Furniture.COUCH + " : " + order.getTypeCount(Furniture.COUCH));
//		   System.out.println("Total Cost for Furniture :" + Furniture.CHAIR + " : "+ order.getTypeCount(Furniture.CHAIR) * order.getTypeCost(Furniture.CHAIR));
//		   System.out.println("Total Order Quantity : " + order.getTotalOrderQuantity());
		   System.out.println("Total Type Cost : " + order.getTotalOrderCost());
		   System.out.println("Type Cost for "+ Furniture.TABLE + " : " + order.getTypeCost(Furniture.TABLE));
//		   System.out.println(fun2.CHAIR);
//		   
//		   for ( Furniture fun:Furniture.values()) {
//			   System.out.println("Furniture are : "+ fun.cost() + fun.label() + fun.name());
//		   }
		   
//		   System.out.println(Furniture.CHAIR.toString());
	    }

}
