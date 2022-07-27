package documentMaker;

public class DocumentMaker {
	private DocumentMaker() {
	}
	
	public static void createDocument() {
		final DocumentCreater creater = new DocumentCreater("tanaka");
		creater.create();
		creater.submit();
		
		final DocumentChecker checker = new DocumentChecker("sasaki");
		checker.check();
	}

}
