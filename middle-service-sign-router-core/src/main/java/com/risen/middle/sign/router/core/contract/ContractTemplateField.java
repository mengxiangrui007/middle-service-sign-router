package com.risen.middle.sign.router.core.contract;

/**
 * 合同模版字段
 *
 * @author mengxr
 * @since 1.0
 */
public interface ContractTemplateField {
    /**
     * 获取模版
     *
     * @return
     */
    ContractTemplate getContractTemplate();

    /**
     * 合同模版字段
     *
     * @return
     */
    ContractField[] getContractFields();
}
