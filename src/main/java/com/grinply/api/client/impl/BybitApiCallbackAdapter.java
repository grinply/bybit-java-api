package com.grinply.api.client.impl;

import com.grinply.api.client.restApi.BybitApiCallback;
import com.grinply.api.client.exception.BybitApiError;
import com.grinply.api.client.exception.BybitApiException;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

import static com.grinply.api.client.service.BybitApiServiceGenerator.getBybitApiError;

public class BybitApiCallbackAdapter<T> implements Callback<T> {

    private final BybitApiCallback<T> callback;

    public BybitApiCallbackAdapter(BybitApiCallback<T> callback) {
        this.callback = callback;
    }

    public void onResponse(@NotNull Call<T> call, Response<T> response) {
        if (response.isSuccessful()) {
            callback.onResponse(response.body());
        } else {
            if (response.code() == 504) {
                // HTTP 504 return code is used when the API successfully sent the message but not get a response within the timeout period.
                // It is important to NOT treat this as a failure; the execution status is UNKNOWN and could have been a success.
                return;
            }
            try {
                BybitApiError apiError = getBybitApiError(response);
                onFailure(call, new BybitApiException(apiError));
            } catch (IOException e) {
                onFailure(call, new BybitApiException(e));
            }
        }
    }

    @Override
    public void onFailure(@NotNull Call<T> call, @NotNull Throwable throwable) {
        if (throwable instanceof BybitApiException) {
            callback.onFailure(throwable);
        } else {
            callback.onFailure(new BybitApiException(throwable));
        }
    }
}
