package com.jspiders.threadexamples;

public class ConsumerThread implements Runnable {
	Resource ref;
	@Override
	public void run() {
		synchronized (ref) {
			ref.play();
		}
	}
	ConsumerThread(Resource ref){
		this.ref = ref;
	}

}
