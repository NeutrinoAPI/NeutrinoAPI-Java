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
    private static Object syncObject = new Object();
    private static Imaging instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the Imaging class 
     */
    public static Imaging getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new Imaging();
            }
        }
        return instance;
    }

    /**
     * Resize an image and output as either JPEG or PNG. See: https://www.neutrinoapi.com/api/image-resize/
     * @param    imageUrl    Required parameter: The URL to the source image
     * @param    width    Required parameter: Width to resize to (in px)
     * @param    height    Required parameter: Height to resize to (in px)
     * @param    format    Optional parameter: The output image format, can be either png or jpg
     * @return    Returns the InputStream response from the API call 
     */
    public InputStream imageResize(
                final String imageUrl,
                final int width,
                final int height,
                final String format
    ) throws Throwable {
        APICallBackCatcher<InputStream> callback = new APICallBackCatcher<InputStream>();
        imageResizeAsync(imageUrl, width, height, format, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Resize an image and output as either JPEG or PNG. See: https://www.neutrinoapi.com/api/image-resize/
     * @param    imageUrl    Required parameter: The URL to the source image
     * @param    width    Required parameter: Width to resize to (in px)
     * @param    height    Required parameter: Height to resize to (in px)
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
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/image-resize");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5531773834827436827L;
            {
                    put( "user-id", Configuration.userId );
                    put( "api-key", Configuration.apiKey );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4615434247818177719L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5682038337981389661L;
            {
                    put( "image-url", imageUrl );
                    put( "width", width );
                    put( "height", height );
                    put( "format", (format != null) ? format : "png" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsBinaryAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            InputStream _result = _response.getRawBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Generate a QR code as a PNG image. See: https://www.neutrinoapi.com/api/qr-code/
     * @param    content    Required parameter: The content to encode into the QR code (e.g. a URL or a phone number)
     * @param    width    Optional parameter: The width of the QR code (in px)
     * @param    height    Optional parameter: The height of the QR code (in px)
     * @param    fgColor    Optional parameter: The QR code foreground color (you should always use a dark color for this)
     * @param    bgColor    Optional parameter: The QR code background color (you should always use a light color for this)
     * @return    Returns the InputStream response from the API call 
     */
    public InputStream qRCode(
                final String content,
                final Integer width,
                final Integer height,
                final String fgColor,
                final String bgColor
    ) throws Throwable {
        APICallBackCatcher<InputStream> callback = new APICallBackCatcher<InputStream>();
        qRCodeAsync(content, width, height, fgColor, bgColor, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Generate a QR code as a PNG image. See: https://www.neutrinoapi.com/api/qr-code/
     * @param    content    Required parameter: The content to encode into the QR code (e.g. a URL or a phone number)
     * @param    width    Optional parameter: The width of the QR code (in px)
     * @param    height    Optional parameter: The height of the QR code (in px)
     * @param    fgColor    Optional parameter: The QR code foreground color (you should always use a dark color for this)
     * @param    bgColor    Optional parameter: The QR code background color (you should always use a light color for this)
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
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/qr-code");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5268120146435583045L;
            {
                    put( "width", (width != null) ? width : 250 );
                    put( "user-id", Configuration.userId );
                    put( "api-key", Configuration.apiKey );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5460934021182062730L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5639558844724581753L;
            {
                    put( "content", content );
                    put( "height", (height != null) ? height : 250 );
                    put( "fg-color", (fgColor != null) ? fgColor : "#000000" );
                    put( "bg-color", (bgColor != null) ? bgColor : "#ffffff" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsBinaryAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            InputStream _result = _response.getRawBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Watermark one image with another image. See: https://www.neutrinoapi.com/api/image-watermark/
     * @param    imageUrl    Required parameter: The URL to the source image
     * @param    watermarkUrl    Required parameter: The URL to the watermark image
     * @param    opacity    Optional parameter: The opacity of the watermark (0 to 100)
     * @param    format    Optional parameter: The output image format, can be either png or jpg
     * @param    position    Optional parameter: The position of the watermark image, possible values are: center, top-left, top-center, top-right, bottom-left, bottom-center, bottom-right
     * @param    width    Optional parameter: If set resize the resulting image to this width (preserving aspect ratio)
     * @param    height    Optional parameter: If set resize the resulting image to this height (preserving aspect ratio)
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
        APICallBackCatcher<InputStream> callback = new APICallBackCatcher<InputStream>();
        imageWatermarkAsync(imageUrl, watermarkUrl, opacity, format, position, width, height, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Watermark one image with another image. See: https://www.neutrinoapi.com/api/image-watermark/
     * @param    imageUrl    Required parameter: The URL to the source image
     * @param    watermarkUrl    Required parameter: The URL to the watermark image
     * @param    opacity    Optional parameter: The opacity of the watermark (0 to 100)
     * @param    format    Optional parameter: The output image format, can be either png or jpg
     * @param    position    Optional parameter: The position of the watermark image, possible values are: center, top-left, top-center, top-right, bottom-left, bottom-center, bottom-right
     * @param    width    Optional parameter: If set resize the resulting image to this width (preserving aspect ratio)
     * @param    height    Optional parameter: If set resize the resulting image to this height (preserving aspect ratio)
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
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/image-watermark");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5436081135066723412L;
            {
                    put( "user-id", Configuration.userId );
                    put( "api-key", Configuration.apiKey );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5713327015007829948L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5284992863967352557L;
            {
                    put( "image-url", imageUrl );
                    put( "watermark-url", watermarkUrl );
                    put( "opacity", (opacity != null) ? opacity : 50 );
                    put( "format", (format != null) ? format : "png" );
                    put( "position", (position != null) ? position : "center" );
                    put( "width", width );
                    put( "height", height );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsBinaryAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            InputStream _result = _response.getRawBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Render HTML and HTML5 content to PDF, JPG or PNG
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
                final Double zoom,
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
                final String headerFontSize,
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
        APICallBackCatcher<InputStream> callback = new APICallBackCatcher<InputStream>();
        hTML5RenderAsync(content, format, pageSize, title, margin, marginLeft, marginRight, marginTop, marginBottom, landscape, zoom, grayscale, mediaPrint, mediaQueries, forms, css, imageWidth, imageHeight, renderDelay, headerTextLeft, headerTextCenter, headerTextRight, headerSize, headerFont, headerFontSize, headerLine, footerTextLeft, footerTextCenter, footerTextRight, footerSize, footerFont, footerFontSize, footerLine, pageWidth, pageHeight, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Render HTML and HTML5 content to PDF, JPG or PNG
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
                final Double zoom,
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
                final String headerFontSize,
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
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/html5-render");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4827110839848018745L;
            {
                    put( "user-id", Configuration.userId );
                    put( "api-key", Configuration.apiKey );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5453712910644543885L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5325555968145571167L;
            {
                    put( "output-case", "camel" );
                    put( "content", content );
                    put( "format", (format != null) ? format : "PDF" );
                    put( "page-size", (pageSize != null) ? pageSize : "A4" );
                    put( "title", title );
                    put( "margin", (margin != null) ? margin : 0 );
                    put( "margin-left", (marginLeft != null) ? marginLeft : 0 );
                    put( "margin-right", (marginRight != null) ? marginRight : 0 );
                    put( "margin-top", (marginTop != null) ? marginTop : 0 );
                    put( "margin-bottom", (marginBottom != null) ? marginBottom : 0 );
                    put( "landscape", (landscape != null) ? landscape : false );
                    put( "zoom", (zoom != null) ? zoom : 1.0 );
                    put( "grayscale", (grayscale != null) ? grayscale : false );
                    put( "media-print", (mediaPrint != null) ? mediaPrint : false );
                    put( "media-queries", (mediaQueries != null) ? mediaQueries : false );
                    put( "forms", (forms != null) ? forms : false );
                    put( "css", css );
                    put( "image-width", (imageWidth != null) ? imageWidth : 1024 );
                    put( "image-height", imageHeight );
                    put( "render-delay", renderDelay );
                    put( "header-text-left", headerTextLeft );
                    put( "header-text-center", headerTextCenter );
                    put( "header-text-right", headerTextRight );
                    put( "header-size", (headerSize != null) ? headerSize : 9 );
                    put( "header-font", (headerFont != null) ? headerFont : "Courier" );
                    put( "header-font-size", (headerFontSize != null) ? headerFontSize : "11" );
                    put( "header-line", (headerLine != null) ? headerLine : false );
                    put( "footer-text-left", footerTextLeft );
                    put( "footer-text-center", footerTextCenter );
                    put( "footer-text-right", footerTextRight );
                    put( "footer-size", (footerSize != null) ? footerSize : 9 );
                    put( "footer-font", (footerFont != null) ? footerFont : "Courier" );
                    put( "footer-font-size", (footerFontSize != null) ? footerFontSize : 11 );
                    put( "footer-line", (footerLine != null) ? footerLine : false );
                    put( "page-width", pageWidth );
                    put( "page-height", pageHeight );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsBinaryAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            InputStream _result = _response.getRawBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}