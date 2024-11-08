import java.util.Random;

//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Thread.html

public class CicloThread extends Thread {
	private int max;
	private Random random;
	
	public CicloThread(int max, String name) {
		// TODO Auto-generated constructor stub
		this.max = max;
		this.setName(name);
		random =new Random();
	}//constructor
	
	@Override//anotacion sobreescribiendo
	public void run() {
		int cont=0;
		while(cont <this.max) {
			System.out.println(this.getName()+ ":" + cont++);
			try {
				Thread.sleep(random.nextInt(3000));//el tiempo limite de ejecucion.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//catch
		}
		System.out.println("FIN"+ this.getName());
	}

}//ciclo treed
