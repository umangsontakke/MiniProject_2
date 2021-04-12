package com.example.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.UnlockAccount;
import com.example.entity.User;
import com.example.repository.RegisterRepository;

@Service
public class RegisterserviceImpl implements RegisterService {

	@Autowired
	private RegisterRepository registerrepository;

	@Override
	public String save(User user) {
		// TODO Auto-generated method stub
		User saveresp = registerrepository.save(user);
		if (saveresp != null) {
			return "Registration Successful";
		}
		return "Registration Failed";
	}

	@Override
	public String checkLogin(String email, String password) {
		// TODO Auto-generated method stub
		User one = registerrepository.getOne(password);
		User one2 = registerrepository.getOne(password);
		if (email == one.toString() && password == one2.toString()) {
			return "login successfull, Wellcome to Ashok IT";
		}

		return "login failed";
	}

	@Override
	public Map<Integer, String> getCountrys() {
		// TODO Auto-generated method stub
		return registerrepository.getAllCountries();
	}

	@Override
	public Map<Integer, String> getStates(Integer country_id) {
		// TODO Auto-generated method stub
		return registerrepository.getAllstates(country_id);
	}

	@Override
	public Map<Integer, String> getCitys(Integer state_id) {
		// TODO Auto-generated method stub
		return registerrepository.getAllcity(state_id);
	}

	@Override
	public User getUserbyEmail(String Email) {
		// TODO Auto-generated method stub
		User email = registerrepository.findbyEmail(Email);
		/*
		 * if(email!=null) { return "email already exists"; }
		 */
		return email;
	}

	@Override
	public String unlockAccount(UnlockAccount unlockaccount) {
		// TODO Auto-generated method stub
		UnlockAccount unlockAccountres = registerrepository.unlockAccount(unlockaccount);
		if (unlockAccountres != null) {
			return "unlock account successfull";
		}
		return "failed to unlock Account";
	}

	@Override
	public boolean forgotpassword(String email) {
		// TODO Auto-generated method stub
		User oneres = registerrepository.getOne(email);
		if (oneres != null) {
			return true;
		}
		return false;
	}

}
