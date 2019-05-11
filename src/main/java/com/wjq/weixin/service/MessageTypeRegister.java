package com.wjq.weixin.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.wjq.weixin.domain.InMessage;
import com.wjq.weixin.domain.event.EventInMessage;
import com.wjq.weixin.domain.text.TextInMessage;

/**
 * 负责注册消息类型，把MsgType和对应的class关联起来
 * @author WJQ
 *
 */
public class MessageTypeRegister {
	//使用一个Map来记录类型和类之间的关系映射
	private static  Map<String,Class<? extends InMessage>> typeMap=new ConcurrentHashMap<>();
	static {
		//使用静态代码块之间完成类型和类之间的映射
		register("text", TextInMessage.class);
		register("event", EventInMessage.class);
	}
	public static void  register(String type,Class<? extends InMessage> cla) {
		/**
		 * @param type 消息类型 比如是text location event
		 * @param cla   消息类型对应的类对象（class）
		 */
		typeMap.put(type, cla); 
	}
	//返回类型对应的类对象	
	public static Class<? extends InMessage> getClass(String type){
		return typeMap.get(type);
	}
}
