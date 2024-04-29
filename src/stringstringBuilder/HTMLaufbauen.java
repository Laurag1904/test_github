package stringstringBuilder;

public class HTMLaufbauen {

	public static String htmlElement(String tag, String body) {
        if (tag == null || tag.isEmpty()) {
            return body;
        } else {
            return "<" + tag + ">" + body + "</" + tag + ">";
        }

	}
	
	public static String strong(String str) {
		return htmlElement("strong", str);
	}
	
	public static String emphasized(String str) {
		return htmlElement("em", str);
	}
	
	
	public static void main(String[] args) {
		
		String  html=htmlElement("Strong","strong is bold");
        System.out.println(html);
        
        String strong = strong(emphasized("strong+emphasized"));
        System.out.println(strong);
		
        String no = htmlElement("", "no");
        System.out.println(no);

	}

}
