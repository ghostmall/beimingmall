package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.EUTreeNode;
import com.taotao.common.pojo.TaotaoResult;

public interface ContentCategoryService {

	//获取树节点的id值
	List<EUTreeNode> getCategoryList(long parentId);
	//根据父节点id插入一条数据
	TaotaoResult insertContentCategory(long parentId, String name);
	//根据id删除一条数据
	TaotaoResult deleteContentCategory(long parentId,long id);
	
}
