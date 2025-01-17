package com.didichuxing.datachannel.arius.admin.biz.metrics;

import com.didichuxing.datachannel.arius.admin.client.bean.common.Result;
import com.didichuxing.datachannel.arius.admin.client.bean.dto.metrics.*;
import com.didichuxing.datachannel.arius.admin.client.bean.vo.metrics.gateway.*;
import com.didichuxing.datachannel.arius.admin.client.bean.vo.metrics.linechart.VariousLineChartMetricsVO;

import java.util.List;

/**
 * Created by fitz on 2021-08-11
 *
 *  网关看板业务类
 */
public interface GatewayMetricsManager {

    /**
     * 获取gateway不同组的指标项
     */
    Result<List<String>> getGatewayMetricsEnums(String group);

    /**
     * 获取某个appId下的dslMd5列表
     */
    Result<List<String>> getDslMd5List(Integer appId, Long startTime, Long endTime);

    /**
     * 获取gateway全局维度指标信息
     */
    Result<List<GatewayOverviewMetricsVO>> getGatewayOverviewMetrics(GatewayOverviewDTO dto);

    /**
     * 获取gateway节点维度指标信息
     */
    Result<List<VariousLineChartMetricsVO>> getGatewayNodeMetrics(GatewayNodeDTO dto, Integer appId);

    /**
     * 获取gateway索引维度指标信息
     */
    Result<List<VariousLineChartMetricsVO>> getGatewayIndexMetrics(GatewayIndexDTO dto, Integer appId);

    /**
     * 获取gateway项目纬度指标信息
     */
    Result<List<VariousLineChartMetricsVO>> getGatewayAppMetrics(GatewayAppDTO dto);

    /**
     * 获取gatewayDSL模版查询指标信息
     */
    Result<List<VariousLineChartMetricsVO>> getGatewayDslMetrics(GatewayDslDTO dto, Integer appId);

}
