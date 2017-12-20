package com.ihowq.wordpress.api;

import com.ihowq.wordpress.api.dao.PostDao;
import com.ihowq.wordpress.api.model.pojo.post.PostQuery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Dao测试类
 *
 * @author howq
 * @Date 2017年11月28日 下午6:34:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WordPressApiApp.class)
public class QueryTest {

    @Resource
    private PostDao postDao;

    @Test
    public void queryTest() {
        PostQuery postQuery = new PostQuery();
        postQuery.createCriteria()
                .andPostDateIsNull()
                .andCommentCountBetween(1L, 2L);
        postDao.selectByQuery(postQuery);
    }
}
