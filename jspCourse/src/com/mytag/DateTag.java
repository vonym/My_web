package com.mytag;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;

public class DateTag extends TagSupport {
	 public int doStartTag() throws JspTagException{
         return EVAL_BODY_INCLUDE;
     }
     public int doEndTag() throws JspTagException{
     try{
    	 	 Date date = new Date();
    	 	 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY年MM月dd日 hh:mm:ss");
    	 	 String simpleDate = simpleDateFormat.format(date);   
    	 	 pageContext.getOut().write(simpleDate);
         } catch (IOException ex){
              throw new JspTagException("Error!");
         }
     return EVAL_PAGE;
     }
}
