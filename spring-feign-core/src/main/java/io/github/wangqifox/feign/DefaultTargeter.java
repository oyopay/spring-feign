package io.github.wangqifox.feign;

import feign.Feign;
import feign.Target;

/**
 * @author: wangqi
 * @description:
 * @date: Created in 2019-01-10 19:21
 */
public class DefaultTargeter implements Targeter {

    @Override
    public <T> T target(FeignClientFactoryBean factory, Feign.Builder feign, FeignContext context,
                        Target.HardCodedTarget<T> target) {
        return feign.target(target);
    }
}
