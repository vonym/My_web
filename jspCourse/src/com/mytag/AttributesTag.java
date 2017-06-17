package com.mytag;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class AttributesTag extends TagSupport {

	 private String field;
	 private Integer count;
	
	
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public int doStartTag() throws JspTagException{
		
		 try {
			JspWriter out = pageContext.getOut();
			out.print(field);
			out.print(count);
			count = count+1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
         return EVAL_BODY_INCLUDE;
         
     }
     public int doEndTag() throws JspTagException{
     try{

    	    JspWriter out = pageContext.getOut();
			out.print(field);
			out.print(count);
         } catch (IOException ex){
              throw new JspTagException("Error!");
         }
     return EVAL_PAGE;
     }
}
