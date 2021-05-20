
package crud.repo;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findAllBy(Pageable pageable);
    
    List<Employee> findByNameLikeIgnoreCase(String nameFilter);

    List<Employee> findByNameLikeIgnoreCase(String nameFilter, Pageable pageable);
    
    long countByNameLikeIgnoreCase(String nameFilter);

}
