package com.taotao.portal.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taotao.common.utils.ExceptionUtil;
import com.taotao.portal.pojo.CartItem;
import com.taotao.portal.pojo.Order;
import com.taotao.portal.service.CartService;
import com.taotao.portal.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private CartService cartService;
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/order-cart")
	public String showOrderCart(HttpServletRequest request,HttpServletResponse response,Model model){
		//取购物车商品列表
		List<CartItem> list = cartService.getCartItemList(request, response);
		//传递给页面
		model.addAttribute("cartList",list);
		return "order-cart";
	}
	
	@RequestMapping("/create")
	public String createOrder(Order order,Model model){
		try {
			String orderId = orderService.createOrder(order);
			//获取商品的id
			model.addAttribute("orderId",orderId);
			//获取商品的支付信息
			model.addAttribute("payment", order.getPayment());
			//三天后格式化日期为年月日的格式
			model.addAttribute("date", new DateTime().plusDays(3).toString("yyyy-MM-dd"));
			//返回支付成功的页面
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", "创建订单出错。请稍后重试！");
			return "error/exception";
		}
	}
}