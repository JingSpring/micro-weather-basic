package com.xjc.weather.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xjc.weather.service.WeatherDataService;
import com.xjc.weather.vo.WeatherResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Description: 天气获取服务接口实现
 *
 * @author: Administrator
 * Date: 2020-10-09
 */
@Slf4j
@Service
public class WeatherDataServiceImpl implements WeatherDataService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 天气总链接
     */
    private static final String WEATHER_URL = "http://wthrcdn.etouch.cn/weather_mini?";

    /**
     * 通过城市名获取天气信息
     *
     * @param city 城市名
     * @return 天气信息
     */
    @Override
    public WeatherResponse getDataByCityName(String city) {
        String url = WEATHER_URL + "city=" + city;
        return this.doGetWeather(url);
    }

    /**
     * 通过城市ID获取天气信息
     *
     * @param cityId 城市ID
     * @return 天气信息
     */
    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        String url = WEATHER_URL + "citykey=" + cityId;
        return this.doGetWeather(url);
    }

    private WeatherResponse doGetWeather(String url) {
        ResponseEntity<String> stringResponseEntity = restTemplate.getForEntity(url, String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        WeatherResponse response = null;

        String strBody = null;

        if (stringResponseEntity.getStatusCodeValue() == 200) {
            strBody = stringResponseEntity.getBody();
        }

        try {
            response = objectMapper.readValue(strBody, WeatherResponse.class);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return response;
    }

}
