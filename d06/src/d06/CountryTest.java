package d06;

public class CountryTest {
	public static void main(String[] args) {
		Country c = new Country();
		c.setPeople(10000);
		c.setArea(100);
		c.setLanguage("외계어");
		c.setName("깐따삐아별");
		
		System.out.println(c);
	}	
}
