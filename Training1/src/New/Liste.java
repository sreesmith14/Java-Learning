package New;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;


public class Liste {
public static void main(String args[]) {
	Set list = new HashSet();
	list.add("Fire");
	list.add(10);
	list.add("Ambrane");
	list.add("Zebronics");
	list.add("gizmore");
	System.out.println(list);

	Iterator i = list.iterator();
	while(i.hasNext())
		System.out.println(i.next());
	
	Map map = new HashMap();
	map.put(1,"Boultt");
	map.put(2,"Intel");
	map.put(3,"AMD");
	map.put(null,"Simtronics");
	map.put(5,"biostar");
	
	System.out.println(map);
	Collection c = map.values();
	Iterator ii = c.iterator();
	while(ii.hasNext())
		System.out.println(ii.next());
	
	
}
}
