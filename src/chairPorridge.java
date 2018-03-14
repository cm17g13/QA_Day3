
public class chairPorridge {

	private int chairWeight;
	private int porridgeTemp;
	private int index;
	
	public chairPorridge(int chairWeight, int porridgeTemp) {
		this.chairWeight = chairWeight;
		this.porridgeTemp = porridgeTemp;
		//this.index = -1;
	}
	
	public int getChair() {
		return this.chairWeight;
	}
	
	public int getPorridge() {
		return this.porridgeTemp;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public int getIndex() {
		return this.index;
	}
}
