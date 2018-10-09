

//This class creates a "Vocalist" Object


public class Vocalist extends Performer {
	
	private int volume;
	private String key;
	
	Vocalist(int id, String k ){
		
		super(id,k);
		this.key = k;
	}
	
	Vocalist(int id, String k, int vol ){
		
		super(id, k);
		this.key = k;
		this.volume = vol;
	}
	
	
	public int getVolume() {
		
		return this.volume;
		
	}
	
	public String getKey() {
		
		return this.key;
	}
	
	
	public void announce(){		
		System.out.println("I sing in the key of – " + key + " - " + this.getUnionID() );
	}
	
	public void announceWithKeyAndVolume(){		
		System.out.println("I sing in the key of – " + key + "- at the volume "+ volume + " - " + this.getUnionID());
	}
	
	
	
	

}
