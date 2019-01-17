package love.wangqi;

import io.github.wangqifox.feign.FeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Map;

/**
 * @author: wangqi
 * @description:
 * @date: Created in 2019-01-08 09:54
 */
@FeignClient(url = "http://127.0.0.1:8083")
public interface ArticleClient {
    Logger logger = LoggerFactory.getLogger(ArticleClient.class);

    @GetMapping("/api/articles/{article_id}/comments")
    Map getComments(
            @PathVariable("article_id") String articleId,
            @RequestParam(value = "user_id") String userId,
            @RequestParam(value = "last_sort_number", required = false) Long lastSortNumber,
            @RequestParam(value = "size", required = false, defaultValue = "20") Integer size
    );

}
