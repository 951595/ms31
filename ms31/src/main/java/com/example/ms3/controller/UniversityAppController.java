package com.example.ms3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms3.entity.UniversityApp;
import com.example.ms3.service.UniversityAppService;
@RestController
public class UniversityAppController {
    @Autowired
	private UniversityAppService service;
    @PostMapping("/addUniversityApp")
    public UniversityApp addUniversityApp(@RequestBody UniversityApp k) {
    	return service.saveUniversityApp(k);
    }
    @PostMapping("/addUniversityApps")
    public List<UniversityApp> addUniversityApps(@RequestBody List<UniversityApp> m){
    	return service .saveUniversityApps(m);
    }
    @GetMapping("/UniversityApps")
    public List<UniversityApp> findAllUniversityApps(){
    	return service.getUniversityApps();
    }
    @GetMapping("/UniversityApp/{id}")
    public UniversityApp findUniversityAppById(@PathVariable int id) {
    	return service.getUniversityAppById(id);
    }
    @GetMapping("/UniversityApp/{name}")
    public UniversityApp findUniversityAppByName(@PathVariable String name) {
    	return service.getUniversityAppByName(name);
    }
    @PostMapping("/update")
    public UniversityApp updateUniversityApp(@RequestBody UniversityApp k) {
    	return service.updateUniversityApp(k);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteUniversityApp(@PathVariable int id) {
    	return service.deleteUniversityApp(id);
    }
}
