package ru.job4j.tracker;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class HbmTracker implements Store, AutoCloseable {
    private final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
            .configure().build();
    private final SessionFactory sf = new MetadataSources(registry)
            .buildMetadata().buildSessionFactory();

    @Override
    public void init() {

    }

    @Override
    public Item add(Item item) {
        try(Session session = sf.getCurrentSession()) {
            session.beginTransaction();
            session.save(item);
            session.getTransaction().commit();
            return item;
        }
    }

    @Override
    public boolean replace(String id, Item item) {
        try(Session session = sf.getCurrentSession()) {
            Item result = session.get(Item.class, id);
            if (result != null) {
                result.setName(item.getName());
                session.beginTransaction();
                session.save(result);
                session.getTransaction().commit();
                return true;
            }
            session.close();
            return false;
        }
    }

    @Override
    public boolean delete(String id) {
        try(Session session = sf.getCurrentSession()) {
            Item result = session.get(Item.class, id);
            if (result != null) {
                session.beginTransaction();
                session.delete(result);
                session.getTransaction().commit();
                return true;
            }
            return false;
        }
    }

    @Override
    public boolean deleteAll() {
        return false;
    }

    @Override
    public List<Item> findAll() {
        try(Session session = sf.getCurrentSession()) {
            session.beginTransaction();
            List result = session.createQuery("from ru.job4j.tracker.Item").list();
            session.getTransaction().commit();
            return result;
        }
    }

    @Override
    public List<Item> findByName(String key) {
        try(Session session = sf.getCurrentSession()) {
            session.beginTransaction();
            List result = session.createQuery("from ru.job4j.tracker.Item as i where i.name = :n")
                    .setParameter("n", key)
                    .getResultList();
            session.getTransaction().commit();
            return result;
        }
    }

    @Override
    public Item findById(String id) {
        try(Session session = sf.getCurrentSession()) {
            session.beginTransaction();
            Item result = (Item) session.createQuery("from ru.job4j.tracker.Item as i where i.id = :id")
                    .setParameter("id", Integer.parseInt(id))
                    .uniqueResult();
            session.getTransaction().commit();
            return result;
        }
    }

    @Override
    public void close() throws Exception {
        StandardServiceRegistryBuilder.destroy(registry);
    }
}
