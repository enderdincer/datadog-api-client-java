// Create a GCP integration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.GcpIntegrationApi;
import com.datadog.api.client.v1.model.GCPAccount;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    GcpIntegrationApi apiInstance = new GcpIntegrationApi(defaultClient);

    GCPAccount body =
        new GCPAccount()
            .authProviderX509CertUrl("https://www.googleapis.com/oauth2/v1/certs")
            .authUri("https://accounts.google.com/o/oauth2/auth")
            .clientEmail("252bf553ef04b351@example.com")
            .clientId("163662907116366290710")
            .clientX509CertUrl("https://www.googleapis.com/robot/v1/metadata/x509/$CLIENT_EMAIL")
            .hostFilters("key:value,filter:example")
            .isCspmEnabled(true)
            .isSecurityCommandCenterEnabled(true)
            .privateKey("private_key")
            .privateKeyId("123456789abcdefghi123456789abcdefghijklm")
            .projectId("datadog-apitest")
            .resourceCollectionEnabled(true)
            .tokenUri("https://accounts.google.com/o/oauth2/token")
            .type("service_account");

    try {
      apiInstance.createGCPIntegration(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling GcpIntegrationApi#createGCPIntegration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
