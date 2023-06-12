package cn.odyssey.gulimall.gulimallmember.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import utils.R;

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/gulimallcoupon/coupon/member/list")
    public R memberCoupons();
}
