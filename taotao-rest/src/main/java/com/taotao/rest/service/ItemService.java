package com.taotao.rest.service;

import com.taotao.common.pojo.TaotaoResult;

public interface ItemService {
	
	TaotaoResult getItemBaseInfo(long itemId);//查询商品的基本信息
	TaotaoResult getItemDesc(long itemId);//查询商品描述信息
	TaotaoResult getItemParam(long itemId);//查询商品规格参数
}
