package com.codeman.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeman.domain.User;
import com.codeman.entity.IndexResult;
import com.codeman.mapper.ArticleMapper;
import com.codeman.mapper.CommentMapper;
import com.codeman.mapper.UserMapper;
import com.codeman.service.IndexService;
import constant.Role;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@AllArgsConstructor
public class IndexServiceImpl extends ServiceImpl<UserMapper, User> implements IndexService {

    private ArticleMapper articleMapper;
    private CommentMapper commentMapper;

    @Override
    public IndexResult index(User user) {
        IndexResult indexResult = new IndexResult();
        Integer id = null;
        if (!Role.ADMIN.getVal().equals(user.getUserRole())) {
            id = user.getUserId();
        }
        indexResult.setArticleList(articleMapper.selectList(null));
        indexResult.setCommentList(commentMapper.selectList(null));
        return indexResult;
    }

}
