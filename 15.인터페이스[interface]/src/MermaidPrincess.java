
public class MermaidPrincess implements Mermaid, Princess{

	@Override
	public void speak() {
		System.out.println("Ptincess.speak() 의 구현[재정의]");
		
	}

	@Override
	public void think() {
		System.out.println("Ptincess.think() 의 구현[재정의]");
		
	}

	@Override
	public void fastSwim() {
		System.out.println("Mermaid.fastSwim() 의 구현[재정의]");
		
	}

	@Override
	public void liveSea() {
		System.out.println("Mermaid.liveSea() 의 구현[재정의]");
		
	}

	
}
