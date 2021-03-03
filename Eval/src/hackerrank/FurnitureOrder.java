package hackerrank;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
	HashMap<Furniture, Integer> myFurnOrd = new HashMap<>();
//	Furniture fun1 ;
    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
    	
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
    	myFurnOrd.put(type, furnitureCount);
    	
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return null;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
    	float cost1=-1.0f;
    	if(!myFurnOrd.isEmpty()) {

    		cost1 = ((myFurnOrd.get(Furniture.CHAIR) * Furniture.CHAIR.cost())
    				+ (myFurnOrd.get(Furniture.TABLE) * Furniture.TABLE.cost())
    				+ (myFurnOrd.get(Furniture.COUCH) * Furniture.COUCH.cost())); 
    		}
    	
    	
        return cost1;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
    	int count=-1;
    	if(!myFurnOrd.isEmpty()) {
    		if(myFurnOrd.containsKey(type)) {
//    			System.out.println(type.CHAIR.cost());
    				count=myFurnOrd.get(type);
    		}
    	}
        return count;
    }


	public float getTypeCost(Furniture type) {
        // TODO: Complete the method
    	float cost = -55.0f;
    	cost = type.cost();
    	
    	if(!myFurnOrd.isEmpty()) {
    		//System.out.println("Cost from the Enum is :" + myFurnOrd);    		
    		System.out.println(cost);
    	}
    	
        return cost;
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
    	int size=-1;
    	if(!myFurnOrd.isEmpty()) {
        		size = myFurnOrd.get(Furniture.CHAIR) +
        				myFurnOrd.get(Furniture.TABLE)+
        				myFurnOrd.get(Furniture.COUCH);
    	}
    	
    	return size;
    }
    
 
}