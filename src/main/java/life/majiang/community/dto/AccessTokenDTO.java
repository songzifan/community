package life.majiang.community.dto;

import lombok.Data;

/**
 * Created by Kiss on 2019/9/3 0003.
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
