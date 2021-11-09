package co.edu.unbosque.securitytutorial.jpa.repositories;

import co.edu.unbosque.securitytutorial.jpa.entities.Owner;
import co.edu.unbosque.securitytutorial.jpa.entities.Vet;

import javax.persistence.EntityManager;
import java.util.Optional;

public class VetRepositoryImpl implements VetRepository {

    private EntityManager entityManager;

    public VetRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<Vet> save(Vet vet) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(vet);
            entityManager.getTransaction().commit();
            return Optional.of(vet);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

}
