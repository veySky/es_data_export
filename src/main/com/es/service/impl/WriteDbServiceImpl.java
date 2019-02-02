/**
 * 
 */
package com.es.service.impl;
import java.util.List;
import com.alibaba.fastjson.JSONObject;
import com.es.dao.DbDao;
import com.es.dao.impl.DbDaoImpl;
import com.es.service.IWriteDbService;
/**   
* Copyright: Copyright (c) 2018 Montnets
* 
* @ClassName: DataToFileServiceImpl.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: es
* @date: 2018年11月17日 下午5:13:01 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年11月17日     es          v1.0.0               修改原因
*/
public class WriteDbServiceImpl implements IWriteDbService{
	private DbDao dao;
	
	public WriteDbServiceImpl() {
		dao = new DbDaoImpl();
	}
	@Override
	public  void write2Db(List<JSONObject> list) throws Exception {
		try {
			dao.insert(list);
		} catch (Exception e) {
			throw e;
		}
	}

}
