package com.lixiang.chuangjianzhemode.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class Builder {
    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for(int i=0; i<count; i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
        }
    }
}
