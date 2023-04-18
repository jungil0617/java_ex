//Ex6

public class Box {
	int height;
	int width;
	int depth;
	
	public int Vol() {
		return height * width * depth; 
	}

	public static void main(String[] args) {
		Box Obj = new Box();
			
		Obj.height = 20;
		Obj.width = 40;
		Obj.depth = 30;
		
		int vol = Obj.Vol();
		
		System.out.println("Obj의 부피는 "+ vol);
		
	}

}
