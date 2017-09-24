import java.util.*;

public class PhoneList {
	
	public ArrayList<String> list;	
	public Scanner s;
	public int testCase;
	public int numph;
	public String pNum;
	
	public PhoneList(){
		this.list = new ArrayList<String>();
		this.s = new Scanner(System.in);
		this.pNum = new String();
	}
	
	private void init() {
		System.out.println("Enter the number of testCases:");
		testCase = s.nextInt();
		
		
		if(testCase < 1 || testCase > 40)
			System.out.println("Testcase need to be in range 1 to 40.");
		
		for(int i = 0; i<testCase;i++){
			getphNumbers();
			if(Consistent())
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	private void getphNumbers(){
		System.out.println("How many numbers?");
		numph = s.nextInt();
		if(numph<1 || numph>10000)
			System.out.println("Phonenumbers need to be in range 1 to 10000.");
		
		list.clear();
		
		for(int i = 0; i<numph; i++){
			pNum = s.next();
			list.add(pNum);
		}
		
		Collections.sort(list);
	}
	
	private boolean Consistent(){
		for(int i=0; i<numph-1; i++){
			String potentialPrefix = list.get(i);
			String couldHavePrefix = list.get(i+1);
			if(couldHavePrefix.length() >= potentialPrefix.length()){
				pNum= couldHavePrefix.substring(0,potentialPrefix.length());
				if(pNum.equals(potentialPrefix))
					return false;				
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		try{
			new PhoneList().init();
		}catch(Exception E){
			System.out.println(E.getMessage());
		}
		
	}
	

}