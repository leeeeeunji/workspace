
public class GajunGumsa {
	/*
	 * private GajunTV[] gajuns;
	 * private GajunAudio[] gajuns;
	 * private GajunSmartPhone[] gajuns; => 복잡
	 */
	private GajunOnOff[] gajuns;
	
	public GajunGumsa() {
		
	}
	
	public GajunGumsa (GajunOnOff[] gajuns) {
		this.gajuns = gajuns;
	}

	public GajunOnOff[] getGajuns() {
		return gajuns;
	}

	public void setGajuns(GajunOnOff[] gajuns) {
		this.gajuns = gajuns;
	}
	
	
	public void gumsa() {
		for(GajunOnOff tempGajun : gajuns) {
			tempGajun.on();
			GajunVolume tempGajun2 = (GajunVolume)tempGajun;
			tempGajun2.VolumeUp();
			tempGajun2.VolumeDown();
			tempGajun.off();
			System.out.println("------검사 끝, 출고------");
		}
	}
	
	
	
}
