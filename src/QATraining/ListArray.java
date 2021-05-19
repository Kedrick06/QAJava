package qatraining;

import java.util.ArrayList;
import java.util.List;

public class ListArray {
	
	public static void main (String[] args) {
		
		List<Integer> arrayList = new ArrayList<>();
		
		int x = 25;
		
		arrayList.add(x++);
		arrayList.add(x++);
		arrayList.add(x++);
		arrayList.add(x++);
		arrayList.add(x++);
		arrayList.add(x++);
	
		for(Integer handle : arrayList) 
		
	{System.out.println(handle);}

	}
}
