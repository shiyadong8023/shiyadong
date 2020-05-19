package com.example.demo.test;

/**
 * @desc:生产者
 * @author: syd
 * @Date: 2020/5/19  10:45
 **/
public class Producer implements Runnable {
    private Resource resource;

    public Producer(Resource resource){
        this.resource = resource;
    }
    @Override
    public void run() {

        while (true){
            resource.put();
        }
    }
}
