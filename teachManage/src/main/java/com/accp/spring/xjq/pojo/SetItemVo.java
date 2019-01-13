package com.accp.spring.xjq.pojo;

import java.io.Serializable;
import java.util.List;

public class SetItemVo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int setId;
	private String setItem;
	private int setSort;
	private int count;
	private List<StuAttenceVo> stuAttences;
	
	
	public int getSetId() {
		return setId;
	}
	public void setSetId(int setId) {
		this.setId = setId;
	}
	public String getSetItem() {
		return setItem;
	}
	public void setSetItem(String setItem) {
		this.setItem = setItem;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<StuAttenceVo> getStuAttences() {
		return stuAttences;
	}
	public void setStuAttences(List<StuAttenceVo> stuAttences) {
		this.stuAttences = stuAttences;
	}
	public int getSetSort() {
		return setSort;
	}
	public void setSetSort(int setSort) {
		this.setSort = setSort;
	}
	@Override
	public String toString() {
		return "SetItemVo [setId=" + setId + ", setItem=" + setItem + ", setSort=" + setSort + ", count=" + count
				+ ", stuAttences=" + stuAttences + "]";
	}
	
	
	
	

}
