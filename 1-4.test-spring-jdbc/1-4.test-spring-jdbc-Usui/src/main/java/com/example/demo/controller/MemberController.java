package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberRepository repository;

	@RequestMapping("")
	public String index() {
		List<Member> list = repository.findAll();
		System.out.println(list);
		Member id2 = repository.load(2);
		System.out.println(id2);

		Member member = new Member();
		member.setName("臼井");
		member.setAge(2);
		member.setDep_id(44);
		repository.save(member);
		
		return "member";
	}

	
}
