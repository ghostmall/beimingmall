package com.taotao.search.dao;

import org.apache.solr.client.solrj.SolrQuery;

import com.taotao.search.pojo.SearchResult;
/**
 *商品搜索页面的接口dao
 * @author Admin
 *
 */
public interface SearchDao {

	SearchResult search(SolrQuery query) throws Exception;
}
