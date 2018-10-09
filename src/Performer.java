
//This class creates a 'Performer' object

public class Performer {
	
	protected final int unionID;
	protected String contestant;
	
	Performer (int id, String cont){
		this.unionID = id;
		this.contestant = cont;
		
	}
		
	public int getUnionID() {
		
		return this.unionID;
	}
	
	public String getContestant() {
		
		return this.contestant;
	}
	
	public void announce(){
		
		System.out.println(unionID + " - " + contestant);
	}
	
}
