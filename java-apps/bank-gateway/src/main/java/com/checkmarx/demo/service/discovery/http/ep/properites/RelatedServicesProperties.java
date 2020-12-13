package com.checkmarx.demo.service.discovery.http.ep.properites;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Yevgeny Kuznetsov
 * @since 1.0.0, 25 August 2020
 **/
@Component
@ConfigurationProperties("related.services")
@Data
public class RelatedServicesProperties {

    /**
     * bank-analysis application URL.
     * <p>
     * <u>Example:</u> {@code http://bank-analysis:8182}
     */
    private String bankAnalysisUrl;

    /**
     * java-http-sink application URL.
     * <p>
     * <u>Example:</u> {@code http://java-http-sink:8183}
     */
    private String javaHttpSinkUrl;
}
