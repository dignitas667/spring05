package net.developia.spring05.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.log4j.Log4j;
import net.developia.spring05.dto.ItemDTO;
import net.developia.spring05.service.AutocompleteService;

@Log4j
@Controller
public class AutocompleteController {

	@Autowired
	private AutocompleteService autocompleteService;
	
	@GetMapping("autocomplete")
	public String autocomplete() {
		return "autocomplete";
	}
	
	@GetMapping(value="autocomplete_data", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<ItemDTO> autocomplete_data(@RequestParam String term) throws Exception {
		log.info("term : " + term);
		List<ItemDTO> list = autocompleteService.getWords(term);
		return list;
	}
}
