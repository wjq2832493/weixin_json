package com.wjq.weixin.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;

// 接收到信息
public abstract class InMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("ToUserName")
	private String toUserName;

	@JsonProperty("FromUserName")
	private String fromUserName;

	@JsonProperty("CreateTime")
	private Long createTime;

	@JsonProperty("MsgType")
	private String msgType;

	@JsonProperty("MsgId")
	private Long msgId;

	// 提供一个有参的构造器，要求必须有消息类型传入
	protected InMessage(String type) {
		this.msgType = type;
	}

	public InMessage() {
		
	}
	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public Long getMsgId() {
		return msgId;
	}

	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}
}
