package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsProcPendingProdEntity;

public interface TmsProcPendingProdEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_proc_pending_prod
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    int deleteByPrimaryKey(Long codId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_proc_pending_prod
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    int insert(TmsProcPendingProdEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_proc_pending_prod
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    int insertSelective(TmsProcPendingProdEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_proc_pending_prod
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    TmsProcPendingProdEntity selectByPrimaryKey(Long codId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_proc_pending_prod
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    int updateByPrimaryKeySelective(TmsProcPendingProdEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_proc_pending_prod
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    int updateByPrimaryKey(TmsProcPendingProdEntity record);
}