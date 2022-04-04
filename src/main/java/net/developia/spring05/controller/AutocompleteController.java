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
	public List<ItemDTO> autocomplete_data(@RequestParam String term) {
		log.info("term : " + term);
		List<ItemDTO> list = new ArrayList<>();
		list.add(new ItemDTO(1, "mysql","mysql은 가벼운 dbms","mysql은 oracle 소유"));
		list.add(new ItemDTO(2, "mysql2","mysql2은 가벼운 dbms","mysql2은 oracle 소유"));
		list.add(new ItemDTO(3, "mysql3","mysql3은 가벼운 dbms","mysql3은 oracle 소유"));
		list.add(new ItemDTO(4, "mysql4","mysql4은 가벼운 dbms","mysql4은 oracle 소유"));
		list.add(new ItemDTO(5, "mysql5","mysql5은 가벼운 dbms","mysql5은 oracle 소유"));
		return list;
	}
}
