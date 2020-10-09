package com.xjc.weather.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Description: 五天内天气信息
 *
 * @author: Administrator
 * Date: 2020-10-09
 */
@Data
public class Forecast implements Serializable {

    private static final long serialVersionUID = 446878620083209883L;

    /**
     * 时间
     */
    private String date;

    /**
     * 最高温度
     */
    private String high;

    /**
     * 风力
     */
    private String fengli;

    /**
     * 最低温度
     */
    private String low;

    /**
     * 风向
     */
    private String fengxiang;

    /**
     * 天气类型
     */
    private String type;

}
