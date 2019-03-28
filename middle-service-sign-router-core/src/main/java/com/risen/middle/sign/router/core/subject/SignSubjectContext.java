package com.risen.middle.sign.router.core.subject;

import com.risen.middle.sign.router.core.session.SignSession;

import java.util.Map;

/**
 * 签约主体上下文
 *
 * @author mengxr
 * @since 1.0
 */
public interface SignSubjectContext extends Map<String, Object> {
    /**
     * 签约主体
     *
     * @return
     */
    SignSubject getSubject();

    /**
     * 设置签约主体
     *
     * @param signSubject
     */
    void setSubject(SignSubject signSubject);

    /**
     * 获取签约Session
     *
     * @return
     */
    SignSession getSignSession();

    /**
     * 设置签约Session
     *
     * @param signSession
     */
    void setSignSession(SignSession signSession);
}
