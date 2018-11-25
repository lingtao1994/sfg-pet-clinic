package guru.springframework.sfgpetclinic.model;

/**
 * @author LT
 * @Date on 2018/11/25
 */
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
