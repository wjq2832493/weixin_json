package com.wjq.weixin.service;

import com.wjq.weixin.domain.InMessage;
import com.wjq.weixin.domain.OutMessage;

public interface MessageService {
	OutMessage  onMessage(InMessage msg);

}
