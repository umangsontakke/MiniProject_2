package com.example.service;

import java.util.Map;

import com.example.entity.UnlockAccount;
import com.example.entity.User;

public interface RegisterService {

	public String save(User user);
	public String checkLogin(String email,String password);
	public Map<Integer,String> getCountrys();
	public Map<Integer,String> getStates(Integer country_id);
	public Map<Integer,String> getCitys(Integer state_id);
	public User getUserbyEmail(String Email);
	public String unlockAccount(UnlockAccount unlockaccount);
	public boolean forgotpassword(String email);
	

}

