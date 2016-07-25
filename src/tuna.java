
public class tuna {
	private String girlName;
	public tuna(String name){
		girlName = name;
	}
	public void setName(String name){
		girlName = name;
	} // now we do not need to call this if we just directly add name to object
	public String getName(){
		return girlName;
	}
	public void saying(){
		System.out.printf("Your first girlfriend was %s", getName());
	}
}
