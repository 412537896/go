package com.ansteel.dhtmlx.jsonclass;
/**
 * 创 建 人：gugu
 * 创建日期：2015-06-08
 * 修 改 人：
 * 修改日 期：
 * 描   述：json数据映射到ui。  
 */
public class DataUiStrategy implements UiStrategy {

	@Override
	public Object get(Object result) {
		Data data = new Data();
		data.setData(result);
		return data;
	}
}
