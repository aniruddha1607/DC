import java.util.Scanner;
import java.awt.*; 
class loadBalancer{
	static void printLoad(int processes, int servers){
		int each = processes/servers;
		int extra = processes%servers;
		int total = 0;
		for(int i = 1; i<=servers; i++){
			if(extra-->0){
				total = each+1;
			}else{
				total = each;
			}
			System.out.println("Servers " + "A"+i + " has " + total + " processes");
		} 
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Servers & Processes:");
		int servers = sc.nextInt();
		int processes = sc.nextInt();

		while(true){
			printLoad(processes, servers);
			System.out.println("1. Add servers\n2. Remove servers\n3. Add processes\n4. Remove processes\n5. Exit");
			switch(sc.nextInt()){
				case 1:
					System.out.println("How many more servers do you want to add?");
					servers=servers + sc.nextInt();
					break;
				case 2:
					System.out.println("How many servers do you want to remove?");
					servers-=sc.nextInt();
					break;
				case 3:
					System.out.println("How many more processes do you want to add?");
					processes+=sc.nextInt();
					break;
				case 4:
					System.out.println("How many processes do you want to remove?");
					processes-=sc.nextInt();
					break;
				case 5:
					return;
			}
		}
	}
}