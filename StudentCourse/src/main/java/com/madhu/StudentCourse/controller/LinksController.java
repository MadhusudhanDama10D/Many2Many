//package com.madhu.StudentCourse.controller;
//
//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.madhu.StudentCourse.model.Links;
//import com.madhu.StudentCourse.service.Service;
//
//@RestController
//@RequestMapping(name = "/links")
//public class LinksController {
//	
//	@Autowired
//	Service service;
//	@PostMapping("/save")
//	public Links insert(@RequestBody Links links)
//	{
//		return service.insert(links);
//		
//	}
//	@GetMapping("/get")
//	public ArrayList<Links> linking()
//	{
//		return service.get();
//		
//	}
//
//}
