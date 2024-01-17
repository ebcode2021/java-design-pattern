package observer_pattern;

public interface Subject {
	public void register(Observer observer);
	public void unregister(Observer observer);
	public void notifyObservers();
	public Object getUpdate(Observer observer);
}
