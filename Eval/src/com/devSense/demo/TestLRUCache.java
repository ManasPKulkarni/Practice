package com.devSense.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class Node {
	int key;
	int val;
	Node prev;
	Node next;

	public Node(int x, int y) {
		this.key = x;
		this.val = y;
	}
}

class LRUCache { 
    private LinkedHashMap<Integer, Integer> map; 
    private final int CAPACITY; 
    public LRUCache(int capacity) 
    { 
        CAPACITY = capacity; 
        map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) { 
            protected boolean removeEldestEntry(Map.Entry eldest) 
            { 
                return size() > CAPACITY; 
            } 
        };
        
    
        
    } 
  
    // This method works in O(1) 
    public int get(int key) 
    { 
        System.out.println("Going to get the value " +  
                               "for the key : " + key); 
        return map.getOrDefault(key, -1); 
    } 
  
    // This method works in O(1) 
    public void set(int key, int value) 
    { 
        System.out.println("Going to set the (key, " +  
             "value) : (" + key + ", " + value + ")"); 
        map.put(key, value); 
    } 
}

/*
class LRUCache {
	private HashMap<Integer, Node> map;
	private int capacity, count;
	private Node head, tail;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		map = new HashMap<>();
		head = new Node(0, 0);
		tail = new Node(0, 0);
		head.next = tail;
		tail.prev = head;
		head.prev = null;
		tail.next = null;
		count = 0;
	}

	public void deleteNode(Node node) {
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}

	public void addtoHead(Node node) {
		node.prev = head;
		node.next = head.next;
		node.next.prev = node;
		head.next = node;
	}

	public int get(int key) {
		int result = -1;
		if (map.get(key) != null) {
			Node node = map.get(key);
			result = node.val;
			deleteNode(node);
			addtoHead(node);
			System.out.println("Got the Value as : " + result + " for key : " + key);
			return result;
		} else {
			System.out.println("Did not get any value : " + " for key : " + key);
			return result;
		}
	}

	public void set(int key, int value) {
		System.out.println("Going to set the values in map ( key as: " + key + " and value " + " as: " + value + " )");
		/*
		 * Check the map if the key is present before adding. if present means the value
		 * is there but it might be stale so we need to delete the existing and add the
		 * new one to the head Node else if the Value is not present in the map check
		 * the capacity and add the kay value pair in the map if capacity is exceeded
		 * remove the tail element and add to Head
		 */
		/*if (map.get(key) != null) {
			Node node = map.get(key);
			node.val = value;
			deleteNode(node);
			addtoHead(node);
		} else {
			Node node = new Node(key, value);
			map.put(key, node);
			if (count < capacity) {
				count++;
				addtoHead(node);
			} else {
				map.remove(tail.prev.key);
				deleteNode(tail.prev);
				addtoHead(node);
			}
		}
	}

}
*/

public class TestLRUCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Going to test the LRU " + " Cache Implementation");
		LRUCache cache = new LRUCache(2);

		cache.set(1, 10);
		cache.set(2, 200);

		System.out.println("Value for key 1 is :" + cache.get(1));
	
		cache.set(3, 350);
		System.out.println("Value for key 2 is :" + cache.get(2));
		
		cache.set(4, 450);
		System.out.println("Value for key 1 is :" + cache.get(1));
		
		System.out.println("Value for key 3 is :" + cache.get(3));
		System.out.println("Value for key 4 is :" + cache.get(4));
		
	}

}
