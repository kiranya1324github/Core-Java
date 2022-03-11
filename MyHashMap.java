import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

	public static void main(String[] args) {
	         HashMap<Integer, String>hh=new HashMap<Integer, String>();
	         hh.put(30, " Keerthi");
	         hh.put(20,"Kitty");
	         hh.put(10,"Mani");
	         System.out.println(hh);
	         for(Map.Entry<Integer, String>m:hh.entrySet()) {
	        	 System.out.println(m.getKey()+"  "+m.getValue());
	         }

	}

}
