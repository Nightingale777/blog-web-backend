package com.yupi.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.Article;
import com.yupi.usercenter.service.ArticleService;
import com.yupi.usercenter.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

/**
* @author 7
* @description 针对表【article(文章)】的数据库操作Service实现
* @createDate 2022-05-24 08:30:17
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService{

}




