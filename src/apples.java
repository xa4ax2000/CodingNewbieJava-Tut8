import java.util.Scanner;

public class apples {
	public static void main(String argsp[]){
		
		Scanner scannerObject = new Scanner(System.in);
		//tuna tunaObject = new tuna();// need to move this down
		
		System.out.println("Type in the name of your first girlfriend: ");
		String name = scannerObject.nextLine();
		tuna tunaObject = new tuna(name);
		//tunaObject.setName(name);// not necessary anymore
		tunaObject.saying();
		
		scannerObject.close();
	}
}
