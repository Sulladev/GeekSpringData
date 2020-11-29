package ru.pirozhkov.spring_data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pirozhkov.spring_data.entity.CartEntry;

@Repository
public interface CartEntryRepository extends JpaRepository<CartEntry, Integer> {

}
