import java.util.Timer;
import java.util.TimerTask;

public class basketTimer {

	private Timer timer;
	private BasketFrameTest basketFrame;
	
	public basketTimer(BasketFrameTest basketFrame) {
		this.basketFrame = basketFrame;
	}
	
	public void start() {
		timer = new Timer();
		timer.schedule(new ClearBasketTask(), 180000);
	}
	
	public void stop() {
		if(timer != null) {
			timer.cancel();
			timer = null;
		}
	}
	
	//clears basket and calls "stop"
	private class ClearBasketTask extends TimerTask {
		@Override
		public void run() {
			basketFrame.clearBasket();
			stop();
		}
	}
	
}
