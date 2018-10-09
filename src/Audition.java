

//This class allows creating performers, dancers, and vocalists objects.

public class Audition {
	
			
	public Performer addPerfomer(int id) {
		
		Performer performer = new Performer(id,"Performer");			
		return performer;
	}
	
	public Dancer addDancer(int id, String style) {
		
		Dancer dancer = new Dancer(id,"Dancer",style);			
		return dancer;
	}
	
	public Vocalist addVocalist(int id, String key) {
		
		Vocalist vocalist = new Vocalist(id, key);
		return vocalist;
	}
	
	public Vocalist addVocalist(int id, String key, int volume) {
		
		Vocalist vocalist = new Vocalist(id, key,volume);
		return vocalist;
	}
}
