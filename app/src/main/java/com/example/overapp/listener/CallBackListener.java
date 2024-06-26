package com.example.overapp.listener;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Response;

public interface CallBackListener {

    public void onFailure(Call call, IOException e);

    public void onResponse(Call call, Response response) throws IOException;

}
