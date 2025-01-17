package com.didichuxing.datachannel.arius.admin.biz.workorder.content.clusterOpRestart;

import com.didichuxing.datachannel.arius.admin.biz.workorder.content.ClusterOpBaseContent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClusterOpRestartContent extends ClusterOpBaseContent {
    /**
     * 物理集群id
     */
    private Long   phyClusterId;

    /**
     * 角色顺序，如：airepo-masternode,airepo-clientnode,airepo-datanode
     */
    private String roleOrder;
}
