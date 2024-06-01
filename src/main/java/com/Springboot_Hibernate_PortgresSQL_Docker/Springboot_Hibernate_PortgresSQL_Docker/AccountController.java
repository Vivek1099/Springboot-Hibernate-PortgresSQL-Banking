package com.Springboot_Hibernate_PortgresSQL_Docker.Springboot_Hibernate_PortgresSQL_Docker;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController 
{
	@Autowired
	AccountRepository arepo;
	
	@RequestMapping("/test")
	public String test()
	{
		return "This is Banking application demo test";
	}
	
	@RequestMapping("/createaccount")
	public String create(@RequestBody Account acc)
	{
		arepo.save(acc);
		return "Account data saved";
	}
	
	@RequestMapping("/displayall")
	public List<Account> displayall()
	{
		return arepo.findAll();
	}
	
	@RequestMapping("/byid/{id}")
	public Optional<Account> byid(@PathVariable long id)
	{
		return arepo.findById(id);
	}
	
	@RequestMapping("/delbyid/{id}")
	public String delbyid(@PathVariable long id)
	{
		arepo.deleteById(id);
		return "Data deleted";
	}
	
	@RequestMapping("/deleteall")
	public String deleteall()
	{
		arepo.deleteAll();
		return "All Data deleted";
	}
}
