/**
 * 
 */
package com.es.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

/**   
* Copyright: Copyright (c) 2018 Montnets
* 
* @ClassName: IDataToFileService.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: es
* @date: 2018年11月17日 下午5:11:43 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年11月17日     es          v1.0.0               修改原因
*/
public interface IWriteDbService {
		
	public void write2Db(List<JSONObject> list) throws Exception;
}
