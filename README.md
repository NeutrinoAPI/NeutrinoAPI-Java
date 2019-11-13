# Getting started

The general-purpose API

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| userId | Your user ID |
| apiKey | Your API key |



API client can be initialized as following.

```java
// Configuration parameters and credentials
String userId = "userId"; // Your user ID
String apiKey = "apiKey"; // Your API key

NeutrinoAPIClient client = new NeutrinoAPIClient(userId, apiKey);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [Imaging](#imaging)
* [Telephony](#telephony)
* [DataTools](#data_tools)
* [SecurityAndNetworking](#security_and_networking)
* [Geolocation](#geolocation)
* [ECommerce](#e_commerce)
* [WWW](#www)

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
| width |  ``` Required ```  | The width to resize to (in px) while preserving aspect ratio |
| height |  ``` Required ```  | The height to resize to (in px) while preserving aspect ratio |
| format |  ``` Optional ```  ``` DefaultValue ```  | The output image format, can be either png or jpg |


#### Example Usage

```java
String imageUrl = "image-url";
int width = 27;
int height = 27;
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
| fgColor |  ``` Optional ```  ``` DefaultValue ```  | The QR code foreground color |
| bgColor |  ``` Optional ```  ``` DefaultValue ```  | The QR code background color |


#### Example Usage

```java
String content = "content";
Integer width = 256;
Integer height = 256;
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
| width |  ``` Optional ```  | If set resize the resulting image to this width (in px) while preserving aspect ratio |
| height |  ``` Optional ```  | If set resize the resulting image to this height (in px) while preserving aspect ratio |


#### Example Usage

```java
String imageUrl = "image-url";
String watermarkUrl = "watermark-url";
Integer opacity = 50;
String format = "png";
String position = "center";
Integer width = 27;
Integer height = 27;
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

> Render HTML content to PDF, JPG or PNG. See: https://www.neutrinoapi.com/api/html5-render/


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
        final Integer zoom,
        final Boolean grayscale,
        final Boolean mediaPrint,
        final Boolean mediaQueries,
        final Boolean forms,
        final String css,
        final Integer imageWidth,
        final Integer imageHeight,
        final Integer renderDelay,
        final String headerTextLeft,
        final String headerTextCenter,
        final String headerTextRight,
        final Integer headerSize,
        final String headerFont,
        final Integer headerFontSize,
        final Boolean headerLine,
        final String footerTextLeft,
        final String footerTextCenter,
        final String footerTextRight,
        final Integer footerSize,
        final String footerFont,
        final Integer footerFontSize,
        final Boolean footerLine,
        final Integer pageWidth,
        final Integer pageHeight,
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
| renderDelay |  ``` Optional ```  ``` DefaultValue ```  | Number of milliseconds to wait before rendering the page (can be useful for pages with animations etc) |
| headerTextLeft |  ``` Optional ```  | Text to print to the left-hand side header of each page. e.g. 'My header - Page {page_number} of {total_pages}' |
| headerTextCenter |  ``` Optional ```  | Text to print to the center header of each page |
| headerTextRight |  ``` Optional ```  | Text to print to the right-hand side header of each page |
| headerSize |  ``` Optional ```  ``` DefaultValue ```  | The height of your header (in mm) |
| headerFont |  ``` Optional ```  ``` DefaultValue ```  | Set the header font. Fonts available: Times, Courier, Helvetica, Arial |
| headerFontSize |  ``` Optional ```  ``` DefaultValue ```  | Set the header font size (in pt) |
| headerLine |  ``` Optional ```  ``` DefaultValue ```  | Draw a full page width horizontal line under your header |
| footerTextLeft |  ``` Optional ```  | Text to print to the left-hand side footer of each page. e.g. 'My footer - Page {page_number} of {total_pages}' |
| footerTextCenter |  ``` Optional ```  | Text to print to the center header of each page |
| footerTextRight |  ``` Optional ```  | Text to print to the right-hand side header of each page |
| footerSize |  ``` Optional ```  ``` DefaultValue ```  | The height of your footer (in mm) |
| footerFont |  ``` Optional ```  ``` DefaultValue ```  | Set the footer font. Fonts available: Times, Courier, Helvetica, Arial |
| footerFontSize |  ``` Optional ```  ``` DefaultValue ```  | Set the footer font size (in pt) |
| footerLine |  ``` Optional ```  ``` DefaultValue ```  | Draw a full page width horizontal line above your footer |
| pageWidth |  ``` Optional ```  | Set the PDF page width explicitly (in mm) |
| pageHeight |  ``` Optional ```  | Set the PDF page height explicitly (in mm) |


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
Integer zoom = 1;
Boolean grayscale = false;
Boolean mediaPrint = false;
Boolean mediaQueries = false;
Boolean forms = false;
String css = "css";
Integer imageWidth = 1024;
Integer imageHeight = 27;
Integer renderDelay = 0;
String headerTextLeft = "header-text-left";
String headerTextCenter = "header-text-center";
String headerTextRight = "header-text-right";
Integer headerSize = 9;
String headerFont = "Courier";
Integer headerFontSize = 11;
Boolean headerLine = false;
String footerTextLeft = "footer-text-left";
String footerTextCenter = "footer-text-center";
String footerTextRight = "footer-text-right";
Integer footerSize = 9;
String footerFont = "Courier";
Integer footerFontSize = 11;
Boolean footerLine = false;
Integer pageWidth = 118;
Integer pageHeight = 118;
// Invoking the API call with sample inputs
imaging.hTML5RenderAsync(content, format, pageSize, title, margin, marginLeft, marginRight, marginTop, marginBottom, landscape, zoom, grayscale, mediaPrint, mediaQueries, forms, css, imageWidth, imageHeight, renderDelay, headerTextLeft, headerTextCenter, headerTextRight, headerSize, headerFont, headerFontSize, headerLine, footerTextLeft, footerTextCenter, footerTextRight, footerSize, footerFont, footerFontSize, footerLine, pageWidth, pageHeight, new APICallBack<InputStream>() {
    public void onSuccess(HttpContext context, InputStream response) {
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

### <a name="verify_security_code_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.Telephony.verifySecurityCodeAsync") verifySecurityCodeAsync

> Check if a security code from one of the verify APIs is valid. See: https://www.neutrinoapi.com/api/verify-security-code/


```java
void verifySecurityCodeAsync(
        final String securityCode,
        final APICallBack<VerifySecurityCodeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| securityCode |  ``` Required ```  | The security code to verify |


#### Example Usage

```java
String securityCode = "security-code";
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


### <a name="h_lr_lookup_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.Telephony.hLRLookupAsync") hLRLookupAsync

> Connect to the global mobile cellular network and retrieve the status of a mobile device. See: https://www.neutrinoapi.com/api/hlr-lookup/


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


### <a name="phone_playback_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.Telephony.phonePlaybackAsync") phonePlaybackAsync

> Make an automated call to any valid phone number and playback an audio message. See: https://www.neutrinoapi.com/api/phone-playback/


```java
void phonePlaybackAsync(
        final String number,
        final String audioUrl,
        final APICallBack<PhonePlaybackResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| number |  ``` Required ```  | The phone number to call. Must be in valid international format |
| audioUrl |  ``` Required ```  | A URL to a valid audio file. Accepted audio formats are: <ul> <li>MP3</li> <li>WAV</li> <li>OGG</li> </ul>You can use the following MP3 URL for testing: https://www.neutrinoapi.com/test-files/test1.mp3 |


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


### <a name="s_ms_verify_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.Telephony.sMSVerifyAsync") sMSVerifyAsync

> Send a unique security code to any mobile device via SMS. See: https://www.neutrinoapi.com/api/sms-verify/


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
| securityCode |  ``` Optional ```  | Pass in your own security code. This is useful if you have implemented TOTP or similar 2FA methods. If not set then we will generate a secure random code |
| countryCode |  ``` Optional ```  | ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign) |
| languageCode |  ``` Optional ```  ``` DefaultValue ```  | The language to send the verification code in, available languages are: <ul> <li>de - German</li> <li>en - English</li> <li>es - Spanish</li> <li>fr - French</li> <li>it - Italian</li> <li>pt - Portuguese</li> <li>ru - Russian</li> </ul> |


#### Example Usage

```java
String number = "number";
Integer codeLength = 5;
Integer securityCode = 118;
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


### <a name="s_ms_message_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.Telephony.sMSMessageAsync") sMSMessageAsync

> Send a free-form message to any mobile device via SMS. See: https://www.neutrinoapi.com/api/sms-message/


```java
void sMSMessageAsync(
        final String number,
        final String message,
        final String countryCode,
        final APICallBack<SMSMessageResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| number |  ``` Required ```  | The phone number to send a message to |
| message |  ``` Required ```  | The SMS message to send. Messages are truncated to a maximum of 150 characters for ASCII content OR 70 characters for UTF content |
| countryCode |  ``` Optional ```  | ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign) |


#### Example Usage

```java
String number = "number";
String message = "message";
String countryCode = "country-code";
// Invoking the API call with sample inputs
telephony.sMSMessageAsync(number, message, countryCode, new APICallBack<SMSMessageResponse>() {
    public void onSuccess(HttpContext context, SMSMessageResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="phone_verify_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.Telephony.phoneVerifyAsync") phoneVerifyAsync

> Make an automated call to any valid phone number and playback a unique security code. See: https://www.neutrinoapi.com/api/phone-verify/


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
| securityCode |  ``` Optional ```  | Pass in your own security code. This is useful if you have implemented TOTP or similar 2FA methods. If not set then we will generate a secure random code |
| playbackDelay |  ``` Optional ```  ``` DefaultValue ```  | The delay in milliseconds between the playback of each security code |
| countryCode |  ``` Optional ```  | ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign) |
| languageCode |  ``` Optional ```  ``` DefaultValue ```  | The language to playback the verification code in, available languages are: <ul> <li>de - German</li> <li>en - English</li> <li>es - Spanish</li> <li>fr - French</li> <li>it - Italian</li> <li>pt - Portuguese</li> <li>ru - Russian</li> </ul> |


#### Example Usage

```java
String number = "number";
Integer codeLength = 6;
Integer securityCode = 118;
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

## <a name="data_tools"></a>![Class: ](https://apidocs.io/img/class.png "com.neutrinoapi.sdk.controllers.DataTools") DataTools

### Get singleton instance

The singleton instance of the ``` DataTools ``` class can be accessed from the API Client.

```java
DataTools dataTools = client.getDataTools();
```

### <a name="email_validate_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.DataTools.emailValidateAsync") emailValidateAsync

> Parse, validate and clean an email address. See: https://www.neutrinoapi.com/api/email-validate/


```java
void emailValidateAsync(
        final String email,
        final Boolean fixTypos,
        final APICallBack<EmailValidateResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | An email address |
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


### <a name="user_agent_info_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.DataTools.userAgentInfoAsync") userAgentInfoAsync

> Parse, validate and get detailed user-agent information from a user agent string. See: https://www.neutrinoapi.com/api/user-agent-info/


```java
void userAgentInfoAsync(
        final String userAgent,
        final APICallBack<UserAgentInfoResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| userAgent |  ``` Required ```  | A user agent string |


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


### <a name="bad_word_filter_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.DataTools.badWordFilterAsync") badWordFilterAsync

> Detect bad words, swear words and profanity in a given text. See: https://www.neutrinoapi.com/api/bad-word-filter/


```java
void badWordFilterAsync(
        final String content,
        final String censorCharacter,
        final APICallBack<BadWordFilterResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| content |  ``` Required ```  | The content to scan. This can be either a URL to load content from or an actual content string |
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


### <a name="convert_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.DataTools.convertAsync") convertAsync

> A powerful unit conversion tool. See: https://www.neutrinoapi.com/api/convert/


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
| fromValue |  ``` Required ```  | The value to convert from (e.g. 10.95) |
| fromType |  ``` Required ```  | The type of the value to convert from (e.g. USD) |
| toType |  ``` Required ```  | The type to convert to (e.g. EUR) |


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


### <a name="phone_validate_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.DataTools.phoneValidateAsync") phoneValidateAsync

> Parse, validate and get location information about a phone number. See: https://www.neutrinoapi.com/api/phone-validate/


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
| number |  ``` Required ```  | A phone number. This can be in international format (E.164) or local format. If passing local format you should use the 'country-code' or 'ip' options as well |
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

## <a name="security_and_networking"></a>![Class: ](https://apidocs.io/img/class.png "com.neutrinoapi.sdk.controllers.SecurityAndNetworking") SecurityAndNetworking

### Get singleton instance

The singleton instance of the ``` SecurityAndNetworking ``` class can be accessed from the API Client.

```java
SecurityAndNetworking securityAndNetworking = client.getSecurityAndNetworking();
```

### <a name="i_p_probe_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.SecurityAndNetworking.iPProbeAsync") iPProbeAsync

> Analyze and extract provider information for an IP address. See: https://www.neutrinoapi.com/api/ip-probe/


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


### <a name="email_verify_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.SecurityAndNetworking.emailVerifyAsync") emailVerifyAsync

> SMTP based email address verification. See: https://www.neutrinoapi.com/api/email-verify/


```java
void emailVerifyAsync(
        final String email,
        final Boolean fixTypos,
        final APICallBack<EmailVerifyResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | An email address |
| fixTypos |  ``` Optional ```  ``` DefaultValue ```  | Automatically attempt to fix typos in the address |


#### Example Usage

```java
String email = "email";
Boolean fixTypos = false;
// Invoking the API call with sample inputs
securityAndNetworking.emailVerifyAsync(email, fixTypos, new APICallBack<EmailVerifyResponse>() {
    public void onSuccess(HttpContext context, EmailVerifyResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="i_p_blocklist_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.SecurityAndNetworking.iPBlocklistAsync") iPBlocklistAsync

> The IP Blocklist API will detect potentially malicious or dangerous IP addresses. See: https://www.neutrinoapi.com/api/ip-blocklist/


```java
void iPBlocklistAsync(
        final String ip,
        final APICallBack<IPBlocklistResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| ip |  ``` Required ```  | An IPv4 or IPv6 address |


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


### <a name="host_reputation_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.SecurityAndNetworking.hostReputationAsync") hostReputationAsync

> Check the reputation of an IP address, domain name, FQDN or URL against a comprehensive list of blacklists and blocklists. See: https://www.neutrinoapi.com/api/host-reputation/


```java
void hostReputationAsync(
        final String host,
        final Integer listRating,
        final APICallBack<HostReputationResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| host |  ``` Required ```  | An IP address, domain name, FQDN or URL. If you supply a domain/URL it will be checked against the URI DNSBL lists |
| listRating |  ``` Optional ```  ``` DefaultValue ```  | Only check lists with this rating or better |


#### Example Usage

```java
String host = "host";
Integer listRating = 3;
// Invoking the API call with sample inputs
securityAndNetworking.hostReputationAsync(host, listRating, new APICallBack<HostReputationResponse>() {
    public void onSuccess(HttpContext context, HostReputationResponse response) {
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

> Convert a geographic coordinate (latitude and longitude) into a real world address. See: https://www.neutrinoapi.com/api/geocode-reverse/


```java
void geocodeReverseAsync(
        final String latitude,
        final String longitude,
        final String languageCode,
        final String zoom,
        final APICallBack<GeocodeReverseResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| latitude |  ``` Required ```  | The location latitude in decimal degrees format |
| longitude |  ``` Required ```  | The location longitude in decimal degrees format |
| languageCode |  ``` Optional ```  ``` DefaultValue ```  | The language to display results in, available languages are: <ul> <li>de, en, es, fr, it, pt, ru</li> </ul> |
| zoom |  ``` Optional ```  ``` DefaultValue ```  | The zoom level to respond with: <ul> <li>address - the most precise address available</li> <li>street - the street level</li> <li>city - the city level</li> <li>state - the state level</li> <li>country - the country level</li> </ul> |


#### Example Usage

```java
String latitude = "latitude";
String longitude = "longitude";
String languageCode = "en";
String zoom = "address";
// Invoking the API call with sample inputs
geolocation.geocodeReverseAsync(latitude, longitude, languageCode, zoom, new APICallBack<GeocodeReverseResponse>() {
    public void onSuccess(HttpContext context, GeocodeReverseResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="i_p_info_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.Geolocation.iPInfoAsync") iPInfoAsync

> Get location information about an IP address and do reverse DNS (PTR) lookups. See: https://www.neutrinoapi.com/api/ip-info/


```java
void iPInfoAsync(
        final String ip,
        final Boolean reverseLookup,
        final APICallBack<IPInfoResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| ip |  ``` Required ```  | IPv4 or IPv6 address |
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


### <a name="geocode_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.Geolocation.geocodeAddressAsync") geocodeAddressAsync

> Geocode an address, partial address or just the name of a place. See: https://www.neutrinoapi.com/api/geocode-address/


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
| address |  ``` Required ```  | The address, partial address or name of a place to try and locate |
| countryCode |  ``` Optional ```  | The ISO 2-letter country code to be biased towards (the default is no country bias) |
| languageCode |  ``` Optional ```  ``` DefaultValue ```  | The language to display results in, available languages are: <ul> <li>de, en, es, fr, it, pt, ru</li> </ul> |
| fuzzySearch |  ``` Optional ```  ``` DefaultValue ```  | If no matches are found for the given address, start performing a recursive fuzzy search until a geolocation is found. This option is recommended for processing user input or implementing auto-complete. We use a combination of approximate string matching and data cleansing to find possible location matches |


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
| customerIp |  ``` Optional ```  | Pass in the customers IP address and we will return some extra information about them |


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

## <a name="www"></a>![Class: ](https://apidocs.io/img/class.png "com.neutrinoapi.sdk.controllers.WWW") WWW

### Get singleton instance

The singleton instance of the ``` WWW ``` class can be accessed from the API Client.

```java
WWW wWW = client.getWWW();
```

### <a name="u_rl_info_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.WWW.uRLInfoAsync") uRLInfoAsync

> Parse, analyze and retrieve content from the supplied URL. See: https://www.neutrinoapi.com/api/url-info/


```java
void uRLInfoAsync(
        final String url,
        final Boolean fetchContent,
        final Boolean ignoreCertificateErrors,
        final Integer timeout,
        final APICallBack<URLInfoResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| url |  ``` Required ```  | The URL to probe |
| fetchContent |  ``` Optional ```  ``` DefaultValue ```  | If this URL responds with html, text, json or xml then return the response. This option is useful if you want to perform further processing on the URL content (e.g. with the HTML Extract or HTML Clean APIs) |
| ignoreCertificateErrors |  ``` Optional ```  ``` DefaultValue ```  | Ignore any TLS/SSL certificate errors and load the URL anyway |
| timeout |  ``` Optional ```  ``` DefaultValue ```  | Timeout in seconds. Give up if still trying to load the URL after this number of seconds |


#### Example Usage

```java
String url = "url";
Boolean fetchContent = false;
Boolean ignoreCertificateErrors = false;
Integer timeout = 20;
// Invoking the API call with sample inputs
wWW.uRLInfoAsync(url, fetchContent, ignoreCertificateErrors, timeout, new APICallBack<URLInfoResponse>() {
    public void onSuccess(HttpContext context, URLInfoResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="h_tml_clean_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.WWW.hTMLCleanAsync") hTMLCleanAsync

> Clean and sanitize untrusted HTML. See: https://www.neutrinoapi.com/api/html-clean/


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
| outputType |  ``` Required ```  | The level of sanitization, possible values are: <b>plain-text</b>: reduce the content to plain text only (no HTML tags at all) <b>simple-text</b>: allow only very basic text formatting tags like b, em, i, strong, u <b>basic-html</b>: allow advanced text formatting and hyper links <b>basic-html-with-images</b>: same as basic html but also allows image tags <b>advanced-html</b>: same as basic html with images but also allows many more common HTML tags like table, ul, dl, pre |


#### Example Usage

```java
String content = "content";
String outputType = "output-type";
// Invoking the API call with sample inputs
wWW.hTMLCleanAsync(content, outputType, new APICallBack<InputStream>() {
    public void onSuccess(HttpContext context, InputStream response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="browser_bot_async"></a>![Method: ](https://apidocs.io/img/method.png "com.neutrinoapi.sdk.controllers.WWW.browserBotAsync") browserBotAsync

> Browser bot can extract content, interact with keyboard and mouse events, and execute JavaScript on a website. See: https://www.neutrinoapi.com/api/browser-bot/


```java
void browserBotAsync(
        final String url,
        final Integer timeout,
        final Integer delay,
        final String selector,
        final List<String> exec,
        final String userAgent,
        final Boolean ignoreCertificateErrors,
        final APICallBack<BrowserBotResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| url |  ``` Required ```  | The URL to load |
| timeout |  ``` Optional ```  ``` DefaultValue ```  | Timeout in seconds. Give up if still trying to load the page after this number of seconds |
| delay |  ``` Optional ```  ``` DefaultValue ```  | Delay in seconds to wait before capturing any page data, executing selectors or JavaScript |
| selector |  ``` Optional ```  | Extract content from the page DOM using this selector. Commonly known as a CSS selector, you can find a good reference <a href="https://www.w3schools.com/cssref/css_selectors.asp">here</a> |
| exec |  ``` Optional ```  ``` Collection ```  | Execute JavaScript on the page. Each array element should contain a valid JavaScript statement in string form. If a statement returns any kind of value it will be returned in the 'exec-results' response. For your convenience you can also use the following special shortcut functions: <div> sleep(seconds); Just wait/sleep for the specified number of seconds. click('selector'); Click on the first element matching the given selector. focus('selector'); Focus on the first element matching the given selector. keys('characters'); Send the specified keyboard characters. Use click() or focus() first to send keys to a specific element. enter(); Send the Enter key. tab(); Send the Tab key. </div> Example: <div> [ "click('#button-id')", "sleep(1)", "click('.field-class')", "keys('1234')", "enter()" ] </div> |
| userAgent |  ``` Optional ```  | Override the browsers default user-agent string with this one |
| ignoreCertificateErrors |  ``` Optional ```  ``` DefaultValue ```  | Ignore any TLS/SSL certificate errors and load the page anyway |


#### Example Usage

```java
String url = "url";
Integer timeout = 30;
Integer delay = 3;
String selector = "selector";
List<String> exec = new LinkedList<String>(Arrays.asList("exec"));
String userAgent = "user-agent";
Boolean ignoreCertificateErrors = false;
// Invoking the API call with sample inputs
wWW.browserBotAsync(url, timeout, delay, selector, exec, userAgent, ignoreCertificateErrors, new APICallBack<BrowserBotResponse>() {
    public void onSuccess(HttpContext context, BrowserBotResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)



