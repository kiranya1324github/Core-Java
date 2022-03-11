package com.edu;

import java.util.ArrayList;
import java.util.Iterator;

class Product{
		int pid;
		String pname;
		float pprice;
		public Product(int pid,String pname,float pprice) {
			super();
			
			this.pid=pid;
			this.pname=pname;
			this.pprice=pprice;
		}
		
		
		
		
		
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public float getPprice() {
			return pprice;
		}
		public void setPprice(float pprice) {
			this.pprice = pprice;
		}
}
		
		public class ProductMain {

			public static void main(String[] args) {
				
				ArrayList<Product> pd=new ArrayList();
				Product pod1=new Product(1,"12",123.56f);
				Product pod2=new Product(2,"Kiranya",23.56f);
				Product pod3=new Product(3,"560",45.6f);
				pd.add(pod1);
				pd.add(pod2);
				pd.add(pod3);
				
				
             Iterator<Product> pit=pd. iterator();
             while(pit.hasNext()) {
              
             Product p=pit.next();
            System.out.println(p.pid+" " +p.pname+"   "+p.pprice);
		
		}
		
		}
		}


