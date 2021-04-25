package Demo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ll = new LinkedList<>();
		ll.add("Mohana");
		ll.add("Mohana");
		ll.add(" ");
		ll.add(" ");
		ll.add(" ");
		ll.add("Priya");
		System.out.println(ll);
		
		Set<String> hs = new HashSet<>();
		hs.add("Mohana");
		hs.add("Mohana");
		hs.add(" ");
		hs.add(" ");
		hs.add("Priya");
		System.out.println(hs);
		
		Map<Integer,String> hm=new HashMap<>();
		hm.put(1, "Mohana");
		hm.put(2, "Mohana");
		hm.put(3, "aaa");
		hm.put(4, "Moha");
		hm.put(null ," ");
		hm.put(5 ," ");
		System.out.println(hm);
		
		
	

	}

}
