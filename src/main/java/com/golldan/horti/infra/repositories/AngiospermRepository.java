package com.golldan.horti.infra.repositories;

import com.golldan.horti.infra.entities.AngiospermEntity;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface AngiospermRepository extends CRUDRepository<AngiospermEntity, Integer> {}
