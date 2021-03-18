package com.myapp.oops.isp;

public class WorkContract implements ExportableJson,ExportablePdf,ExportableText{

	private String content;
	
	
	
	public WorkContract(String content) {
		this.content = content;
	}

	@Override
	public String toTxt() {
		// TODO Auto-generated method stub
		return this.content;
	}

	@Override
	public byte[] toPdf() {
		// TODO Auto-generated method stub
		return content.getBytes();
	}

	@Override
	public String toJson() {
		// TODO Auto-generated method stub
		return "{'content':'"+this.content+"'}";
	}

}
