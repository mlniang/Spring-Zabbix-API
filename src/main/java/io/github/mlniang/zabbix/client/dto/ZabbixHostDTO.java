package io.github.mlniang.zabbix.client.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.mlniang.zabbix.client.model.host.HostInventoryProperty;
import io.github.mlniang.zabbix.client.model.host.ZabbixHost;
import io.github.mlniang.zabbix.client.model.host.ZabbixHostGroup;
import io.github.mlniang.zabbix.client.model.host.ZabbixHostInterface;
import io.github.mlniang.zabbix.client.model.template.Template;
import io.github.mlniang.zabbix.client.model.GlobalMacro;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * Zabbix Host DTO used as parameter in method host.create and returned in host.get.
 * @see <a href="https://www.zabbix.com/documentation/4.0/manual/api/reference/host/create">method host.create</a>
 *
 * @author Mamadou Lamine NIANG
 **/
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Builder
public class ZabbixHostDTO extends ZabbixHost {

    private List<ZabbixHostGroup> groups;
    private List<ZabbixHostInterface> interfaces;
    @JsonProperty("templates")
    @JsonAlias("parentTemplates")
    private List<Template> templates;
    private List<GlobalMacro> macros;
    private Map<HostInventoryProperty, String> inventory;
    @JsonProperty("templates_clear")
    private List<Template> templatesToClear;
}
