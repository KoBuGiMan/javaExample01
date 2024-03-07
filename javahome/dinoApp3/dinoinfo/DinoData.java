package dinoinfo;

import java.util.ArrayList;
import java.util.List;

public class DinoData<T> implements DinoInterface<T> {
	
	protected List<T> dinoAll;

	public DinoData() {
		dinoAll = new ArrayList<>();
	}

	public List<T> getDinoAll() {
		return dinoAll;
	}

	public void setDinoAll(List<T> dinoAll) {
		this.dinoAll = dinoAll;
	}

	@Override
	public void add(T dino) {
		getDinoAll().add(dino);
		
	}
}