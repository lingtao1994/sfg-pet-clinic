package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * @author LT
 * @Date on 2018/11/20
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
