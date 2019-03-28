package com.risen.middle.sign.router.core.contract;

import java.util.Date;

/**
 * 合同模版
 *
 * @author mengxr
 * @since 1.0
 */
public interface ContractTemplate {
    /**
     * 模版名称
     *
     * @return
     */
    String getName();

    /**
     * 模版编码
     *
     * @return
     */
    String getCode();

    /**
     * 模版描述
     *
     * @return
     */
    String getDesc();

    /**
     * 最后修改时间
     *
     * @return
     */
    Date lastModified();
}
