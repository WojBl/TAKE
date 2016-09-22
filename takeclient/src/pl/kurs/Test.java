package pl.kurs;

public class Test {
	public static void main(String[] args) {
		String serverUrl = "http://localhost:8080/take/komis";
		try{
			String url = serverUrl+"/create";
			String message = "<car id=\"0\"><make>Fiat</make><model>Brava</model><regNum>SH12345</regNum><price>1000</price></car>";
			System.out.println("DOPOST "+url );
			String txt = HttpHelper.doPost(url,message);
			System.out.println("-----------------------");
			System.out.println(txt);
			System.out.println("-----------------------");

			
			url = serverUrl+"/get";
			System.out.println("DOGET "+url );
			txt = HttpHelper.doGet(url);
			System.out.println("-----------------------");
			System.out.println(txt);
			System.out.println("-----------------------");
		} catch (Exception e) {e.printStackTrace();}
	}
}
