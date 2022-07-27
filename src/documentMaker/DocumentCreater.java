package documentMaker;

public class DocumentCreater {
	final String m_name;
	
	DocumentCreater(String name) {
		m_name = name;
	}
	
	public void create() {
		System.out.println(m_name + "が資料を作成しました");
	}
	
	public void submit() {
		System.out.println(m_name + "が資料を提出しました");
	}
	

}
