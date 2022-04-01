package net.developia.spring05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AutocompleteController {

	@GetMapping("autocomplete")
	public String autocomplete() {
		return "autocomplete";
	}
}
