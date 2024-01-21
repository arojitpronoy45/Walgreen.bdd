package unitTest;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class DataStructureMapTest {
		@Test
		public void mapTest() {
			Map<String, String> map = new HashMap<>();
			map.put("url", "walgreen.com");
			map.put("pageloadWait", "15");
			map.put("explicitWait", "15");
			
			
			System.out.println(map.get("explicitWait"));
		}
}
