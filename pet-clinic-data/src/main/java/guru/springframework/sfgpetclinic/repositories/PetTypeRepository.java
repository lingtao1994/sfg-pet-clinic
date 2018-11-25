package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * @author LT
 * @Date on 2018/11/25
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
