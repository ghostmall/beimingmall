package com.taotao.portal.service;

import com.taotao.portal.pojo.ItemInfo;

/**
 * 前端页面单个商品详细信息的实现
 * @author Admin
 *
 */
public interface ItemService {
	
	//根据商品id查询商品信息
	ItemInfo getItemById(Long itemId);
	//根据商品的id返回商品描述信息
	String getItemDescById(Long itemId);
	//根据商品的id返回商品的规格参数
	String getItemParam(Long itemId);
	
}
