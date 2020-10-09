package com.xjc.weather.service;

import com.xjc.weather.vo.WeatherResponse;

/**
 * Description: 天气获取服务接口
 *
 * @author: Administrator
 * Date: 2020-10-09
 */
public interface WeatherDataService {

    /**
     * 通过城市名获取天气信息
     *
     * @param city 城市名
     * @return 天气信息
     */
    WeatherResponse getDataByCityName(String city);

    /**
     * 通过城市ID获取天气信息
     *
     * @param cityId 城市ID
     * @return 天气信息
     */
    WeatherResponse getDataByCityId(String cityId);

}
