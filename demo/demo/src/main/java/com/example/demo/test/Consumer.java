package com.example.demo.test;

/**
 * @desc:
 * @author: syd
 * @Date: 2020/5/19  10:48
 **/
public class Consumer implements Runnable {

    private Resource resource;

    public Consumer(Resource resource){
        this.resource = resource;
    }
    @Override
    public void run() {
        resource.remove();
    }
}
