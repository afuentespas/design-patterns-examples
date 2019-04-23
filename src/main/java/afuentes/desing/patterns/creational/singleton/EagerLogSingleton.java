package afuentes.desing.patterns.creational.singleton;

public class EagerLogSingleton {
	
	private static final EagerLogSingleton eagerLog = new EagerLogSingleton();
	
	private String logInfo;
	
	private EagerLogSingleton () {}
	
	public static EagerLogSingleton getInstance() {
		return eagerLog;
	}
	
	public void addLog(String log) {
		this.logInfo += log + "\n";
	}
	
	public void printLog() {
		System.out.println(this.logInfo);
	}

}
