class Test {
	int a; 
	public int b; // public access
	private int c; // private access

void setc(int i) { 
	c = i;
	}
int getc() { 
	return c;
	}
}
class AccessTest {
public static void main(String args[]) {
	Test ob = new Test();
	ob.a = 10;
	ob.b = 20;

	ob.setc(100);
	System.out.println("a, b, and c: " + ob.a + " "+ " " + ob.getc());
	}
}