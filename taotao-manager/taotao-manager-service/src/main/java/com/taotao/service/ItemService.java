package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
		/**根据id返回TbItem对象*/
		TbItem getItemById(long itemId);
		/**返回商品页的第几页，该页的条数：page、rows*/
		EUDataGridResult getItemList(int page, int rows);
		/**创建事务描述*/
		TaotaoResult createItem(TbItem item, String desc, String itemParam) throws Exception;
}
