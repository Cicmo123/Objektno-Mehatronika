package geometry;

public abstract class Shake {
	
	protected boolean selected;
	
	public Shake() {
		
	}
	
	public Shake(boolean selected) {
		this.selected= selected;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	

}
