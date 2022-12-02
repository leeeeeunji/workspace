
public class GajunAudio implements GajunOnOff, GajunVolume {

	@Override
	public void VolumeUp() {
		System.out.println("GajunAudio.volumeUp()");

	}

	@Override
	public void VolumeDown() {
		System.out.println("GajunAudio.VolumeDown()");

	}

	@Override
	public void on() {
		System.out.println("GajunAudio.on()");

	}

	@Override
	public void off() {
		System.out.println("GajunAudio.off()");

	}

}
