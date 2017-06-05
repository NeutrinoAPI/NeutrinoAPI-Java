# Getting started

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=NeutrinoAPI-Java&workspaceName=NeutrinoAPI&projectName=NeutrinoAPI&rootNamespace=com.neutrinoapi.sdk)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=NeutrinoAPI-Java&workspaceName=NeutrinoAPI&projectName=NeutrinoAPI&rootNamespace=com.neutrinoapi.sdk)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=NeutrinoAPI-Java&workspaceName=NeutrinoAPI&projectName=NeutrinoAPI&rootNamespace=com.neutrinoapi.sdk)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=NeutrinoAPI-Java&workspaceName=NeutrinoAPI&projectName=NeutrinoAPI&rootNamespace=com.neutrinoapi.sdk)

## How to Use

The following section explains how to use the NeutrinoAPI library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=NeutrinoAPI-Java&workspaceName=NeutrinoAPI&projectName=NeutrinoAPI&rootNamespace=com.neutrinoapi.sdk)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=NeutrinoAPI-Java&workspaceName=NeutrinoAPI&projectName=NeutrinoAPI&rootNamespace=com.neutrinoapi.sdk)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=NeutrinoAPI-Java&workspaceName=NeutrinoAPI&projectName=NeutrinoAPI&rootNamespace=com.neutrinoapi.sdk)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=NeutrinoAPI-Java&workspaceName=NeutrinoAPI&projectName=NeutrinoAPI&rootNamespace=com.neutrinoapi.sdk)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=NeutrinoAPI-Java&workspaceName=NeutrinoAPI&projectName=NeutrinoAPI&rootNamespace=com.neutrinoapi.sdk)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *NeutrinoAPI* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=NeutrinoAPI-Java&workspaceName=NeutrinoAPI&projectName=NeutrinoAPI&rootNamespace=com.neutrinoapi.sdk)

Clicking the ``` Add ``` button will open a dialog where you need to specify NeutrinoAPI in ``` Group Id ``` and NeutrinoAPI in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=NeutrinoAPI-Java&workspaceName=NeutrinoAPI&projectName=NeutrinoAPI&rootNamespace=com.neutrinoapi.sdk)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=NeutrinoAPI-Java&workspaceName=NeutrinoAPI&projectName=NeutrinoAPI&rootNamespace=com.neutrinoapi.sdk)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *NeutrinoAPI* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| userId | Your user ID |
| apiKey | Your API key |



API client can be initialized as following.

```java
// Initializing Object Mapper for Serialization and Deserialization purposes
public static ObjectMapper mapper = new ObjectMapper()
{
	private static final long serialVersionUID = -174113593500315394L;
	{
		configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}
};

// Configuration parameters and credentials
String userId = "userId"; // Your user ID
String apiKey = "apiKey"; // Your API key

NeutrinoAPIClient client = new NeutrinoAPIClient(userId, apiKey);
```

# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [DataTools](#data_tools)
* [ECommerce](#e_commerce)
* [Geolocation](#geolocation)
* [SecurityAndNetworking](#security_and_networking)
* [Telephony](#telephony)
* [Imaging](#imaging)

## <a name="data_tools"></a>![Class: ](https://apidocs.io/img/class.png "com.neutrinoapi.sdk.controllers.DataTools") DataTools

### Get singleton instance

The singleton instance of the ``` DataTools ``` class can be accessed from the API Client.

```java
DataTools dataTools = client.getDataTools();
```

### <a name="convert_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.DataTools.convertAsync") convertAsync

> A powerful unit and currency conversion tool


```java
void convertAsync(
        final String fromValue,
        final String fromType,
        final String toType,
        final APICallBack<ConvertResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| fromValue |  ``` Required ```  | The value to convert from |
| fromType |  ``` Required ```  | The type of the value to convert from |
| toType |  ``` Required ```  | The type to convert to |


#### Example Usage

```java
String fromValue = "from-value";
String fromType = "from-type";
String toType = "to-type";
// Invoking the API call with sample inputs
dataTools.convertAsync(fromValue, fromType, toType, new APICallBack<ConvertResponse>() {
    public void onSuccess(HttpContext context, ConvertResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="bad_word_filter_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.DataTools.badWordFilterAsync") badWordFilterAsync

> Detect bad words, swear words and profanity in a given text


```java
void badWordFilterAsync(
        final String content,
        final String censorCharacter,
        final APICallBack<BadWordFilterResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| content |  ``` Required ```  | The text content to check. This can be either a URL to load content from or an actual content string |
| censorCharacter |  ``` Optional ```  | The character to use to censor out the bad words found |


#### Example Usage

```java
String content = "content";
String censorCharacter = "censor-character";
// Invoking the API call with sample inputs
dataTools.badWordFilterAsync(content, censorCharacter, new APICallBack<BadWordFilterResponse>() {
    public void onSuccess(HttpContext context, BadWordFilterResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="email_validate_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.DataTools.emailValidateAsync") emailValidateAsync

> Parse, validate and clean an email address


```java
void emailValidateAsync(
        final String email,
        final Boolean fixTypos,
        final APICallBack<EmailValidateResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | The email address |
| fixTypos |  ``` Optional ```  ``` DefaultValue ```  | Automatically attempt to fix typos in the address |


#### Example Usage

```java
String email = "email";
Boolean fixTypos = false;
// Invoking the API call with sample inputs
dataTools.emailValidateAsync(email, fixTypos, new APICallBack<EmailValidateResponse>() {
    public void onSuccess(HttpContext context, EmailValidateResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="h_tml_clean_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.DataTools.hTMLCleanAsync") hTMLCleanAsync

> Clean and sanitize untrusted HTML


```java
void hTMLCleanAsync(
        final String content,
        final String outputType,
        final APICallBack<InputStream> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| content |  ``` Required ```  | The HTML content. This can be either a URL to load HTML from or an actual HTML content string |
| outputType |  ``` Required ```  | The level of sanitization, possible values are: plain-text, simple-text, basic-html, basic-html-with-images, advanced-html |


#### Example Usage

```java
String content = "content";
String outputType = "output-type";
// Invoking the API call with sample inputs
dataTools.hTMLCleanAsync(content, outputType, new APICallBack<InputStream>() {
    public void onSuccess(HttpContext context, InputStream response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="code_highlight_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.DataTools.codeHighlightAsync") codeHighlightAsync

> Code highlight will take raw source code and convert into nicely formatted HTML with syntax and keyword highlighting


```java
void codeHighlightAsync(
        final String content,
        final String type,
        final Boolean addKeywordLinks,
        final APICallBack<InputStream> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| content |  ``` Required ```  | The source content. This can be either a URL to load from or an actual content string |
| type |  ``` Required ```  | The code type. See the API docs for all supported types |
| addKeywordLinks |  ``` Optional ```  ``` DefaultValue ```  | Add links on source code keywords to the relevant language documentation |


#### Example Usage

```java
String content = "content";
String type = "type";
Boolean addKeywordLinks = false;
// Invoking the API call with sample inputs
dataTools.codeHighlightAsync(content, type, addKeywordLinks, new APICallBack<InputStream>() {
    public void onSuccess(HttpContext context, InputStream response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="user_agent_info_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.DataTools.userAgentInfoAsync") userAgentInfoAsync

> Parse, validate and get detailed user-agent information from a user agent string


```java
void userAgentInfoAsync(
        final String userAgent,
        final APICallBack<UserAgentInfoResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| userAgent |  ``` Required ```  | A user-agent string |


#### Example Usage

```java
String userAgent = "user-agent";
// Invoking the API call with sample inputs
dataTools.userAgentInfoAsync(userAgent, new APICallBack<UserAgentInfoResponse>() {
    public void onSuccess(HttpContext context, UserAgentInfoResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="h_tml_extract_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.DataTools.hTMLExtractAsync") hTMLExtractAsync

> Extract specific HTML tag contents or attributes from complex HTML or XHTML content


```java
void hTMLExtractAsync(
        final String content,
        final String tag,
        final String attribute,
        final String baseUrl,
        final APICallBack<HTMLExtractResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| content |  ``` Required ```  | The HTML content. This can be either a URL to load HTML from or an actual HTML content string |
| tag |  ``` Required ```  | The HTML tag(s) to extract data from. This can just be a simple tag name like 'img' OR a CSS/jQuery style selector |
| attribute |  ``` Optional ```  | If set, then extract data from the specified tag attribute. If not set, then data will be extracted from the tags inner content |
| baseUrl |  ``` Optional ```  | The base URL to replace into realive links |


#### Example Usage

```java
String content = "content";
String tag = "tag";
String attribute = "attribute";
String baseUrl = "base-url";
// Invoking the API call with sample inputs
dataTools.hTMLExtractAsync(content, tag, attribute, baseUrl, new APICallBack<HTMLExtractResponse>() {
    public void onSuccess(HttpContext context, HTMLExtractResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="phone_validate_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.DataTools.phoneValidateAsync") phoneValidateAsync

> Parse, validate and get location information about a phone number


```java
void phoneValidateAsync(
        final String number,
        final String countryCode,
        final String ip,
        final APICallBack<PhoneValidateResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| number |  ``` Required ```  | The phone number |
| countryCode |  ``` Optional ```  | ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign) |
| ip |  ``` Optional ```  | Pass in a users IP address and we will assume numbers are based in the country of the IP address |


#### Example Usage

```java
String number = "number";
String countryCode = "country-code";
String ip = "ip";
// Invoking the API call with sample inputs
dataTools.phoneValidateAsync(number, countryCode, ip, new APICallBack<PhoneValidateResponse>() {
    public void onSuccess(HttpContext context, PhoneValidateResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="e_commerce"></a>![Class: ](https://apidocs.io/img/class.png "com.neutrinoapi.sdk.controllers.ECommerce") ECommerce

### Get singleton instance

The singleton instance of the ``` ECommerce ``` class can be accessed from the API Client.

```java
ECommerce eCommerce = client.getECommerce();
```

### <a name="b_in_lookup_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.ECommerce.bINLookupAsync") bINLookupAsync

> Perform a BIN (Bank Identification Number) or IIN (Issuer Identification Number) lookup. See: https://www.neutrinoapi.com/api/bin-lookup/


```java
void bINLookupAsync(
        final String binNumber,
        final String customerIp,
        final APICallBack<BINLookupResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| binNumber |  ``` Required ```  | The BIN or IIN number (the first 6 digits of a credit card number) |
| customerIp |  ``` Optional ```  | Pass in a customers remote IP address. The API will then determine the country of the IP address and match it against the BIN country. This feature is designed for fraud prevention and detection checks. |


#### Example Usage

```java
String binNumber = "bin-number";
String customerIp = "customer-ip";
// Invoking the API call with sample inputs
eCommerce.bINLookupAsync(binNumber, customerIp, new APICallBack<BINLookupResponse>() {
    public void onSuccess(HttpContext context, BINLookupResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="geolocation"></a>![Class: ](https://apidocs.io/img/class.png "com.neutrinoapi.sdk.controllers.Geolocation") Geolocation

### Get singleton instance

The singleton instance of the ``` Geolocation ``` class can be accessed from the API Client.

```java
Geolocation geolocation = client.getGeolocation();
```

### <a name="geocode_reverse_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.Geolocation.geocodeReverseAsync") geocodeReverseAsync

> Convert a geographic coordinate (latitude and longitude) into a real world address or location.


```java
void geocodeReverseAsync(
        final double latitude,
        final double longitude,
        final String languageCode,
        final APICallBack<GeocodeReverseResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| latitude |  ``` Required ```  | The location latitude |
| longitude |  ``` Required ```  | The location longitude |
| languageCode |  ``` Optional ```  ``` DefaultValue ```  | The language to display results in, available languages are: de, en, es, fr, it, pt, ru |


#### Example Usage

```java
double latitude = 36.168800488193;
double longitude = 36.168800488193;
String languageCode = "en";
// Invoking the API call with sample inputs
geolocation.geocodeReverseAsync(latitude, longitude, languageCode, new APICallBack<GeocodeReverseResponse>() {
    public void onSuccess(HttpContext context, GeocodeReverseResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="geocode_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.Geolocation.geocodeAddressAsync") geocodeAddressAsync

> Geocode an address, partial address or the name of a location


```java
void geocodeAddressAsync(
        final String address,
        final String countryCode,
        final String languageCode,
        final Boolean fuzzySearch,
        final APICallBack<GeocodeAddressResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| address |  ``` Required ```  | The address or partial address to try and locate |
| countryCode |  ``` Optional ```  | The ISO 2-letter country code to be biased towards (default is no country bias) |
| languageCode |  ``` Optional ```  ``` DefaultValue ```  | The language to display results in, available languages are: de, en, es, fr, it, pt, ru |
| fuzzySearch |  ``` Optional ```  ``` DefaultValue ```  | If no matches are found for the given address, start performing a recursive fuzzy search until a geolocation is found. We use a combination of approximate string matching and data cleansing to find possible location matches |


#### Example Usage

```java
String address = "address";
String countryCode = "country-code";
String languageCode = "en";
Boolean fuzzySearch = false;
// Invoking the API call with sample inputs
geolocation.geocodeAddressAsync(address, countryCode, languageCode, fuzzySearch, new APICallBack<GeocodeAddressResponse>() {
    public void onSuccess(HttpContext context, GeocodeAddressResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="i_p_info_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.Geolocation.iPInfoAsync") iPInfoAsync

> Get location information about an IP address and do reverse DNS (PTR) lookups.


```java
void iPInfoAsync(
        final String ip,
        final Boolean reverseLookup,
        final APICallBack<IPInfoResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| ip |  ``` Required ```  | The IP address |
| reverseLookup |  ``` Optional ```  ``` DefaultValue ```  | Do a reverse DNS (PTR) lookup. This option can add extra delay to the request so only use it if you need it |


#### Example Usage

```java
String ip = "ip";
Boolean reverseLookup = false;
// Invoking the API call with sample inputs
geolocation.iPInfoAsync(ip, reverseLookup, new APICallBack<IPInfoResponse>() {
    public void onSuccess(HttpContext context, IPInfoResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="security_and_networking"></a>![Class: ](https://apidocs.io/img/class.png "com.neutrinoapi.sdk.controllers.SecurityAndNetworking") SecurityAndNetworking

### Get singleton instance

The singleton instance of the ``` SecurityAndNetworking ``` class can be accessed from the API Client.

```java
SecurityAndNetworking securityAndNetworking = client.getSecurityAndNetworking();
```

### <a name="host_reputation_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.SecurityAndNetworking.hostReputationAsync") hostReputationAsync

> Check the reputation of an IP address or domain against a comprehensive list of blacklists and blocklists (DNSBLs)


```java
void hostReputationAsync(
        final String host,
        final APICallBack<HostReputationResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| host |  ``` Required ```  | An IPv4 address or a domain name. If you supply a domain name it will be checked against the URI DNSBL list |


#### Example Usage

```java
String host = "host";
// Invoking the API call with sample inputs
securityAndNetworking.hostReputationAsync(host, new APICallBack<HostReputationResponse>() {
    public void onSuccess(HttpContext context, HostReputationResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="i_p_blocklist_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.SecurityAndNetworking.iPBlocklistAsync") iPBlocklistAsync

> The IP Blocklist API will detect potentially malicious or dangerous IP addresses


```java
void iPBlocklistAsync(
        final String ip,
        final APICallBack<IPBlocklistResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| ip |  ``` Required ```  | An IPv4 address |


#### Example Usage

```java
String ip = "ip";
// Invoking the API call with sample inputs
securityAndNetworking.iPBlocklistAsync(ip, new APICallBack<IPBlocklistResponse>() {
    public void onSuccess(HttpContext context, IPBlocklistResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="i_p_probe_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.SecurityAndNetworking.iPProbeAsync") iPProbeAsync

> Analyze and extract provider information for an IP address


```java
void iPProbeAsync(
        final String ip,
        final APICallBack<IPProbeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| ip |  ``` Required ```  | IPv4 or IPv6 address |


#### Example Usage

```java
String ip = "ip";
// Invoking the API call with sample inputs
securityAndNetworking.iPProbeAsync(ip, new APICallBack<IPProbeResponse>() {
    public void onSuccess(HttpContext context, IPProbeResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="u_rl_info_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.SecurityAndNetworking.uRLInfoAsync") uRLInfoAsync

> Parse, analyze and retrieve content from the supplied URL


```java
void uRLInfoAsync(
        final String url,
        final boolean fetchContent,
        final APICallBack<URLInfoResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| url |  ``` Required ```  | The URL to process |
| fetchContent |  ``` Required ```  | If this URL responds with html, text, json or xml then return the response. This option is useful if you want to perform further processing on the URL content |


#### Example Usage

```java
String url = "url";
boolean fetchContent = false;
// Invoking the API call with sample inputs
securityAndNetworking.uRLInfoAsync(url, fetchContent, new APICallBack<URLInfoResponse>() {
    public void onSuccess(HttpContext context, URLInfoResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="telephony"></a>![Class: ](https://apidocs.io/img/class.png "com.neutrinoapi.sdk.controllers.Telephony") Telephony

### Get singleton instance

The singleton instance of the ``` Telephony ``` class can be accessed from the API Client.

```java
Telephony telephony = client.getTelephony();
```

### <a name="h_lr_lookup_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.Telephony.hLRLookupAsync") hLRLookupAsync

> Connect to the global mobile cellular network and retrieve the status of a mobile device


```java
void hLRLookupAsync(
        final String number,
        final String countryCode,
        final APICallBack<HLRLookupResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| number |  ``` Required ```  | A phone number |
| countryCode |  ``` Optional ```  | ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign) |


#### Example Usage

```java
String number = "number";
String countryCode = "country-code";
// Invoking the API call with sample inputs
telephony.hLRLookupAsync(number, countryCode, new APICallBack<HLRLookupResponse>() {
    public void onSuccess(HttpContext context, HLRLookupResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="verify_security_code_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.Telephony.verifySecurityCodeAsync") verifySecurityCodeAsync

> Check if a security code from one of the verify APIs is valid


```java
void verifySecurityCodeAsync(
        final int securityCode,
        final APICallBack<VerifySecurityCodeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| securityCode |  ``` Required ```  | The security code to verify |


#### Example Usage

```java
int securityCode = 36;
// Invoking the API call with sample inputs
telephony.verifySecurityCodeAsync(securityCode, new APICallBack<VerifySecurityCodeResponse>() {
    public void onSuccess(HttpContext context, VerifySecurityCodeResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="s_ms_verify_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.Telephony.sMSVerifyAsync") sMSVerifyAsync

> Send a unique security code to any mobile device via SMS


```java
void sMSVerifyAsync(
        final String number,
        final Integer codeLength,
        final Integer securityCode,
        final String countryCode,
        final String languageCode,
        final APICallBack<SMSVerifyResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| number |  ``` Required ```  | The phone number to send a verification code to |
| codeLength |  ``` Optional ```  ``` DefaultValue ```  | The number of digits to use in the security code (must be between 4 and 12) |
| securityCode |  ``` Optional ```  | ass in your own security code. This is useful if you have implemented TOTP or similar 2FA methods. If not set then we will generate a secure random code (only numerical security codes are currently supported) |
| countryCode |  ``` Optional ```  | ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign) |
| languageCode |  ``` Optional ```  ``` DefaultValue ```  | The language to send the verification code in, available languages are: de - German, en - English, es - Spanish, fr - Fench, it - Italian, pt - Portuguese, ru - Russian |


#### Example Usage

```java
String number = "number";
Integer codeLength = 5;
Integer securityCode = 36;
String countryCode = "country-code";
String languageCode = "en";
// Invoking the API call with sample inputs
telephony.sMSVerifyAsync(number, codeLength, securityCode, countryCode, languageCode, new APICallBack<SMSVerifyResponse>() {
    public void onSuccess(HttpContext context, SMSVerifyResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="phone_playback_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.Telephony.phonePlaybackAsync") phonePlaybackAsync

> Make an automated call to any valid phone number and playback an audio message


```java
void phonePlaybackAsync(
        final String number,
        final String audioUrl,
        final APICallBack<PhonePlaybackResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| number |  ``` Required ```  | The phone number to call. Must be valid international format |
| audioUrl |  ``` Required ```  | A URL to a valid audio file. Accepted audio formats are: MP3, WAV, OGG |


#### Example Usage

```java
String number = "number";
String audioUrl = "audio-url";
// Invoking the API call with sample inputs
telephony.phonePlaybackAsync(number, audioUrl, new APICallBack<PhonePlaybackResponse>() {
    public void onSuccess(HttpContext context, PhonePlaybackResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="phone_verify_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.Telephony.phoneVerifyAsync") phoneVerifyAsync

> Make an automated call to any valid phone number and playback a unique security code


```java
void phoneVerifyAsync(
        final String number,
        final Integer codeLength,
        final Integer securityCode,
        final Integer playbackDelay,
        final String countryCode,
        final String languageCode,
        final APICallBack<PhoneVerifyResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| number |  ``` Required ```  | The phone number to send the verification code to |
| codeLength |  ``` Optional ```  ``` DefaultValue ```  | The number of digits to use in the security code (between 4 and 12) |
| securityCode |  ``` Optional ```  | Pass in your own security code. This is useful if you have implemented TOTP or similar 2FA methods. If not set then we will generate a secure random code (only numerical security codes are currently supported) |
| playbackDelay |  ``` Optional ```  ``` DefaultValue ```  | The delay in milliseconds between the playback of each security code |
| countryCode |  ``` Optional ```  | ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign) |
| languageCode |  ``` Optional ```  ``` DefaultValue ```  | The language to playback the verification code in, available languages are: de - German, en - English, es - Spanish, fr - Fench, it - Italian, pt - Portuguese, ru - Russian |


#### Example Usage

```java
String number = "number";
Integer codeLength = 6;
Integer securityCode = 36;
Integer playbackDelay = 800;
String countryCode = "country-code";
String languageCode = "en";
// Invoking the API call with sample inputs
telephony.phoneVerifyAsync(number, codeLength, securityCode, playbackDelay, countryCode, languageCode, new APICallBack<PhoneVerifyResponse>() {
    public void onSuccess(HttpContext context, PhoneVerifyResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="imaging"></a>![Class: ](https://apidocs.io/img/class.png "com.neutrinoapi.sdk.controllers.Imaging") Imaging

### Get singleton instance

The singleton instance of the ``` Imaging ``` class can be accessed from the API Client.

```java
Imaging imaging = client.getImaging();
```

### <a name="image_resize_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.Imaging.imageResizeAsync") imageResizeAsync

> Resize an image and output as either JPEG or PNG. See: https://www.neutrinoapi.com/api/image-resize/


```java
void imageResizeAsync(
        final String imageUrl,
        final int width,
        final int height,
        final String format,
        final APICallBack<InputStream> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| imageUrl |  ``` Required ```  | The URL to the source image |
| width |  ``` Required ```  | Width to resize to (in px) |
| height |  ``` Required ```  | Height to resize to (in px) |
| format |  ``` Optional ```  ``` DefaultValue ```  | The output image format, can be either png or jpg |


#### Example Usage

```java
String imageUrl = "image-url";
int width = 36;
int height = 36;
String format = "png";
// Invoking the API call with sample inputs
imaging.imageResizeAsync(imageUrl, width, height, format, new APICallBack<InputStream>() {
    public void onSuccess(HttpContext context, InputStream response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="q_r_code_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.Imaging.qRCodeAsync") qRCodeAsync

> Generate a QR code as a PNG image. See: https://www.neutrinoapi.com/api/qr-code/


```java
void qRCodeAsync(
        final String content,
        final Integer width,
        final Integer height,
        final String fgColor,
        final String bgColor,
        final APICallBack<InputStream> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| content |  ``` Required ```  | The content to encode into the QR code (e.g. a URL or a phone number) |
| width |  ``` Optional ```  ``` DefaultValue ```  | The width of the QR code (in px) |
| height |  ``` Optional ```  ``` DefaultValue ```  | The height of the QR code (in px) |
| fgColor |  ``` Optional ```  ``` DefaultValue ```  | The QR code foreground color (you should always use a dark color for this) |
| bgColor |  ``` Optional ```  ``` DefaultValue ```  | The QR code background color (you should always use a light color for this) |


#### Example Usage

```java
String content = "content";
Integer width = 250;
Integer height = 250;
String fgColor = "#000000";
String bgColor = "#ffffff";
// Invoking the API call with sample inputs
imaging.qRCodeAsync(content, width, height, fgColor, bgColor, new APICallBack<InputStream>() {
    public void onSuccess(HttpContext context, InputStream response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="image_watermark_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.Imaging.imageWatermarkAsync") imageWatermarkAsync

> Watermark one image with another image. See: https://www.neutrinoapi.com/api/image-watermark/


```java
void imageWatermarkAsync(
        final String imageUrl,
        final String watermarkUrl,
        final Integer opacity,
        final String format,
        final String position,
        final Integer width,
        final Integer height,
        final APICallBack<InputStream> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| imageUrl |  ``` Required ```  | The URL to the source image |
| watermarkUrl |  ``` Required ```  | The URL to the watermark image |
| opacity |  ``` Optional ```  ``` DefaultValue ```  | The opacity of the watermark (0 to 100) |
| format |  ``` Optional ```  ``` DefaultValue ```  | The output image format, can be either png or jpg |
| position |  ``` Optional ```  ``` DefaultValue ```  | The position of the watermark image, possible values are: center, top-left, top-center, top-right, bottom-left, bottom-center, bottom-right |
| width |  ``` Optional ```  | If set resize the resulting image to this width (preserving aspect ratio) |
| height |  ``` Optional ```  | If set resize the resulting image to this height (preserving aspect ratio) |


#### Example Usage

```java
String imageUrl = "image-url";
String watermarkUrl = "watermark-url";
Integer opacity = 50;
String format = "png";
String position = "center";
Integer width = 36;
Integer height = 36;
// Invoking the API call with sample inputs
imaging.imageWatermarkAsync(imageUrl, watermarkUrl, opacity, format, position, width, height, new APICallBack<InputStream>() {
    public void onSuccess(HttpContext context, InputStream response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="h_tml5_render_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.Imaging.hTML5RenderAsync") hTML5RenderAsync

> Render HTML and HTML5 content to PDF, JPG or PNG


```java
void hTML5RenderAsync(
        final String content,
        final String format,
        final String pageSize,
        final String title,
        final Integer margin,
        final Integer marginLeft,
        final Integer marginRight,
        final Integer marginTop,
        final Integer marginBottom,
        final Boolean landscape,
        final Double zoom,
        final Boolean grayscale,
        final Boolean mediaPrint,
        final Boolean mediaQueries,
        final Boolean forms,
        final String css,
        final Integer imageWidth,
        final Integer imageHeight,
        final APICallBack<InputStream> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| content |  ``` Required ```  | The HTML content. This can be either a URL to load HTML from or an actual HTML content string |
| format |  ``` Optional ```  ``` DefaultValue ```  | Which format to output, available options are: PDF, PNG, JPG |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | Set the document page size, can be one of: A0 - A9, B0 - B10, Comm10E, DLE or Letter |
| title |  ``` Optional ```  | The document title |
| margin |  ``` Optional ```  ``` DefaultValue ```  | The document margin (in mm) |
| marginLeft |  ``` Optional ```  ``` DefaultValue ```  | The document left margin (in mm) |
| marginRight |  ``` Optional ```  ``` DefaultValue ```  | The document right margin (in mm) |
| marginTop |  ``` Optional ```  ``` DefaultValue ```  | The document top margin (in mm) |
| marginBottom |  ``` Optional ```  ``` DefaultValue ```  | The document bottom margin (in mm) |
| landscape |  ``` Optional ```  ``` DefaultValue ```  | Set the document to lanscape orientation |
| zoom |  ``` Optional ```  ``` DefaultValue ```  | Set the zoom factor when rendering the page (2.0 for double size, 0.5 for half size) |
| grayscale |  ``` Optional ```  ``` DefaultValue ```  | Render the final document in grayscale |
| mediaPrint |  ``` Optional ```  ``` DefaultValue ```  | Use @media print CSS styles to render the document |
| mediaQueries |  ``` Optional ```  ``` DefaultValue ```  | Activate all @media queries before rendering. This can be useful if you wan't to render the mobile version of a responsive website |
| forms |  ``` Optional ```  ``` DefaultValue ```  | Generate real (fillable) PDF forms from HTML forms |
| css |  ``` Optional ```  | Inject custom CSS into the HTML. e.g. 'body { background-color: red;}' |
| imageWidth |  ``` Optional ```  ``` DefaultValue ```  | If rendering to an image format (PNG or JPG) use this image width (in pixels) |
| imageHeight |  ``` Optional ```  | If rendering to an image format (PNG or JPG) use this image height (in pixels). The default is automatic which dynamically sets the image height based on the content |


#### Example Usage

```java
String content = "content";
String format = "PDF";
String pageSize = "A4";
String title = "title";
Integer margin = 0;
Integer marginLeft = 0;
Integer marginRight = 0;
Integer marginTop = 0;
Integer marginBottom = 0;
Boolean landscape = false;
Double zoom = 1.0;
Boolean grayscale = false;
Boolean mediaPrint = false;
Boolean mediaQueries = false;
Boolean forms = false;
String css = "css";
Integer imageWidth = 1024;
Integer imageHeight = 249;
// Invoking the API call with sample inputs
imaging.hTML5RenderAsync(content, format, pageSize, title, margin, marginLeft, marginRight, marginTop, marginBottom, landscape, zoom, grayscale, mediaPrint, mediaQueries, forms, css, imageWidth, imageHeight, new APICallBack<InputStream>() {
    public void onSuccess(HttpContext context, InputStream response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)



