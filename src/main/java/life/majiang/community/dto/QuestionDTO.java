package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * Created by Kiss on 2019/9/5 0005.
 */
@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private Long gmtCreate;
    private Long gmtModified;
    private String tag;
    private Integer creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private User user;
}
