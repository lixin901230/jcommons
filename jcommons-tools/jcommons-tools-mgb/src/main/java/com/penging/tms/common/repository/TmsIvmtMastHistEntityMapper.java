package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsIvmtMastHistEntity;

public interface TmsIvmtMastHistEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_ivmt_mast_hist
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    int deleteByPrimaryKey(Long codId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_ivmt_mast_hist
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    int insert(TmsIvmtMastHistEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_ivmt_mast_hist
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    int insertSelective(TmsIvmtMastHistEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_ivmt_mast_hist
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    TmsIvmtMastHistEntity selectByPrimaryKey(Long codId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_ivmt_mast_hist
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    int updateByPrimaryKeySelective(TmsIvmtMastHistEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_ivmt_mast_hist
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    int updateByPrimaryKey(TmsIvmtMastHistEntity record);
}