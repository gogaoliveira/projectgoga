package douglasoliveiraprojectgoga.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import douglasoliveiraprojectgoga.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
