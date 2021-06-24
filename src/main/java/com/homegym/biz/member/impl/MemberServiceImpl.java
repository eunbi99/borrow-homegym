package com.homegym.biz.member.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homegym.biz.member.MemberService;
import com.homegym.biz.member.MemberVO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDAO memberDAO;

	@Override
	public void memberJoin(MemberVO member) throws Exception {
		memberDAO.memberJoin(member);
	}
	
	@Override
	public void insertMemberAuth(MemberVO member) throws Exception {
		memberDAO.insertMemberAuth(member);
	}
}
