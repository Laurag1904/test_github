package stringstringBuilder;

public class HTMLaufbauen {

	public static String htmlElement(String tag, String body) {
        if (tag == null || tag.isEmpty()) {
            return body;
        } else {
            return "<" + tag + ">" + body + "</" + tag + ">";
        }

	}
	
	
	
	public static void main(String[] args) {
		
		

	}

}
