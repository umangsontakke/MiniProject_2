package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.UnlockAccount;
import com.example.entity.User;
import com.example.service.RegisterService;

@RestController
public class UserController {

	/*
	 * @Autowired private RegisterRepository registerrepository;
	 */

	@Autowired
	private RegisterService registerservice;

	// create user
	@PostMapping("/register")
	public String createUser(@RequestBody User user) {
		String save = registerservice.save(user);

		return save;
	}

	@PostMapping("/checklogin")
	public String checkLogin(String email, String password) {
		String checkLoginres = registerservice.checkLogin(email, password);
		return checkLoginres;

	}

	@GetMapping("/getcountries")
	public Map<Integer, String> getCountries() {
		Map<Integer, String> countrysres = registerservice.getCountrys();
		return countrysres;
	}

	@PostMapping("/getstates")
	public Map<Integer, String> getStates(Integer country_id) {

		Map<Integer, String> statesres = registerservice.getStates(country_id);
		return statesres;
	}

	@PostMapping("/getcitys")
	public Map<Integer, String> getCityes(Integer state_id) {

		Map<Integer, String> citysres = registerservice.getCitys(state_id);
		return citysres;
	}

	@GetMapping("/validateemail")
	public User getUserbyEmail(String email) {
		User userbyEmailres = registerservice.getUserbyEmail(email);
		return userbyEmailres;
	}

	@PostMapping("/unlockaccount")
	public String unlockAccount(UnlockAccount unlockaccount) {

		String unlockAccountres = registerservice.unlockAccount(unlockaccount);

		return unlockAccountres;
	}

	@PostMapping("/forgotpassword")
	public boolean forgotPassword(String email) {
		boolean forgotpasswordres = registerservice.forgotpassword(email);

		return forgotpasswordres;
	}
	/*
	 * @GetMapping("/login") public String login(@PathParam("email") String
	 * email, @PathParam("password") String password) {
	 * 
	 * List<User> findAll = registerrepository.findAll();
	 * 
	 * for(users:findAll) {
	 * 
	 * }
	 * 
	 * return lastName; }
	 */
}