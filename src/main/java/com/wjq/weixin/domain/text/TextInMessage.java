package com.wjq.weixin.domain.text;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wjq.weixin.domain.InMessage;

@XmlRootElement(name="xml")//指定xml的根元素名称
@XmlAccessorType(XmlAccessType.FIELD)//指定属性的访问方式为字段
public class TextInMessage extends InMessage {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@XmlElement(name="Content")
@JsonProperty("Content")
	private String  content;
	public TextInMessage(String type) {
		super("text");
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
