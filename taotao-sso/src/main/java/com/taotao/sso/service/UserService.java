package com.taotao.sso.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbUser;

public interface UserService {
	//核对用户将要注册的信息
	TaotaoResult checkData(String content,Integer type);
	//返回用户的信息
	TaotaoResult createUser(TbUser user);
	//返回用户登录信息
	TaotaoResult userLogin(String username,String password,HttpServletRequest request,HttpServletResponse response);
	
	TaotaoResult getUserByToken(String token);
	
}
