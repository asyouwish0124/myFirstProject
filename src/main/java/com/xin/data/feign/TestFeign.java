package com.xin.data.feign;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xin.foundation.model.RestResponse;

@FeignClient(value = "auth-v1")
public interface TestFeign {

    @RequestMapping(value = "/Auths/list", method = RequestMethod.GET)
    public RestResponse<List<String>> getPurchaseReturnOrderById(@RequestParam("user_id")String userId,
            @RequestParam("a_id")Long aId,@RequestParam("ip")String ip,@RequestParam("request")HttpServletRequest request);
}
