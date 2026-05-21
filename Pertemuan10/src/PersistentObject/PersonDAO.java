/*
 * File : PersonDAO.java
 * Deskripsi : interface untuk person access object
 */
package PersistentObject;

public interface PersonDAO {
    public void savePerson(Person P) throws Exception;
}
