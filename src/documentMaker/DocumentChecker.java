package documentMaker;

public class DocumentChecker {
	private final String m_name ;
	
	DocumentChecker(String name){
		m_name = name;
	}
	
	public void check() {
		System.out.println(m_name + "が資料を確認しました");
	}

}
