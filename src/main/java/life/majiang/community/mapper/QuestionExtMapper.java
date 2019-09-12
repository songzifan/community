package life.majiang.community.mapper;

import life.majiang.community.model.Question;

/**
 * Created by Kiss on 2019/9/11 0011.
 */
public interface QuestionExtMapper {
    int incView(Question record);
    int incCommentCount(Question question);
}
