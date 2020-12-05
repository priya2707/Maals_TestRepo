package com.maalini.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateCheck {
	public static void main(String args[]) {
		
	
	List<Integer> weight = new ArrayList<Integer> ();
	List<String> name = new ArrayList<String> ();
	List<Integer> quantity = new ArrayList<Integer> ();
	Map <String, Integer> dup = new HashMap <String, Integer>();
	int count = 0;
	
	weight.add(1);
	weight.add(2);
	weight.add(3);
	weight.add(2);
	

	quantity.add(1);
	quantity.add(2);
	quantity.add(3);
	quantity.add(2);
	

	name.add("cat");
	name.add("mat");
	name.add("bat");
	name.add("mat");
	
	for(int i = 0; i<4 ; i++) {
	StringBuffer sb = new StringBuffer();
	sb.append(name.get(i));
	sb.append(weight.get(i));
	sb.append(quantity.get(i));
	System.out.println(sb);	
	
	if(dup.get(sb.toString()) != null) {
		count++;
	}else
		dup.put(sb.toString(), 1);

	}
	
	System.out.println(count);
	
}
}