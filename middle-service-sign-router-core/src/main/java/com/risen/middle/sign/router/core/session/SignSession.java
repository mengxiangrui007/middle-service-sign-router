package com.risen.middle.sign.router.core.session;

import java.util.Date;

/**
 * 签约 session
 *
 * @author mengxr
 * @since 1.0
 */
public interface SignSession {
    /**
     * 合同编码
     *
     * @return
     */
    String getContractCode();

    /**
     * 开始时间
     *
     * @return
     */
    Date getStartTime();

    /**
     * 结束时间
     *
     * @return
     */
    Date getLastAccess();

    /**
     * 设置属性值
     *
     * @param key
     * @param value
     * @throws SignSessionInvalidException
     */
    void setAttribute(Object key, Object value) throws SignSessionInvalidException;

    /**
     * 得到属性值
     *
     * @param key
     * @return
     * @throws SignSessionInvalidException
     */
    Object getAttribute(Object key) throws SignSessionInvalidException;

    /**
     * 删除属性值
     *
     * @param key
     * @return
     * @throws SignSessionInvalidException
     */
    Object removeAttribute(Object key) throws SignSessionInvalidException;
}
