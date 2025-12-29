package oop;



class Stopwatch{
		private boolean running = false;
		private int ticks = 0;
		
		public void start() {
			running = true;
		}
		
		public void stop() {
			running = false;
		}
		
		public void reset() {
			ticks = 0;
		}
		public int elapsed() {
			return ticks;
		}
		public boolean isRunning(){
			return running;
		}
		public void incrementTicks() {
			ticks+=1;
		}
}
public class Day4_Q1 {	
	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();
		
		sw.start();
		for(int i = 0; i<500;i++) {
			if(sw.isRunning()) {
				sw.incrementTicks();
			}
		}
		sw.stop();
		System.out.println(sw.elapsed());
		sw.reset();
		System.out.println(sw.elapsed());
	}
}

