package com.risen.middle.sign.router.core.subject.support;

import com.risen.middle.sign.router.core.session.SignSession;
import com.risen.middle.sign.router.core.subject.SignSubject;
import com.risen.middle.sign.router.core.subject.SignSubjectContext;

/**
 * @author mengxr
 * @since 1.0
 */
public class DefaultSignSubjectContext extends MapContext implements SignSubjectContext {

    private static final String SUBJECT = DefaultSignSubjectContext.class.getName() + ".SIGN_SUBJECT";

    private static final String SESSION = DefaultSignSubjectContext.class.getName() + ".SESSION";

    /**
     * 签约主体
     *
     * @return
     */
    @Override
    public SignSubject getSubject() {
        return getTypedValue(SUBJECT, SignSubject.class);

    }

    /**
     * 设置签约主体
     *
     * @param signSubject
     */
    @Override
    public void setSubject(SignSubject signSubject) {
        nullSafePut(SUBJECT, signSubject);
    }


    /**
     * 获取签约Session
     *
     * @return
     */
    @Override
    public SignSession getSignSession() {
        return getTypedValue(SESSION, SignSession.class);

    }

    /**
     * 设置签约Session
     *
     * @param signSession
     */
    @Override
    public void setSignSession(SignSession signSession) {
        nullSafePut(SESSION, signSession);
    }
}
