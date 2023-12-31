package com.mojafa.user_mgmt_microservice.repositories;

import com.mojafa.user_mgmt_microservice.entities.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

    Optional<Role> findByRole(String role);

    @Query(value = "select count(*) from users_roles where role_id = ?1", nativeQuery = true)
    Long countRoleUsage(Long roleId);

}
