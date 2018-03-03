package p02;


public class hiloBall implements Runnable {
	
	private final Ball bola;
	
	public hiloBall(Ball bola) {
		this.bola=bola;
		
	}

	@Override
	public void run() {
		while(true) {
			System.out.println("muevo");
			bola.move();
			try {
					Thread.sleep(10);
			} catch (InterruptedException e) {
					break;
			}
		}
		
	}

}
