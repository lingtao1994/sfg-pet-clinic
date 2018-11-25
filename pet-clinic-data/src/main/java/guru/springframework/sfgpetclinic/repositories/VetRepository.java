package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author LT
 * @Date on 2018/11/25
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
