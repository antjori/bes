package pt.devhub.antjori.vuespring.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for managing the "Hello" requests.
 */
@RestController
public class HelloController {

	@RequestMapping(value = "/api/hello")
	public String hello() {
		return "hello";
	}
}
