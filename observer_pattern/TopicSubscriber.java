package observer_pattern;

public class TopicSubscriber implements Observer{

	private String	name;
	private Subject	topic;
	
	public TopicSubscriber(String name, Subject topic) {
		this.name = name;
		this.topic = topic;
	}

	@Override
	public void update() {
		String message = (String)topic.getUpdate(this);
		System.out.println(name + " :: got message >> " + message);
	}
	
}
