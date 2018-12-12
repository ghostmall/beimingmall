package com.taotao.common.pojo;

import java.util.List;
/**
 * 查询商品列表并返回商品列表
 * @author Admin
 *
 */
public class EUDataGridResult {

	private long total;//总数据条数
	private List<?> rows;//页数
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	
}
