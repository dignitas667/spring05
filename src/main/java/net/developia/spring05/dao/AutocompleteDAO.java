package net.developia.spring05.dao;

import java.util.List;

import net.developia.spring05.dto.ItemDTO;

public interface AutocompleteDAO {

	List<ItemDTO> getWords(String term) throws Exception;

}
