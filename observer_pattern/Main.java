package observer_pattern;

public class Main {
	public static void main(String[] args) {
		Topic twitter = new Topic();
		Observer obj1 = new TopicSubscriber("계정1", twitter);
		Observer obj2 = new TopicSubscriber("계정2", twitter);
		Observer obj3 = new TopicSubscriber("계정3", twitter);

		twitter.register(obj1);
		twitter.register(obj2);
		twitter.register(obj3);

		twitter.postMessage("오늘의 토픽을 구경해보세요!");
	}
}
