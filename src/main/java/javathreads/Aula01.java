package javathreads;

public class Aula01 {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Thread roda por trás dos panos, chega primeiro no "Sysout checou ao fim"
		 */
		new Thread() {
			public void run() {
				
				for (int pos = 0; pos < 10; pos++) {
					
					System.out.println("Executando rotina 1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
		}.start();
		
		/*
		 * Thread 2, outra rotina
		 */
		new Thread() {
			public void run() {
				
				for (int pos = 0; pos < 10; pos++) {
					
					System.out.println("Executando rotina 2");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
		}.start();
		
		
		System.out.println("CHEGOU AO FIM DO CÓDIGO!");
	}
	
}
