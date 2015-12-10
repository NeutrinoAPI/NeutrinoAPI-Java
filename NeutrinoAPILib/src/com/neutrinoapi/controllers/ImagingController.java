/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 12/10/2015
 */
package com.neutrinoapi.controllers;

import java.io.*;
import java.util.*;

import com.neutrinoapi.http.client.HttpClient;

import com.neutrinoapi.http.request.HttpRequest;
import com.neutrinoapi.http.response.HttpResponse;
import com.neutrinoapi.http.response.HttpStringResponse;
import com.neutrinoapi.*;
import com.neutrinoapi.models.*;

public class ImagingController extends BaseController {

    //private fields for configuration

   /** Your user ID */
    private String userId;

   /** Your API key */
    private String apiKey;

   /**
    * Constructor with authentication and configuration parameters */
    public ImagingController (String userId, String apiKey) {
        this.userId = userId;
        this.apiKey = apiKey;
    }

   /**
    * Constructor with authentication and configuration parameters */
    public ImagingController (HttpClient _client, String userId, String apiKey) {
        super(_client);
        this.userId = userId;
        this.apiKey = apiKey;
    }

    /**
     * Generate a QR code as a PNG image. See: https://www.neutrinoapi.com/api/qr-code/
     * @param    content    Required parameter: The content to encode into the QR code (e.g. a URL or a phone number)
     * @param    bgColor    Optional parameter: The QR code background color (you should always use a light color for this)
     * @param    fgColor    Optional parameter: The QR code foreground color (you should always use a dark color for this)
     * @param    height    Optional parameter: The height of the QR code (in px)
     * @param    width    Optional parameter: The width of the QR code (in px)
	 * @return	Returns the InputStream response from the API call*/
    public InputStream createQRCode(
            final String content,
            final String bgColor,
            final String fgColor,
            final Integer height,
            final Integer width
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/qr-code");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4997532735382488569L;
            {
                    put( "width", (null != width) ? width : 250 );
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5256148039764448939L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5450408538139143192L;
            {
                    put( "content", content );
                    put( "bg-color", (null != bgColor) ? bgColor : "#ffffff" );
                    put( "fg-color", (null != fgColor) ? fgColor : "#000000" );
                    put( "height", (null != height) ? height : 250 );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.post(queryUrl, headers, APIHelper.prepareFormFields(parameters));

        //invoke request and get response
        HttpResponse response = clientInstance.executeAsBinary(request);

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();
        if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        InputStream result = response.getRawBody();
        return result;
    }
        
    /**
     * Convert HTML content into PDF documents. See: https://www.neutrinoapi.com/api/html-to-pdf/
     * @param    content    Required parameter: The HTML content. This can be either a URL to load HTML from or an actual HTML content string
     * @param    htmlWidth    Optional parameter: The width (in px) to render the HTML document at
     * @param    margin    Optional parameter: The PDF document margin (in mm)
     * @param    title    Optional parameter: The PDF document title
	 * @return	Returns the InputStream response from the API call*/
    public InputStream createHTMLToPDF(
            final String content,
            final Integer htmlWidth,
            final Integer margin,
            final String title
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/html-to-pdf");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4770042459834052074L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5347682667188275886L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5701624416809731331L;
            {
                    put( "content", content );
                    put( "html-width", (null != htmlWidth) ? htmlWidth : 1024 );
                    put( "margin", (null != margin) ? margin : 10 );
                    put( "title", title );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.post(queryUrl, headers, APIHelper.prepareFormFields(parameters));

        //invoke request and get response
        HttpResponse response = clientInstance.executeAsBinary(request);

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();
        if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        InputStream result = response.getRawBody();
        return result;
    }
        
    /**
     * Resize an image and output as either JPEG or PNG. See: https://www.neutrinoapi.com/api/image-resize/
     * @param    height    Required parameter: Height to resize to (in px)
     * @param    imageUrl    Required parameter: The URL to the source image
     * @param    width    Required parameter: Width to resize to (in px)
     * @param    format    Optional parameter: The output image format, can be either png or jpg
	 * @return	Returns the InputStream response from the API call*/
    public InputStream createImageResize(
            final int height,
            final String imageUrl,
            final int width,
            final String format
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/image-resize");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5501925533187350149L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5654156307544615933L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4846783632228337982L;
            {
                    put( "height", height );
                    put( "image-url", imageUrl );
                    put( "width", width );
                    put( "format", (null != format) ? format : "png" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.post(queryUrl, headers, APIHelper.prepareFormFields(parameters));

        //invoke request and get response
        HttpResponse response = clientInstance.executeAsBinary(request);

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();
        if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        InputStream result = response.getRawBody();
        return result;
    }
        
    /**
     * Watermark one image with another image. See: https://www.neutrinoapi.com/api/image-watermark/
     * @param    imageUrl    Required parameter: The URL to the source image
     * @param    watermarkUrl    Required parameter: The URL to the watermark image
     * @param    format    Optional parameter: The output image format, can be either png or jpg
     * @param    height    Optional parameter: If set resize the resulting image to this height (preserving aspect ratio)
     * @param    opacity    Optional parameter: The opacity of the watermark (0 to 100)
     * @param    position    Optional parameter: The position of the watermark image, possible values are: center, top-left, top-center, top-right, bottom-left, bottom-center, bottom-right
     * @param    width    Optional parameter: If set resize the resulting image to this width (preserving aspect ratio)
	 * @return	Returns the InputStream response from the API call*/
    public InputStream createImageWatermark(
            final String imageUrl,
            final String watermarkUrl,
            final String format,
            final Integer height,
            final Integer opacity,
            final String position,
            final Integer width
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/image-watermark");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5108103487726376612L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5189406911922455358L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5676133075879430857L;
            {
                    put( "image-url", imageUrl );
                    put( "watermark-url", watermarkUrl );
                    put( "format", (null != format) ? format : "png" );
                    put( "height", height );
                    put( "opacity", (null != opacity) ? opacity : 50 );
                    put( "position", (null != position) ? position : "center" );
                    put( "width", width );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.post(queryUrl, headers, APIHelper.prepareFormFields(parameters));

        //invoke request and get response
        HttpResponse response = clientInstance.executeAsBinary(request);

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();
        if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        InputStream result = response.getRawBody();
        return result;
    }
        
}