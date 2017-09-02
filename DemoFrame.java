import java.awt.*;
class DemoFrame{
	Frame F;
	Button b;
	Label l;
	Textfield tf;
	DemoFrame(String s){
		f=new Frame(s);
		l=new Label("Enter the number");
		l.setBounds(40,40,80,20);
		f.add(l);
		tf=new Textfield();
		tf.setBounds(150,40,50,20);
		f.add(tf);
		b=new Button("Ok");
		b.setBounds(40,100,50,50);
		f.add(b);
		f.setlayout(null);
		f.setsize(400,400);
		f.setvisible(true);
	}
	public static void main(String[] args){
		new DemoFrame("FF");
	}
}