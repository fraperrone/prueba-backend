
package com.portfolio.mgb.Repository;

import com.portfolio.mgb.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkills extends JpaRepository<Skills,Long> {
    
}
