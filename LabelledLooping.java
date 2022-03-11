package p1;

public class LabelledLooping {

	public static void main(String[] args) {
		outer:
		for(int i=1;i<=5;i++) {
			inner:
			for(int j=1;j<=5;j++) {
				if(i==3) {
					break     inner;
				}
				System.out.print("i="+i+ "j=" +j);
			}
			System.out.println();
		}

	}

}
