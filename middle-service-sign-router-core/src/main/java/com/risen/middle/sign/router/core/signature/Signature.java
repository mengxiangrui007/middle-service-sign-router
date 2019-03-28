package com.risen.middle.sign.router.core.signature;

/**
 * 签章
 *
 * @author mengxr
 * @since 1.0
 */
public interface Signature {
    /**
     * 签章类型
     *
     * @return
     */
    int getType();

    /**
     * 签章名称
     *
     * @return
     */
    int getName();

    /**
     * 签章状态
     *
     * @return
     */
    int getStatus();

    /**
     * 获取签章Base64图片信息
     *
     * @return
     */
    String getSignatureBase64();

    /**
     * 最后修改时间
     *
     * @return
     */
    long lastModified();
}
