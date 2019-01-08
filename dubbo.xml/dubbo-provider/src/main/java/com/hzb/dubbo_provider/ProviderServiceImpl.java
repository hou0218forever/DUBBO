package com.hzb.dubbo_provider;

import com.hzb.service.ProviderService;

public class ProviderServiceImpl implements ProviderService {  
  
    public String sayHello(String name) {         
        return "Hello:"+name+"你好，你好~~";  
    }  
  
}