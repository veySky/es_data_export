/**
 * 
 */
package com.es.init;

import java.util.concurrent.Executors;

import com.es.config.Config;
import com.es.constant.Pool;
import com.es.thread.ThreadPoolManager;

/**   
* Copyright: Copyright (c) 2018 Montnets
* 
* @ClassName: ThreadPool.java
* @Description: 线程池初始化
*
* @version: v1.0.0
* @author: es
* @date: 2018年12月7日 下午2:20:13 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年12月7日     es          v1.0.0               修改原因
*/
public class InitThreadPool {
	
	public static void init() throws Exception{
		   //拉取数据线程池
		   Pool.EXECPool = Executors.newFixedThreadPool(Config.COMMON_CONFIG.getThread_size()); 
		   //写文件线程池
		   if(Config.FILE_CONFIG.isEnabled()){
			   Pool.WRITE_FILE_POOL = ThreadPoolManager.newInstance(1).build();
		   }
 	       //写DB线程池
		   if(Config.JDBC_CONFIG.isEnabled()){
			   Pool.WRITE_DB_POOL = ThreadPoolManager.newInstance(Config.JDBC_CONFIG.getJdbc_write_thread_size()).build();
		   }
	}
}
