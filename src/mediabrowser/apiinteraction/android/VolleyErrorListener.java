package mediabrowser.apiinteraction.android;

import com.android.volley.Response;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import mediabrowser.model.logging.ILogger;
import mediabrowser.model.net.HttpException;

public class VolleyErrorListener implements Response.ErrorListener {

    private mediabrowser.apiinteraction.Response<String> outerResponse;
    private ILogger logger;

    public VolleyErrorListener(mediabrowser.apiinteraction.Response<String> outerResponse, ILogger logger) {
        this.outerResponse = outerResponse;
        this.logger = logger;
    }

    @Override
    public void onErrorResponse(VolleyError error) {

        String messagePrefix = "VolleyError "+error.getClass().getName()+": ";

        logger.ErrorException(messagePrefix + error.getMessage(), error);

/*                if (error instanceof TimeoutError) {
                    logger.Error("VolleyError TimeoutError: ", error.getMessage());
                } else if (error instanceof NoConnectionError) {
                    logger.Error("VolleyError NoConnectionError: ", error.getMessage());
                } else if (error instanceof AuthFailureError) {
                    logger.Error("VolleyError AuthFailureError: ", error.getMessage());
                } else if (error instanceof ServerError) {
                    logger.Error("VolleyError ServerError: ", error.getMessage());
                } else if (error instanceof NetworkError) {
                    logger.Error("VolleyError NetworkError: ", error.getMessage());
                } else if (error instanceof ParseError) {
                    logger.Error("VolleyError ParseError: ", error.getMessage());
                }*/

        HttpException httpException = new HttpException(messagePrefix, error);

        if (error.networkResponse != null) {

            httpException.setStatusCode(error.networkResponse.statusCode);
            httpException.setHeaders(error.networkResponse.headers);
        }

        if (error instanceof TimeoutError) {
            httpException.setIsTimedOut(true);
        }

        outerResponse.onError(httpException);
    }
}
