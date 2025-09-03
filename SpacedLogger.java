package week05;

public class SpacedLogger implements Logger {
	
	private String spaceOutString(String s) {
		StringBuilder spacedString = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			spacedString = spacedString.append(c);
			spacedString = spacedString.append(' ');
		}
		return spacedString.toString();
	}

	@Override
	public void log(String message) {
		System.out.println(spaceOutString(message));
		System.out.println();
	}

	@Override
	public void error(String message) {
		System.out.println("ERROR: " + spaceOutString(message));
		System.out.println();
	}
	
}
