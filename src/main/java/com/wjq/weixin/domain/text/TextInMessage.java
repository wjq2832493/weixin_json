package com.wjq.weixin.domain.text;
import com.wjq.weixin.domain.InMessage;

import com.fasterxml.jackson.annotation.JsonProperty;
public class TextInMessage extends InMessage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("Content")
	private String content;

	public TextInMessage() {
		super("text");
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
