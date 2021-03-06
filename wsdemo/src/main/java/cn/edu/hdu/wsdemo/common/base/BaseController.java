/*
 * File Name: BaseController.java
 * Copyright: Copyright 2016-2016 hdu All Rights Reserved.

 * Description:
 * Author: Pi Chen
 * Create Date: 2016年5月23日

 * Modifier: Pi Chen
 * Modify Date: 2016年5月23日
 * Bugzilla Id:
 * Modify Content:
 */
package cn.edu.hdu.wsdemo.common.base;

import cn.edu.hdu.wsdemo.common.log.Logger;

import com.google.gson.Gson;

/**
 *
 * @author Pi Chen
 * @version wsdemo V1.0.0, 2016年5月23日
 * @see
 * @since wsdemo V1.0.0
 */

public class BaseController
{
    public static final String FAILD = "faild";
    public static final String SUCCESS = "success";
    /**
     * gson是线程安全的
     */
    protected static final Gson gson = new Gson();
    /**
     * 日志
     */
    protected Logger logger = Logger.getLogger(this.getClass());

}
