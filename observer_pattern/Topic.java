package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject{

	private List<Observer> observers;
	private String message;

	public Topic() {
		this.observers = new ArrayList<>();
		this.message = "";
	}

	@Override
	public void register(Observer observer) {
		if (!observers.contains(observer))
			observers.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		if (!observers.contains(observer))
			observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		this.observers.forEach(Observer::update);
	}

	@Override
	public Object getUpdate(Observer observer) {
		return this.message;
	}

	public void postMessage(String message) {
		System.out.println("Message sended to Topic : " + message);
		this.message = message;
		notifyObservers();
	}
	
}
