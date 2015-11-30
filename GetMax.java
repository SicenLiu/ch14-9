import java.util.Date;

public class GetMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = {
				"abc", "rft", "wei", "yuw", "sdkl", "xuui", "qwer", "erto", "op", "za" 
		};
		Integer[] intArray = {
				1, 2, 3, 4, 5, 6, 7, 8, 9, 0
		};
		Date[] dateArray = new Date[10];
		dateArray[0] = new Date();
		for (int i = 0; i < 1000000000; i++) {	}
		System.out.println(dateArray[0].getTime());
		dateArray[1] = new Date();
		for (int i = 0; i < 1000000000; i++) {	}
		System.out.println(dateArray[1].getTime());
		dateArray[2] = new Date();
		for (int i = 0; i < 1000000000; i++) {	}
		System.out.println(dateArray[2].getTime());
		dateArray[3] = new Date();
		for (int i = 0; i < 1000000000; i++) {	}
		System.out.println(dateArray[3].getTime());
		dateArray[4] = new Date();
		for (int i = 0; i < 1000000000; i++) {	}
		System.out.println(dateArray[4].getTime());
		dateArray[5] = new Date();
		for (int i = 0; i < 1000000000; i++) {	}
		System.out.println(dateArray[5].getTime());
		dateArray[6] = new Date();
		for (int i = 0; i < 1000000000; i++) {	}
		System.out.println(dateArray[6].getTime());
		dateArray[7] = new Date();
		for (int i = 0; i < 1000000000; i++) {	}
		System.out.println(dateArray[7].getTime());
		dateArray[8] = new Date();
		for (int i = 0; i < 1000000000; i++) {	}
		System.out.println(dateArray[8].getTime());
		dateArray[9] = new Date();
		for (int i = 0; i < 1000000000; i++) {	}
		System.out.println(dateArray[9].getTime());
		
		String maxStr = (String)max(strArray);
		System.out.println(maxStr);
		
		Integer maxInt = (Integer)max(intArray);
		System.out.println(maxInt);
		
		Date maxDate = (Date)max(dateArray);
		System.out.println(maxDate.getTime());
	}
	@SuppressWarnings("unchecked")
	public static Object max(@SuppressWarnings("rawtypes") Comparable[] a) {
		@SuppressWarnings("rawtypes")
		Comparable max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max.compareTo(a[i]) < 0) {
				max = a[i];
			}
		}
		return max;
	}
}
