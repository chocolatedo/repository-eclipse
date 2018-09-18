package com.eastict.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eastict.common.myexception.IdException;

import com.eastict.entity.GroupEntity.Results;
import com.eastict.service.UserService;
import com.tt.entity.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 鏌ユ壘鎵�鏈�
	 * 
	 * @return
	 */
	@GetMapping("/findAll")
	public List<User> findAll() {
		return userService.selectAll();
		
	}

	/**
	 * 鏌ユ壘涓�涓�
	 * 
	 * @return
	 */
	@GetMapping("/findOne/{id}")
	public Results findOne(@PathVariable("id") Integer id) {

		User user;
		Results results = new Results();
		try {
			user = userService.findOne(id);
			results.setSuccess(true);
			results.setObj(user);
			return results;
		} catch (IdException e) {
			log.error(e.getMessage());
			results.setSuccess(false);
			results.setMessage(e.getMessage());
			return results;
		}
	}

	/**
	 * 鍒犻櫎涓�涓�
	 * 
	 * @return
	 */
	@GetMapping("/delOne/{id}")
	public Map<String, Boolean> delOne(@PathVariable("id") Integer id) {

		Map<String, Boolean> resultMap = new HashMap<>();

		try {

			userService.delOne(id);
			resultMap.put("success", true);
			return resultMap;

		} catch (Exception e) {

			resultMap.put("success", false);
			e.printStackTrace();
			return resultMap;
		}
	}

	/**
	 * 鏂板涓�涓�
	 * 
	 * @return
	 */
	@PostMapping(value = "/addOne")
	public Map<String, Boolean> addOne(@RequestBody User user) {

		Map<String, Boolean> resultMap = new HashMap<>();

		try {

			userService.addOne(user);
			resultMap.put("success", true);
			return resultMap;

		} catch (Exception e) {

			resultMap.put("success", false);
			e.printStackTrace();
			return resultMap;
		}
	}

	/**
	 * 鏇存敼
	 * 
	 * @return
	 */
	@PostMapping(value = "/updateOne")
	public Map<String, Boolean> updateOne(@RequestBody User user) {

		Map<String, Boolean> resultMap = new HashMap<>();

		try {

			userService.updateOne(user);
			resultMap.put("success", true);
			return resultMap;

		} catch (Exception e) {

			resultMap.put("success", false);
			e.printStackTrace();
			return resultMap;
		}
	}
}
