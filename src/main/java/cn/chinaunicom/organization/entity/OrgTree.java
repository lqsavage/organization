package cn.chinaunicom.organization.entity;

import java.util.List;

public class OrgTree {

	private String value;
	
	private String pid;
	
	private String title;
	
	private String key;
	
	private List<OrgTree> children;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public List<OrgTree> getChildren() {
		return children;
	}

	public void setChildren(List<OrgTree> children) {
		this.children = children;
	}

}
