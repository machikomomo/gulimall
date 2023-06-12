package cn.odyssey.gulimall.gulimallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.odyssey.gulimall.gulimallmember.entity.MemberLevelEntity;
import utils.PageUtils;

import java.util.Map;

/**
 * 会员等级
 *
 * @author momoka
 * @email whatever@gmail.com
 * @date 2023-06-12 13:58:03
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

