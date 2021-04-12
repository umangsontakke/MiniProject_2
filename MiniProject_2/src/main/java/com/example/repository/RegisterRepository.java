package com.example.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.UnlockAccount;
import com.example.entity.User;

public interface RegisterRepository extends JpaRepository<User, Serializable> {

	User findById(int id);

	@Query("SELECT u FROM User u WHERE u.email=?1")
	User findbyEmail(String email);

	@Query("SELECT * FROM Country")
	Map<Integer, String> getAllCountries();

	@Query("SELECT s FROM State WHERE s.country_id=?1")
	Map<Integer, String> getAllstates(Integer country_id);

	@Query("SELECT c FROM City WHERE c.state_id=?1")
	Map<Integer, String> getAllcity(Integer state_id);

	@Modifying
	@Query("insert into UnlockAccount values (?1 , ?2)")
	UnlockAccount unlockAccount(UnlockAccount unlockaccount);

}
