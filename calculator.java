package calcdemo;

public class calculator {
	calservice service;
	
	public calculator(calservice service) {
		this.service = service;
	}
	
	public int perform(int i , int j) {
		return service.add(i,j)*i;
	}

}
