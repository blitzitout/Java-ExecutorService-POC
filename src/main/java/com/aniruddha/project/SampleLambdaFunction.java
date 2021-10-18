package com.aniruddha.project;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.SNSEvent;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SampleLambdaFunction implements RequestHandler<SNSEvent, Object>{

    private static final String DATE_FORMAT = "yyyy-MM-dd_HH:mm:ss";

    public Object handleRequest(SNSEvent request, Context context){
        String timeStamp = new SimpleDateFormat(DATE_FORMAT).format(Calendar.getInstance().getTime());
        context.getLogger().log("Invocation started: " + timeStamp);
        context.getLogger().log(request.getRecords().get(0).getSNS().getMessage());

        timeStamp = new SimpleDateFormat(DATE_FORMAT).format(Calendar.getInstance().getTime());
        context.getLogger().log("Invocation completed: " + timeStamp);
        return "123";
    }

}
