package com.xjc.weather.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Description: 昨天天气信息
 *
 * @author: Administrator
 * Date: 2020-10-09
 */
@Data
public class Yesterday implements Serializable {

    private static final long serialVersionUID = -3351701823235150604L;

    /**
     * 时间
     */
    private String date;

    /**
     * 最高温度
     */
    private String high;

    /**
     * 风向
     */
    private String fx;

    /**
     * 最低温度
     */
    private String low;

    /**
     * 风力
     */
    private String fl;

    /**
     * 天气类型
     */
    private String type;
}
