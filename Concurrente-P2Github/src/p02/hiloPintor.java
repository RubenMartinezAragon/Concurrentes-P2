package p02;

public class hiloPintor implements Runnable{

	private final Board board;
	private final Billiards graphics;
	
	public hiloPintor(Board b, Billiards g ) {
		board=b;
		graphics=g;
		
	}
	@Override
	public void run() {
		while(true) {
			try {
				board.paint(graphics.getGraphics());
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				break;
			}
		}
		
	}

}
