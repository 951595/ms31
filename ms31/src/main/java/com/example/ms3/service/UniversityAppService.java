package com.example.ms3.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ms3.entity.UniversityApp;
import com.example.ms3.repository.UniversityAppRepository;
@Service
public class UniversityAppService {
	@Autowired
	private UniversityAppRepository repository;
	
	public UniversityApp saveUniversityApp(UniversityApp ua) {
		return repository.save(ua);
	}
	
	public List<UniversityApp> saveUniversityApps(List<UniversityApp> uas) {
		return repository.saveAll(uas);
	}
	
	public List<UniversityApp> getUniversityApps(){
		return repository.findAll();
	}
	
	public UniversityApp getUniversityAppById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public UniversityApp getUniversityAppByName(String name) {
		return repository.findByName(name);
		
	}
	
	public String deleteUniversityApp(int id) {
		repository.deleteById(id);
		return "university is removed"+id;
	}
	public UniversityApp updateUniversityApp(UniversityApp k) {
		UniversityApp es=repository.findById(k.getId()).orElse(null);
		es.setName(k.getName());
		es.setTotalClg(k.getTotalClg());
		return repository.save(es);
	}

}
