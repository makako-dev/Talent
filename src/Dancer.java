

//This class creates a 'Dancer' object

public class Dancer extends Performer {
	
	private String style;
	
	Dancer(int id, String cont, String sty ){
		
		super(id, cont);
		this.style = sty;
		
	}
	
	
	public String getStyle() {
		
		return this.style;
	}
	
	
	public void announce(){		
		
		System.out.println(style + " - " + this.getUnionID() + " - " + this.getContestant());
	}
	

}
