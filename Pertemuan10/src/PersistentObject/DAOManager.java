/**
 * File : DAOManager.java
 * Deskripsi : pengelola DAO dalam program
 * Pembuat : Muhammad Rofad Hamdani/24060124130117
 * Tanggal : 14 Mei 2026
 */

package PersistentObject;

public class DAOManager{
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}