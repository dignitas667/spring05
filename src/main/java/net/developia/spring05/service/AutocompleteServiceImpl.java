package net.developia.spring05.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.developia.spring05.dao.AutocompleteDAO;

@Service
public class AutocompleteServiceImpl implements AutocompleteService {
	@Autowired
	private AutocompleteDAO autocompleteDAO;
	
}
