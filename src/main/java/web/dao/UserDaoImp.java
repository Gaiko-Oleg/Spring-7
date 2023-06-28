package web.dao;

import org.springframework.stereotype.Component;
import web.models.Person;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
public class PersonDAO implements UserDAO{

    @PersistenceContext
    private EntityManager entityManager;




    @Override
    public List<Person> listUsers() {
        TypedQuery<Person> query = entityManager.createQuery("select p from Person p", Person.class);
        return query.getResultList();
    }

    @Override
    public Person findById(long id) {
        return entityManager.find(Person.class, id);
    }

    @Override
    public void add(Person person) {
        entityManager.persist(person);
    }

    @Override
    public void update(Person person) {
        entityManager.merge(person);
    }

    @Override
    public void deleteById(long id) {
        entityManager.remove(findById(id));
    }
}