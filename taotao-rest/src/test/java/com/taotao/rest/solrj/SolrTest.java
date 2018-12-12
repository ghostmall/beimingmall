package com.taotao.rest.solrj;

import java.util.Iterator;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;
/**
 * solr客户端修改solr的文档 和新增文档
 * 把数据库中的数据导入到索引库中去
 * @author Admin
 *
 */
public class SolrTest {

	@Test
	public void addDocument() throws Exception{
		//创建一个连接
		SolrServer solrServer = new HttpSolrServer("http://192.168.194.133:8080/solr");
		//创建一个文档对象
		SolrInputDocument document = new SolrInputDocument();
		document.addField("id", "test001");
		document.addField("item_title", "测试商品2");//改变value的值则是修改成功
		document.addField("item_price", 54321);
		//把文档对象写入索引库
		solrServer.add(document);
		//提交
		solrServer.commit();
	}
	
	@Test
	public void deleteDocument() throws Exception {
		//创建一个连接
				SolrServer solrServer = new HttpSolrServer("http://192.168.194.133:8080/solr");
				//solrServer.deleteById("test001"); //根据id删除
				solrServer.deleteByQuery("*:*");//全部删除
				solrServer.commit();
	}
	@Test
	public void queryDocument() throws Exception{
		SolrServer solrServer = new HttpSolrServer("http://192.168.194.133:8080/solr");
		//创建一个查询对象
		SolrQuery query = new SolrQuery();
		//设置查询条件
		query.setQuery("*:*");
		query.setStart(20);//默认从0开始查询，当前设置成从第20条开始查询
		query.setRows(50);//默认一页10条数据，当前设置成每页50条数据
		//执行查询
		QueryResponse response = solrServer.query(query);
		//取查询结果，SolrDocumentList的父类是ArrayList
		SolrDocumentList solrDocumentList= response.getResults();
		for (SolrDocument solrDocument : solrDocumentList) {
			System.out.println(solrDocument.get("id"));
			System.out.println(solrDocument.get("item_title"));
			System.out.println(solrDocument.get("item_price"));
			System.out.println(solrDocument.get("item_image"));
		}
	}
	
	
}
