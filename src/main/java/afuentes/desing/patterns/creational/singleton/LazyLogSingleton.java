package afuentes.desing.patterns.creational.singleton;

public class LazyLogSingleton {

	private static LazyLogSingleton lazyLog;
	
	private String logInfo;
	
	private LazyLogSingleton() {}
	
	public static LazyLogSingleton getInstance() {
		if(lazyLog == null) {
			lazyLog = new LazyLogSingleton();
		}
		return lazyLog;
	}
	
	public void addLog(String log) {
		this.logInfo += log + "\n";
	}
	
	public void printLog() {
		System.out.println(this.logInfo);
	}
	
}
