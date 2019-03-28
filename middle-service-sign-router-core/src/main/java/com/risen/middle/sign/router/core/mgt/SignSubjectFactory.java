package com.risen.middle.sign.router.core.mgt;

import com.risen.middle.sign.router.core.subject.SignSubject;
import com.risen.middle.sign.router.core.subject.SignSubjectContext;

/**
 * 签约主体工厂类
 *
 * @author mengxr
 * @since 1.0
 */
public interface SignSubjectFactory {
    /**
     * 创建签约主体
     *
     * @param signSubjectContext
     * @return
     */
    SignSubject createSignSubject(SignSubjectContext signSubjectContext);
}
