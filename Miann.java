class Mew{

void new1(int a){
	System.out.println(a);
}
void new1(int a,int b){
	System.out.println(a +" "+ b);
}
void new1(int a,int b,int c){
		System.out.println(a + " " + b + " "+ c);
}

}

class Mainn{
public static void main(String args[]){
	Mew n = new Mew();
	n.new1(20,10,60);
	n.new1(20,10);
	n.new1(20);
}
}

	