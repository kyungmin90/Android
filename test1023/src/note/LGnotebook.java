package note;

public abstract class LGnotebook implements Bluetooth, Wifi {

	public abstract void camera();
	
	@Override
	public void on() {
		System.out.println("전원을 켠다");
	}

	@Override
	public void off() {
		System.out.println("전원을 끈다");
	}

	@Override
	public void wConnect() {
		System.out.println("와이파이를 연결한다");
	}

	@Override
	public void wDisconnect() {
		System.out.println("와이파이를 해제한다");
	}

	@Override
	public void bConnect() {
		System.out.println("블루투스를 연결한다");
	}

	@Override
	public void bDisconnect() {
		System.out.println("블루투스를 해제한다");
	}

}
