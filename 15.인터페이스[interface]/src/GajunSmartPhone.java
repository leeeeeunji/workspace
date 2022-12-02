
public class GajunSmartPhone implements GajunOnOff, GajunVolume{

	@Override
	public void VolumeUp() {
		System.out.println("GajunSmartPhone.volumeUp()");
		
	}

	@Override
	public void VolumeDown() {
		System.out.println("GajunSmartPhone.VolumeDown()");
		
	}

	@Override
	public void on() {
		System.out.println("GajunSmartPhone.on()");
		
	}

	@Override
	public void off() {
		System.out.println("GajunSmartPhone.off()");
		
	}

}
