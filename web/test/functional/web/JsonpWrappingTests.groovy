package web

import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware

public class JsonpWrappingTests extends functionaltestplugin.FunctionalTestCase{

	@org.junit.Test
	public void testRetrievingATextResourceShouldNotWrapJson() {
		get("/home/text")
		
		assertStatus 200
		assertContentType "" //"application/text"
		assertContentContains "Hello!"
	}
}
