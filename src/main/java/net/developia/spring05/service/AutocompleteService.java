package net.developia.spring05.service;

import java.util.List;

import net.developia.spring05.dto.ItemDTO;

public interface AutocompleteService {

	List<ItemDTO> getWords(String term) throws Exception;

}
