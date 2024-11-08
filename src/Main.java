
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CicloThread t1 = new CicloThread(15, "proceso 1");
		CicloThread t2 = new CicloThread(10, "proceso 2");
		CicloThread t3 = new CicloThread(20, "proceso 3");
		CicloThread t4 = new CicloThread(5, "proceso 4");
		t1.start();t2.start();t3.start();t4.start();
	}//main

}//clas
