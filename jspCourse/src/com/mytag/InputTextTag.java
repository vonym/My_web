package com.mytag;

import java.io.IOException;

import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class InputTextTag extends TagSupport {

	private String value;
	private String name;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int doStartTag() throws JspTagException{
        return EVAL_BODY_INCLUDE;
    }
    public int doEndTag() throws JspTagException{
    try{
    	
   	    JspWriter out = pageContext.getOut();
   	    out.print("<input type='text' name='"+name+"' value='"+value+"' width=200 height=50 />");
 
        } catch (IOException ex){
             throw new JspTagException("Error!");
        }
    return EVAL_PAGE;
    }
}
