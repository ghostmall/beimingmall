package com.taotao.search.service;

import com.taotao.search.pojo.SearchResult;
/**
 * 接收查询条件
 * @author Admin
 *
 */
public interface SearchService {
	
	SearchResult search(String queryString, int page, int rows) throws Exception;
}
