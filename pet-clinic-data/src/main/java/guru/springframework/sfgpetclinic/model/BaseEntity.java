package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * @author LT
 * @Date on 2018/11/20
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
