package searching.com;

public class LinearSearchString {
	private String arr[];
	String search;
	
	LinearSearchString(){
		
		arr= new String[]{"Hrutik", "Tejas" , "James", "Luffy"};
		search = "Thomas";
	}
	
	public void searhFun() {
		
		int flag = 0;
		
		for(int i = 0; i < arr.length;  i++ ) {
			
			if(arr[i] == search) {
				flag = 1;
				//count = count + 1;
				
			}
		}
		
		if(flag == 1) {
			System.out.println(search + " found");
		//	System.out.println(search + " present " + count + " times");
		}else {
			System.out.println(search + " not found");
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String arr[] = {"11","33","22","44","77","88","99","55","66","110","44"};
		
		LinearSearchString obj = new LinearSearchString();
		obj.searhFun();
		}
	}


