import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer,  String> tm=new TreeMap<Integer,  String>();
		tm.put(20,"Keerthi");
		tm.put(40,"Kitty");
		tm.put(25,"Mani");
		System.out.println(tm);
		
		for(Map.Entry<Integer, String>m:tm.entrySet()) {
			System.out.println(m.getKey()+"   "+m.getValue());
		}

	}

}
