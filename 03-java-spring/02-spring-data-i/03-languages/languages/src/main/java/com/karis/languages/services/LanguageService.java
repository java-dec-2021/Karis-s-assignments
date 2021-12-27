package com.karis.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.karis.languages.models.Language;
import com.karis.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository lRepo; 
	
	public LanguageService(LanguageRepository repo) {
		this.lRepo = repo;
	}
	
	//Find All Languages 
	 public List<Language> allLanguages() {
		 return this.lRepo.findAll();
		 
	 }
	 //Get one Language
	 public Language oneLanguage(Long id) {
		 return this.lRepo.findById(id).orElse(null);
		 
	 }
	 //Create One Language 
	 public Language createLanguage(Language newLang) {
		 return this.lRepo.save(newLang);
	 }
	 
	 //Update Language
	 public Language updateLanguage(Language updatedLang) {
		 return this.lRepo.save(updatedLang);
	 }
	 
	 //Delete 
	 public void deleteLanguage(Long id) {
		 this.lRepo.deleteById(id);
	 }
}
 