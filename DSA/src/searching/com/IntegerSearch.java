package searching.com;
// linear search
public class IntegerSearch {

	
	public void searhFun(int arr[], int search) {
		int flag = 0 ;
		int count = 0;
		for(int a: arr) {
			
			if(a == search) {
				flag = 1 ;
				count = count + 1;
			}else {
				flag = 0;
			}
		}
		
		if(flag == 1) {
			System.out.println("found");
			System.out.println(search + " present " + count + " times");
		}else {
			System.out.println("not found");
		}
		
		
	}
	
	
public static void main(String args[]) {
	int arr[] = {11,33,22,44,77,88,99,55,66,110,44};
	int search = 44;
	IntegerSearch obj = new IntegerSearch();
	obj.searhFun(arr, search);
	}
}
