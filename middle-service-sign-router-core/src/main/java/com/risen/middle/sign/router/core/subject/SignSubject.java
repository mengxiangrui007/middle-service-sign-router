package com.risen.middle.sign.router.core.subject;

import com.risen.middle.sign.router.core.session.SignSession;

/**
 * 签约主体
 *
 * @author mengxr
 * @since 1.0
 */
public interface SignSubject {
    /**
     * 获取当前Session
     *
     * @return
     */
    SignSession getSignSession();
}
