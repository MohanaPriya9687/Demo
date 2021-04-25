package Demo1;

public class My extends ra implements inter1,inter2{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inter1 i=new My();
		
		My i=new My();
		i.eat();
		i.mat();
		i.rat();
		i.lat();
		i.fat();
		i.mth();

	}

	@Override
	public void lat() {
		System.out.println("lat method from inter2");
		
	}

	@Override
	public void fat() {
		System.out.println("fatmethod from inter2");
		
	}

	@Override
	public void eat() {
		
		System.out.println("eatmethod from inter1 " +a);
	}

	@Override
	public void mat() {
		System.out.println("Matmethod from inter1 " +n);
		
	}

	@Override
	public void rat() {
		System.out.println("ratmethod from inter1");
		
	}

}

interface  inter1{
	int a=9;
	String n="hare";
public void eat();
public void mat();
public void rat();

}
interface inter2{
	public void lat();
	public void fat();
}

class ra{
	public void mth(){
		System.out.println("ee");
	}
}


