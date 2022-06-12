package kz.springpro.msscbakery.repository;

import kz.springpro.msscbakery.entities.Bakery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BakeryRepository extends JpaRepository<Bakery, UUID> {

}
