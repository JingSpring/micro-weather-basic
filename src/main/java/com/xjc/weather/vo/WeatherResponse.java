package com.xjc.weather.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Description: 天气信息返回响应
 *
 * @author: Administrator
 * Date: 2020-10-09
 */
@Data
public class WeatherResponse implements Serializable {
    private static final long serialVersionUID = -4305507385257565738L;

    /**
     * 天气数据
     */
    private WeatherData data;

    /**
     * 状态
     */
    private int status;

    /**
     * 描述
     */
    private String desc;
}
