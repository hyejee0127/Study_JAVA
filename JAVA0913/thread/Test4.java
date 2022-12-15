package thread;

public class Test4 {

	public static void main(String[] args) {
		// main() 메서드 (main 쓰레드) 내에서
		// "메시지 송신", "메시지 수신", "파일 전송" 작업을 동시에 100번씩 수행
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<100000; i++) {
					System.out.println("메세지 송신");
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<100000; i++) {
					System.out.println("메세지 수신");
				}
			}
		}).start();
		
		new Thread(() -> {
			for(int i=0; i<100000; i++) {
				System.out.println("파일 전송");
			}
		}).start();
		
		
	}

}
