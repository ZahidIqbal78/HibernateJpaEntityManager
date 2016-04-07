import com.zahid.hibernateJpa.dao.SessionManager;
import com.zahid.hibernateJpa.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by Zahid Iqbal Tushar.
 */
public class MainApp {

    public static void main(String[] args){

        EntityManager entityManager = SessionManager.getEntityManager();

        Book book1 = new Book();
        book1.setCode("12345");
        book1.setTitle("Book1 title");
        book1.setPublishingYear("2015");
        book1.setEdition("3rd");
        book1.setIsbn("abcd1234");
        book1.setPhotoRef("xyz.jpg");
        //insert
        entityManager.getTransaction().begin();
        entityManager.persist(book1);
        entityManager.getTransaction().commit();
        entityManager.close();

        Book book2 = new Book();
        book2.setCode("67890");
        book2.setTitle("Book2 title");
        book2.setPublishingYear("2014");
        book2.setEdition("2rd");
        book2.setIsbn("abcd67890");
        book2.setPhotoRef("mno.jpg");
        //insert
        entityManager.getTransaction().begin();
        entityManager.persist(book2);
        entityManager.getTransaction().commit();
        entityManager.close();

        Book bookToChange = entityManager.find(Book.class, 1);
        entityManager.getTransaction().begin();
        bookToChange.setTitle("Book2 changed title");
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
