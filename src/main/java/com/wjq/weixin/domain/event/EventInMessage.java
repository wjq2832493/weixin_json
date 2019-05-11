package com.wjq.weixin.domain.event;
import com.wjq.weixin.domain.InMessage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventInMessage extends InMessage {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("Event")
	private String event;
	@JsonProperty("EventKey")
	private String eventKey;

	public EventInMessage() {
		super("event");
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getEventKey() {
		return eventKey;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}
}
