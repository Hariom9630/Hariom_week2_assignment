    class Demo
	{ 
	int x;
	int y;
	   Demo(int x,int y)
	   {
	   this.x=x;
	   this.y=y;
	   } 
	 void  show()
	 {
	    System.out.println(x+y);
	 } 
	 
	 void  show(int x,int y,int z)
	 {
	    System.out.println(x+y+z);
	 }
	 public static void main (String ar[])
	 { 
	 Demo d=new Demo(10,20);
	 d.show();
	 d.show(20,30,40);
	 
	 }
	 
	}