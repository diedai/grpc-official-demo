package io.grpc.examples.helloworld;

public class Task1 implements Runnable {

	@Override
	public void run() {
		HelloWorldClient client = new HelloWorldClient("localhost", 50051);
		try {
			/* Access a service running on the local machine on port 50051 */
			String user = "world";

			client.greet(user);

			System.out.println(Thread.currentThread().getId());
		} finally {
			try {
				client.shutdown();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
