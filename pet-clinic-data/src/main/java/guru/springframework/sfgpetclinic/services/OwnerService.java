package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * @author LT
 * @Date on 2018/11/20
 */
public interface OwnerService {

    Owner findById(Long id);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
