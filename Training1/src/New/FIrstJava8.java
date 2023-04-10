package New;

interface Addition{
	public int add(int a,int b);
	
}
public class FIrstJava8 implements Addition {
	
public static void main(String[] args)
{
	FIrstJava8 f = new FIrstJava8();	
	System.out.println(f.add(4, 5));
}

@Override
public int add(int a, int b) {
	// TODO Auto-generated method stub
	return a+b;
}
}
