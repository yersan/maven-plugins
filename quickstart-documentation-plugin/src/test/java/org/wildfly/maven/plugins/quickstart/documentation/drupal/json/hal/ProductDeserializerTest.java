package org.wildfly.maven.plugins.quickstart.documentation.drupal.json.hal;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Jason Porter <jporter@redhat.com>
 *         Copyright 2017 Red Hat, Inc. and/or its affiliates.
 */
public class ProductDeserializerTest {
    @Test
    public void assertDeserializationWorks() throws IOException {
        String json = "{\"title\":\"Red Hat JBoss Enterprise Application Platform\",\"field_product_machine_name\":\"eap\",\"field_product_short_name\":\"JBoss EAP\",\"field_product_technology_group\":\"Accelerated Development And Management\",\"field_url_product_name\":\"eap\",\"uuid\":\"48a3f108-d582-4507-b168-89619ac708f7\",\"nid\":\"33895\"}";

        ObjectMapper mapper = new ObjectMapper();
        Product deserializedProduct = mapper.readValue(json, Product.class);

        Product manualProduct = new Product("33895", "48a3f108-d582-4507-b168-89619ac708f7", "eapn", "JBoss EAP");

        assertThat(manualProduct).isEqualTo(deserializedProduct);
    }

    @Test
    public void assertCanFindInAList() throws IOException {
        String json = "[{\"title\":\".NET Core for Red Hat Enterprise Linux\",\"field_product_machine_name\":\"dotnet\",\"field_product_short_name\":\".NET\",\"field_product_technology_group\":\"Runtimes\",\"field_url_product_name\":\"dotnet\",\"uuid\":\"bb331054-41b5-4013-9592-c28bf0c6c5c7\",\"nid\":\"33755\"},{\"title\":\"OpenJDK\",\"field_product_machine_name\":\"openjdk\",\"field_product_short_name\":\"OpenJDK\",\"field_product_technology_group\":\"Runtimes\",\"field_url_product_name\":\"openjdk\",\"uuid\":\"694a9db1-ad51-430d-8d9a-70c48427fdb1\",\"nid\":\"33965\"},{\"title\":\"Red Hat Application Migration Toolkit\",\"field_product_machine_name\":\"migrationtoolkit\",\"field_product_short_name\":\"RHAMT\",\"field_product_technology_group\":\"Developer Tools\",\"field_url_product_name\":\"rhamt\",\"uuid\":\"029cd35c-d77c-4037-8748-c9f355580c3c\",\"nid\":\"37135\"},{\"title\":\"Red Hat Application Migration Toolkit\",\"field_product_machine_name\":\"migrationtoolkit\",\"field_product_short_name\":\"RHAMT\",\"field_product_technology_group\":\"Developer Tools\",\"field_url_product_name\":\"rhamt\",\"uuid\":\"4b9ebb73-1020-4b7e-b01c-fbfd3de7bd4e\",\"nid\":\"37375\"},{\"title\":\"Red Hat Container Development Kit\",\"field_product_machine_name\":\"cdk\",\"field_product_short_name\":\"CDK\",\"field_product_technology_group\":\"Developer Tools\",\"field_url_product_name\":\"cdk\",\"uuid\":\"cdc6d736-3358-4cd8-8d75-fb6b4717e7b2\",\"nid\":\"33775\"},{\"title\":\"Red Hat Developer Toolset\",\"field_product_machine_name\":\"developertoolset\",\"field_product_short_name\":\"Developer Toolset\",\"field_product_technology_group\":\"Infrastructure\",\"field_url_product_name\":\"developertoolset\",\"uuid\":\"52b022cf-2334-409c-9235-a8fc41c8f5fe\",\"nid\":\"33985\"},{\"title\":\"Red Hat Development Suite\",\"field_product_machine_name\":\"devsuite\",\"field_product_short_name\":\"DevSuite\",\"field_product_technology_group\":\"Developer Tools\",\"field_url_product_name\":\"devsuite\",\"uuid\":\"0614c8a3-32df-4338-a7a4-2569211143e0\",\"nid\":\"33765\"},{\"title\":\"Red Hat Enterprise Linux\",\"field_product_machine_name\":\"rhel\",\"field_product_short_name\":\"\",\"field_product_technology_group\":\"Infrastructure\",\"field_url_product_name\":\"rhel\",\"uuid\":\"374e061f-4462-4cac-b8cb-785cf24213a4\",\"nid\":\"33925\"},{\"title\":\"Red Hat JBoss AMQ\",\"field_product_machine_name\":\"amq\",\"field_product_short_name\":\"JBoss AMQ\",\"field_product_technology_group\":\"Integration And Automation\",\"field_url_product_name\":\"amq\",\"uuid\":\"f55b233a-1688-4e05-ae28-b1ee5819eb9c\",\"nid\":\"33835\"},{\"title\":\"Red Hat JBoss BPM Suite\",\"field_product_machine_name\":\"bpmsuite\",\"field_product_short_name\":\"JBoss BPM Suite\",\"field_product_technology_group\":\"Integration And Automation\",\"field_url_product_name\":\"bpmsuite\",\"uuid\":\"8846c3cc-e495-4969-9c8e-8f4a0672a34b\",\"nid\":\"33825\"},{\"title\":\"Red Hat JBoss BRMS\",\"field_product_machine_name\":\"brms\",\"field_product_short_name\":\"JBoss BRMS\",\"field_product_technology_group\":\"Integration And Automation\",\"field_url_product_name\":\"brms\",\"uuid\":\"10de0673-f137-45ba-8278-b3a3f4cc0778\",\"nid\":\"33815\"},{\"title\":\"Red Hat JBoss Data Grid\",\"field_product_machine_name\":\"datagrid\",\"field_product_short_name\":\"JBoss Data Grid\",\"field_product_technology_group\":\"Accelerated Development And Management\",\"field_url_product_name\":\"datagrid\",\"uuid\":\"dc76a602-e139-4809-acd0-37f462483264\",\"nid\":\"33905\"},{\"title\":\"Red Hat JBoss Data Virtualization\",\"field_product_machine_name\":\"datavirt\",\"field_product_short_name\":\"JBoss Data Virtualization\",\"field_product_technology_group\":\"Integration And Automation\",\"field_url_product_name\":\"datavirt\",\"uuid\":\"df8aae27-013b-4fbd-98fc-ef4f3222064a\",\"nid\":\"33935\"},{\"title\":\"Red Hat JBoss Enterprise Application Platform\",\"field_product_machine_name\":\"eap\",\"field_product_short_name\":\"JBoss EAP\",\"field_product_technology_group\":\"Accelerated Development And Management\",\"field_url_product_name\":\"eap\",\"uuid\":\"48a3f108-d582-4507-b168-89619ac708f7\",\"nid\":\"33895\"},{\"title\":\"Red Hat JBoss Fuse\",\"field_product_machine_name\":\"fuse\",\"field_product_short_name\":\"JBoss Fuse\",\"field_product_technology_group\":\"Integration And Automation\",\"field_url_product_name\":\"fuse\",\"uuid\":\"22f131d5-b1de-4656-a554-c118ef7c8dad\",\"nid\":\"33945\"},{\"title\":\"Red Hat JBoss Web Server\",\"field_product_machine_name\":\"webserver\",\"field_product_short_name\":\"JBoss Web Server\",\"field_product_technology_group\":\"Accelerated Development And Management\",\"field_url_product_name\":\"webserver\",\"uuid\":\"ead30d3e-d76a-4b59-904d-0b2119f4e1e6\",\"nid\":\"33915\"},{\"title\":\"Red Hat Mobile Application Platform\",\"field_product_machine_name\":\"mobileplatform\",\"field_product_short_name\":\"\",\"field_product_technology_group\":\"Mobile\",\"field_url_product_name\":\"mobileplatform\",\"uuid\":\"44d68f2c-ea11-44eb-8f22-05905a8bce8a\",\"nid\":\"33955\"},{\"title\":\"Red Hat OpenShift Container Platform\",\"field_product_machine_name\":\"openshift\",\"field_product_short_name\":\"OpenShift\",\"field_product_technology_group\":\"Cloud\",\"field_url_product_name\":\"openshift\",\"uuid\":\"35ae6bec-1378-44c7-9494-bf512d90c8c4\",\"nid\":\"33805\"},{\"title\":\"Red Hat Software Collections\",\"field_product_machine_name\":\"softwarecollections\",\"field_product_short_name\":\"SoftwareCollections\",\"field_product_technology_group\":\"Infrastructure\",\"field_url_product_name\":\"softwarecollections\",\"uuid\":\"7a240e4a-0bb6-4791-9207-9206a93c42bc\",\"nid\":\"33845\"}]";
        Product manualProduct = new Product("33895", "48a3f108-d582-4507-b168-89619ac708f7", "eapn", "JBoss EAP");

        ObjectMapper mapper = new ObjectMapper();
        List<Product> products = mapper.readValue(json, new TypeReference<List<Product>>() {
        });

        assertThat(products.contains(manualProduct)).isTrue();
        assertThat(products.stream().filter(product -> Objects.equals(product, manualProduct)).count() == 1).isTrue();
    }
}
