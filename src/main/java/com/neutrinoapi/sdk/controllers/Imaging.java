/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import com.neutrinoapi.sdk.*;
import com.neutrinoapi.sdk.models.*;
import com.neutrinoapi.sdk.exceptions.*;
import com.neutrinoapi.sdk.http.client.HttpClient;
import com.neutrinoapi.sdk.http.client.HttpContext;
import com.neutrinoapi.sdk.http.request.HttpRequest;
import com.neutrinoapi.sdk.http.response.HttpResponse;
import com.neutrinoapi.sdk.http.response.HttpStringResponse;
import com.neutrinoapi.sdk.http.client.APICallBack;
import com.neutrinoapi.sdk.controllers.syncwrapper.APICallBackCatcher;

public class Imaging extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static Imaging instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the Imaging class 
     */
    public static Imaging getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new Imaging();
                }
            }
        }
        return instance;
    }

    /**
     * Resize an image and output as either JPEG or PNG. See: https://www.neutrinoapi.com/api/image-resize/
     * @param    imageUrl    Required parameter: The URL to the source image
     * @param    width    Required parameter: The width to resize to (in px) while preserving aspect ratio
     * @param    height    Required parameter: The height to resize to (in px) while preserving aspect ratio
     * @param    format    Optional parameter: The output image format, can be either png or jpg
     * @return    Returns the InputStream response from the API call 
     */
    public InputStream imageResize(
                final String imageUrl,
                final int width,
                final int height,
                final String format
    ) throws Throwable {

        HttpRequest _request = _buildImageResizeRequest(imageUrl, width, height, format);
        HttpResponse _response = getClientInstance().executeAsBinary(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleImageResizeResponse(_context);
    }

    /**
     * Resize an image and output as either JPEG or PNG. See: https://www.neutrinoapi.com/api/image-resize/
     * @param    imageUrl    Required parameter: The URL to the source image
     * @param    width    Required parameter: The width to resize to (in px) while preserving aspect ratio
     * @param    height    Required parameter: The height to resize to (in px) while preserving aspect ratio
     * @param    format    Optional parameter: The output image format, can be either png or jpg
     * @return    Returns the void response from the API call 
     */
    public void imageResizeAsync(
                final String imageUrl,
                final int width,
                final int height,
                final String format,
                final APICallBack<InputStream> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildImageResizeRequest(imageUrl, width, height, format);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsBinaryAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            InputStream returnValue = _handleImageResizeResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for imageResize
     */
    private HttpRequest _buildImageResizeRequest(
                final String imageUrl,
                final int width,
                final int height,
                final String format) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/image-resize");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("user-id", Configuration.userId);
        _queryParameters.put("api-key", Configuration.apiKey);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("user-agent", BaseController.userAgent);


        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>();
        _parameters.put("image-url", imageUrl);
        _parameters.put("width", width);
        _parameters.put("height", height);
        if (format != null) {
            _parameters.put("format", (format != null) ? format : "png");
        }

        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for imageResize
     * @return An object of type void
     */
    private InputStream _handleImageResizeResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        InputStream _result = _response.getRawBody();
        return _result;
    }

    /**
     * Generate a QR code as a PNG image. See: https://www.neutrinoapi.com/api/qr-code/
     * @param    content    Required parameter: The content to encode into the QR code (e.g. a URL or a phone number)
     * @param    width    Optional parameter: The width of the QR code (in px)
     * @param    height    Optional parameter: The height of the QR code (in px)
     * @param    fgColor    Optional parameter: The QR code foreground color
     * @param    bgColor    Optional parameter: The QR code background color
     * @return    Returns the InputStream response from the API call 
     */
    public InputStream qRCode(
                final String content,
                final Integer width,
                final Integer height,
                final String fgColor,
                final String bgColor
    ) throws Throwable {

        HttpRequest _request = _buildQRCodeRequest(content, width, height, fgColor, bgColor);
        HttpResponse _response = getClientInstance().executeAsBinary(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleQRCodeResponse(_context);
    }

    /**
     * Generate a QR code as a PNG image. See: https://www.neutrinoapi.com/api/qr-code/
     * @param    content    Required parameter: The content to encode into the QR code (e.g. a URL or a phone number)
     * @param    width    Optional parameter: The width of the QR code (in px)
     * @param    height    Optional parameter: The height of the QR code (in px)
     * @param    fgColor    Optional parameter: The QR code foreground color
     * @param    bgColor    Optional parameter: The QR code background color
     * @return    Returns the void response from the API call 
     */
    public void qRCodeAsync(
                final String content,
                final Integer width,
                final Integer height,
                final String fgColor,
                final String bgColor,
                final APICallBack<InputStream> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildQRCodeRequest(content, width, height, fgColor, bgColor);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsBinaryAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            InputStream returnValue = _handleQRCodeResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for qRCode
     */
    private HttpRequest _buildQRCodeRequest(
                final String content,
                final Integer width,
                final Integer height,
                final String fgColor,
                final String bgColor) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/qr-code");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("user-id", Configuration.userId);
        _queryParameters.put("api-key", Configuration.apiKey);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("user-agent", BaseController.userAgent);


        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>();
        _parameters.put("content", content);
        if (width != null) {
            _parameters.put("width", (width != null) ? width : 256);
        }
        if (height != null) {
            _parameters.put("height", (height != null) ? height : 256);
        }
        if (fgColor != null) {
            _parameters.put("fg-color", (fgColor != null) ? fgColor : "#000000");
        }
        if (bgColor != null) {
            _parameters.put("bg-color", (bgColor != null) ? bgColor : "#ffffff");
        }

        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for qRCode
     * @return An object of type void
     */
    private InputStream _handleQRCodeResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        InputStream _result = _response.getRawBody();
        return _result;
    }

    /**
     * Watermark one image with another image. See: https://www.neutrinoapi.com/api/image-watermark/
     * @param    imageUrl    Required parameter: The URL to the source image
     * @param    watermarkUrl    Required parameter: The URL to the watermark image
     * @param    opacity    Optional parameter: The opacity of the watermark (0 to 100)
     * @param    format    Optional parameter: The output image format, can be either png or jpg
     * @param    position    Optional parameter: The position of the watermark image, possible values are: center, top-left, top-center, top-right, bottom-left, bottom-center, bottom-right
     * @param    width    Optional parameter: If set resize the resulting image to this width (in px) while preserving aspect ratio
     * @param    height    Optional parameter: If set resize the resulting image to this height (in px) while preserving aspect ratio
     * @return    Returns the InputStream response from the API call 
     */
    public InputStream imageWatermark(
                final String imageUrl,
                final String watermarkUrl,
                final Integer opacity,
                final String format,
                final String position,
                final Integer width,
                final Integer height
    ) throws Throwable {

        HttpRequest _request = _buildImageWatermarkRequest(imageUrl, watermarkUrl, opacity, format, position, width, height);
        HttpResponse _response = getClientInstance().executeAsBinary(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleImageWatermarkResponse(_context);
    }

    /**
     * Watermark one image with another image. See: https://www.neutrinoapi.com/api/image-watermark/
     * @param    imageUrl    Required parameter: The URL to the source image
     * @param    watermarkUrl    Required parameter: The URL to the watermark image
     * @param    opacity    Optional parameter: The opacity of the watermark (0 to 100)
     * @param    format    Optional parameter: The output image format, can be either png or jpg
     * @param    position    Optional parameter: The position of the watermark image, possible values are: center, top-left, top-center, top-right, bottom-left, bottom-center, bottom-right
     * @param    width    Optional parameter: If set resize the resulting image to this width (in px) while preserving aspect ratio
     * @param    height    Optional parameter: If set resize the resulting image to this height (in px) while preserving aspect ratio
     * @return    Returns the void response from the API call 
     */
    public void imageWatermarkAsync(
                final String imageUrl,
                final String watermarkUrl,
                final Integer opacity,
                final String format,
                final String position,
                final Integer width,
                final Integer height,
                final APICallBack<InputStream> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildImageWatermarkRequest(imageUrl, watermarkUrl, opacity, format, position, width, height);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsBinaryAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            InputStream returnValue = _handleImageWatermarkResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for imageWatermark
     */
    private HttpRequest _buildImageWatermarkRequest(
                final String imageUrl,
                final String watermarkUrl,
                final Integer opacity,
                final String format,
                final String position,
                final Integer width,
                final Integer height) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/image-watermark");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("user-id", Configuration.userId);
        _queryParameters.put("api-key", Configuration.apiKey);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("user-agent", BaseController.userAgent);


        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>();
        _parameters.put("image-url", imageUrl);
        _parameters.put("watermark-url", watermarkUrl);
        if (opacity != null) {
            _parameters.put("opacity", (opacity != null) ? opacity : 50);
        }
        if (format != null) {
            _parameters.put("format", (format != null) ? format : "png");
        }
        if (position != null) {
            _parameters.put("position", (position != null) ? position : "center");
        }
        if (width != null) {
            _parameters.put("width", width);
        }
        if (height != null) {
            _parameters.put("height", height);
        }

        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for imageWatermark
     * @return An object of type void
     */
    private InputStream _handleImageWatermarkResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        InputStream _result = _response.getRawBody();
        return _result;
    }

    /**
     * Render HTML content to PDF, JPG or PNG. See: https://www.neutrinoapi.com/api/html5-render/
     * @param    content    Required parameter: The HTML content. This can be either a URL to load HTML from or an actual HTML content string
     * @param    format    Optional parameter: Which format to output, available options are: PDF, PNG, JPG
     * @param    pageSize    Optional parameter: Set the document page size, can be one of: A0 - A9, B0 - B10, Comm10E, DLE or Letter
     * @param    title    Optional parameter: The document title
     * @param    margin    Optional parameter: The document margin (in mm)
     * @param    marginLeft    Optional parameter: The document left margin (in mm)
     * @param    marginRight    Optional parameter: The document right margin (in mm)
     * @param    marginTop    Optional parameter: The document top margin (in mm)
     * @param    marginBottom    Optional parameter: The document bottom margin (in mm)
     * @param    landscape    Optional parameter: Set the document to lanscape orientation
     * @param    zoom    Optional parameter: Set the zoom factor when rendering the page (2.0 for double size, 0.5 for half size)
     * @param    grayscale    Optional parameter: Render the final document in grayscale
     * @param    mediaPrint    Optional parameter: Use @media print CSS styles to render the document
     * @param    mediaQueries    Optional parameter: Activate all @media queries before rendering. This can be useful if you wan't to render the mobile version of a responsive website
     * @param    forms    Optional parameter: Generate real (fillable) PDF forms from HTML forms
     * @param    css    Optional parameter: Inject custom CSS into the HTML. e.g. 'body { background-color: red;}'
     * @param    imageWidth    Optional parameter: If rendering to an image format (PNG or JPG) use this image width (in pixels)
     * @param    imageHeight    Optional parameter: If rendering to an image format (PNG or JPG) use this image height (in pixels). The default is automatic which dynamically sets the image height based on the content
     * @param    renderDelay    Optional parameter: Number of milliseconds to wait before rendering the page (can be useful for pages with animations etc)
     * @param    headerTextLeft    Optional parameter: Text to print to the left-hand side header of each page. e.g. 'My header - Page {page_number} of {total_pages}'
     * @param    headerTextCenter    Optional parameter: Text to print to the center header of each page
     * @param    headerTextRight    Optional parameter: Text to print to the right-hand side header of each page
     * @param    headerSize    Optional parameter: The height of your header (in mm)
     * @param    headerFont    Optional parameter: Set the header font. Fonts available: Times, Courier, Helvetica, Arial
     * @param    headerFontSize    Optional parameter: Set the header font size (in pt)
     * @param    headerLine    Optional parameter: Draw a full page width horizontal line under your header
     * @param    footerTextLeft    Optional parameter: Text to print to the left-hand side footer of each page. e.g. 'My footer - Page {page_number} of {total_pages}'
     * @param    footerTextCenter    Optional parameter: Text to print to the center header of each page
     * @param    footerTextRight    Optional parameter: Text to print to the right-hand side header of each page
     * @param    footerSize    Optional parameter: The height of your footer (in mm)
     * @param    footerFont    Optional parameter: Set the footer font. Fonts available: Times, Courier, Helvetica, Arial
     * @param    footerFontSize    Optional parameter: Set the footer font size (in pt)
     * @param    footerLine    Optional parameter: Draw a full page width horizontal line above your footer
     * @param    pageWidth    Optional parameter: Set the PDF page width explicitly (in mm)
     * @param    pageHeight    Optional parameter: Set the PDF page height explicitly (in mm)
     * @return    Returns the InputStream response from the API call 
     */
    public InputStream hTML5Render(
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
                final Integer pageHeight
    ) throws Throwable {

        HttpRequest _request = _buildHTML5RenderRequest(content, format, pageSize, title, margin, marginLeft, marginRight, marginTop, marginBottom, landscape, zoom, grayscale, mediaPrint, mediaQueries, forms, css, imageWidth, imageHeight, renderDelay, headerTextLeft, headerTextCenter, headerTextRight, headerSize, headerFont, headerFontSize, headerLine, footerTextLeft, footerTextCenter, footerTextRight, footerSize, footerFont, footerFontSize, footerLine, pageWidth, pageHeight);
        HttpResponse _response = getClientInstance().executeAsBinary(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleHTML5RenderResponse(_context);
    }

    /**
     * Render HTML content to PDF, JPG or PNG. See: https://www.neutrinoapi.com/api/html5-render/
     * @param    content    Required parameter: The HTML content. This can be either a URL to load HTML from or an actual HTML content string
     * @param    format    Optional parameter: Which format to output, available options are: PDF, PNG, JPG
     * @param    pageSize    Optional parameter: Set the document page size, can be one of: A0 - A9, B0 - B10, Comm10E, DLE or Letter
     * @param    title    Optional parameter: The document title
     * @param    margin    Optional parameter: The document margin (in mm)
     * @param    marginLeft    Optional parameter: The document left margin (in mm)
     * @param    marginRight    Optional parameter: The document right margin (in mm)
     * @param    marginTop    Optional parameter: The document top margin (in mm)
     * @param    marginBottom    Optional parameter: The document bottom margin (in mm)
     * @param    landscape    Optional parameter: Set the document to lanscape orientation
     * @param    zoom    Optional parameter: Set the zoom factor when rendering the page (2.0 for double size, 0.5 for half size)
     * @param    grayscale    Optional parameter: Render the final document in grayscale
     * @param    mediaPrint    Optional parameter: Use @media print CSS styles to render the document
     * @param    mediaQueries    Optional parameter: Activate all @media queries before rendering. This can be useful if you wan't to render the mobile version of a responsive website
     * @param    forms    Optional parameter: Generate real (fillable) PDF forms from HTML forms
     * @param    css    Optional parameter: Inject custom CSS into the HTML. e.g. 'body { background-color: red;}'
     * @param    imageWidth    Optional parameter: If rendering to an image format (PNG or JPG) use this image width (in pixels)
     * @param    imageHeight    Optional parameter: If rendering to an image format (PNG or JPG) use this image height (in pixels). The default is automatic which dynamically sets the image height based on the content
     * @param    renderDelay    Optional parameter: Number of milliseconds to wait before rendering the page (can be useful for pages with animations etc)
     * @param    headerTextLeft    Optional parameter: Text to print to the left-hand side header of each page. e.g. 'My header - Page {page_number} of {total_pages}'
     * @param    headerTextCenter    Optional parameter: Text to print to the center header of each page
     * @param    headerTextRight    Optional parameter: Text to print to the right-hand side header of each page
     * @param    headerSize    Optional parameter: The height of your header (in mm)
     * @param    headerFont    Optional parameter: Set the header font. Fonts available: Times, Courier, Helvetica, Arial
     * @param    headerFontSize    Optional parameter: Set the header font size (in pt)
     * @param    headerLine    Optional parameter: Draw a full page width horizontal line under your header
     * @param    footerTextLeft    Optional parameter: Text to print to the left-hand side footer of each page. e.g. 'My footer - Page {page_number} of {total_pages}'
     * @param    footerTextCenter    Optional parameter: Text to print to the center header of each page
     * @param    footerTextRight    Optional parameter: Text to print to the right-hand side header of each page
     * @param    footerSize    Optional parameter: The height of your footer (in mm)
     * @param    footerFont    Optional parameter: Set the footer font. Fonts available: Times, Courier, Helvetica, Arial
     * @param    footerFontSize    Optional parameter: Set the footer font size (in pt)
     * @param    footerLine    Optional parameter: Draw a full page width horizontal line above your footer
     * @param    pageWidth    Optional parameter: Set the PDF page width explicitly (in mm)
     * @param    pageHeight    Optional parameter: Set the PDF page height explicitly (in mm)
     * @return    Returns the void response from the API call 
     */
    public void hTML5RenderAsync(
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
                final APICallBack<InputStream> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildHTML5RenderRequest(content, format, pageSize, title, margin, marginLeft, marginRight, marginTop, marginBottom, landscape, zoom, grayscale, mediaPrint, mediaQueries, forms, css, imageWidth, imageHeight, renderDelay, headerTextLeft, headerTextCenter, headerTextRight, headerSize, headerFont, headerFontSize, headerLine, footerTextLeft, footerTextCenter, footerTextRight, footerSize, footerFont, footerFontSize, footerLine, pageWidth, pageHeight);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsBinaryAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            InputStream returnValue = _handleHTML5RenderResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for hTML5Render
     */
    private HttpRequest _buildHTML5RenderRequest(
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
                final Integer pageHeight) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/html5-render");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("user-id", Configuration.userId);
        _queryParameters.put("api-key", Configuration.apiKey);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("user-agent", BaseController.userAgent);


        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>();
        _parameters.put("output-case", "camel");
        _parameters.put("content", content);
        if (format != null) {
            _parameters.put("format", (format != null) ? format : "PDF");
        }
        if (pageSize != null) {
            _parameters.put("page-size", (pageSize != null) ? pageSize : "A4");
        }
        if (title != null) {
            _parameters.put("title", title);
        }
        if (margin != null) {
            _parameters.put("margin", (margin != null) ? margin : 0);
        }
        if (marginLeft != null) {
            _parameters.put("margin-left", (marginLeft != null) ? marginLeft : 0);
        }
        if (marginRight != null) {
            _parameters.put("margin-right", (marginRight != null) ? marginRight : 0);
        }
        if (marginTop != null) {
            _parameters.put("margin-top", (marginTop != null) ? marginTop : 0);
        }
        if (marginBottom != null) {
            _parameters.put("margin-bottom", (marginBottom != null) ? marginBottom : 0);
        }
        if (landscape != null) {
            _parameters.put("landscape", (landscape != null) ? landscape : false);
        }
        if (zoom != null) {
            _parameters.put("zoom", (zoom != null) ? zoom : 1);
        }
        if (grayscale != null) {
            _parameters.put("grayscale", (grayscale != null) ? grayscale : false);
        }
        if (mediaPrint != null) {
            _parameters.put("media-print", (mediaPrint != null) ? mediaPrint : false);
        }
        if (mediaQueries != null) {
            _parameters.put("media-queries", (mediaQueries != null) ? mediaQueries : false);
        }
        if (forms != null) {
            _parameters.put("forms", (forms != null) ? forms : false);
        }
        if (css != null) {
            _parameters.put("css", css);
        }
        if (imageWidth != null) {
            _parameters.put("image-width", (imageWidth != null) ? imageWidth : 1024);
        }
        if (imageHeight != null) {
            _parameters.put("image-height", imageHeight);
        }
        if (renderDelay != null) {
            _parameters.put("render-delay", (renderDelay != null) ? renderDelay : 0);
        }
        if (headerTextLeft != null) {
            _parameters.put("header-text-left", headerTextLeft);
        }
        if (headerTextCenter != null) {
            _parameters.put("header-text-center", headerTextCenter);
        }
        if (headerTextRight != null) {
            _parameters.put("header-text-right", headerTextRight);
        }
        if (headerSize != null) {
            _parameters.put("header-size", (headerSize != null) ? headerSize : 9);
        }
        if (headerFont != null) {
            _parameters.put("header-font", (headerFont != null) ? headerFont : "Courier");
        }
        if (headerFontSize != null) {
            _parameters.put("header-font-size", (headerFontSize != null) ? headerFontSize : 11);
        }
        if (headerLine != null) {
            _parameters.put("header-line", (headerLine != null) ? headerLine : false);
        }
        if (footerTextLeft != null) {
            _parameters.put("footer-text-left", footerTextLeft);
        }
        if (footerTextCenter != null) {
            _parameters.put("footer-text-center", footerTextCenter);
        }
        if (footerTextRight != null) {
            _parameters.put("footer-text-right", footerTextRight);
        }
        if (footerSize != null) {
            _parameters.put("footer-size", (footerSize != null) ? footerSize : 9);
        }
        if (footerFont != null) {
            _parameters.put("footer-font", (footerFont != null) ? footerFont : "Courier");
        }
        if (footerFontSize != null) {
            _parameters.put("footer-font-size", (footerFontSize != null) ? footerFontSize : 11);
        }
        if (footerLine != null) {
            _parameters.put("footer-line", (footerLine != null) ? footerLine : false);
        }
        if (pageWidth != null) {
            _parameters.put("page-width", pageWidth);
        }
        if (pageHeight != null) {
            _parameters.put("page-height", pageHeight);
        }

        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for hTML5Render
     * @return An object of type void
     */
    private InputStream _handleHTML5RenderResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        InputStream _result = _response.getRawBody();
        return _result;
    }

}
