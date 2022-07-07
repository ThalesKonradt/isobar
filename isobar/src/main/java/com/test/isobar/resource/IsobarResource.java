package com.test.isobar.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.isobar.dao.NetworkDAO;



@RestController
@RequestMapping("/api/v1")
public class IsobarResource {
	
	@Autowired
	NetworkDAO dao;

	@GetMapping(value = "/get", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<String> getHps(@RequestParam String url) throws Exception{
		return ResponseEntity.ok().body(dao.request(url));
	}
	
}
