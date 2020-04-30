package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MyUser;

//@RestController
@Controller
public class UserController {

	@Autowired
	private JdbcUserDetailsManager jdbcUserDetailsManager;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@RequestMapping("/index")
	public String index() {

		return "Index";
	}

	@RequestMapping("/register")
	public String getForm(Model model) {
		model.addAttribute("user", new MyUser());
		return "register";
	}

	
	@PostMapping("/register")
	public String register(MyUser user) {
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(user.getRoles().toUpperCase()));
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		User myUser = new User(user.getUserName(), encodedPassword, authorities);
		jdbcUserDetailsManager.createUser(myUser);
		return "Success";
	}
	
	  
	/*
	 * @PostMapping(value = "/register-user") public String regiter(@RequestBody
	 * MyUser myUser) { List<GrantedAuthority> authorities = new ArrayList<>();
	 * authorities.add(new SimpleGrantedAuthority(myUser.getRoles())); String
	 * encodededPassword = passwordEncoder.encode(myUser.getPassword()); User user =
	 * new User(myUser.getUserName(), encodededPassword, authorities);
	 * jdbcUserDetailsManager.createUser(user); return "User created :)"; }
	 */
	/*
	 * @GetMapping(value = "/admin") public String admin() { return
	 * "<h3>Welcome Admin :)</h3>"; }
	 * 
	 * @GetMapping(value = "/user") public String user() { return
	 * "<h3>Hello User :)</h3>"; }
	 * 
	 * 
	 * 
	 * @GetMapping(value = "/") public String welcome() { return
	 * "<h3>Welcome :)</h3>";
	 * 
	 * }
	 */
	 
}