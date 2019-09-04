package life.majiang.community.model;

import lombok.Data;

/**
 * Created by Kiss on 2019/9/4 0004.
 */
@Data
public class Question {
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
}
