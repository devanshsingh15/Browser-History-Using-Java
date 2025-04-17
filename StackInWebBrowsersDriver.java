package java_trn.exercise;

public class StackInWebBrowsersDriver {
	public static void main(String[] args) {
		
		StackInWebBrowsers stack = new StackInWebBrowsers();
		
		stack.visit("google.com");
		stack.visit("Instagram.com");
		stack.visit("facebook.com");
		stack.visit("chatGPT.com");
		
		stack.back();
		stack.back();
		stack.forward();
		stack.back();
		stack.visit("w3schools.com");
		stack.back();
		stack.forward();
		
	}
}
