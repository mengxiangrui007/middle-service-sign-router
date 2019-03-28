package com.risen.middle.sign.router.core.contract;

import java.util.Date;

/**
 * 合同字段
 *
 * @author mengxr
 * @since 1.0
 */
public interface ContractField {
    /**
     * 获取合同字段名称
     *
     * @return
     */
    String getName();

    /**
     * 获取合同字段类型
     *
     * @return
     */
    String getType();
    /**
     * 最后修改时间
     *
     * @return
     */
    Date lastModified();
}
