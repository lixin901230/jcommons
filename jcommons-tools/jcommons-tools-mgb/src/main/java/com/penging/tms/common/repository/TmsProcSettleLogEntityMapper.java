package com.penging.tms.common.repository;

import com.penging.tms.common.entity.TmsProcSettleLogEntity;

public interface TmsProcSettleLogEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_proc_settle_log
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    int deleteByPrimaryKey(Long codId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_proc_settle_log
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    int insert(TmsProcSettleLogEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_proc_settle_log
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    int insertSelective(TmsProcSettleLogEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_proc_settle_log
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    TmsProcSettleLogEntity selectByPrimaryKey(Long codId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_proc_settle_log
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    int updateByPrimaryKeySelective(TmsProcSettleLogEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tms_proc_settle_log
     *
     * @mbggenerated Fri Jan 29 18:19:53 CST 2016
     */
    int updateByPrimaryKey(TmsProcSettleLogEntity record);
}