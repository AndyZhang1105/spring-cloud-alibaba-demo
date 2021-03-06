package com.zz.hello.consumer.ribbon.config.ribbon_same_cluster;

import com.alibaba.nacos.api.naming.pojo.Instance;
import com.alibaba.nacos.client.naming.core.Balancer;

import java.util.List;

// Balancer来自于com.alibaba.nacos.client.naming.core.Balancer，也就是Nacos Client自带的基于权重的负载均衡算法。
public class ExtendBalancer extends Balancer {
    /**
     * 根据权重，随机选择实例
     *
     * @param instances 实例列表
     * @return 选择的实例
     */
    public static Instance getHostByRandomWeight2(List<Instance> instances) {
        return getHostByRandomWeight(instances);
    }
}