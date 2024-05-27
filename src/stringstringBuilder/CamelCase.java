package stringstringBuilder;

public class CamelCase {
	
	
	public static String camelCaseSplitter(String camel) {
		
		if (camel == null || camel.isEmpty()) {
            return camel;
        }
		
		StringBuilder result = new StringBuilder();
        result.append(camel.charAt(0));
		return camel;
		
	}

	public static void main(String[] args) {
		
		String camel = camelCaseSplitter("List");
		System.out.println(camel);

		String camel2 = camelCaseSplitter("NumberOfElements");
		System.out.println(camel2);

	}

}
