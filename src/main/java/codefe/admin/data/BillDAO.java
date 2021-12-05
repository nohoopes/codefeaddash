package codefe.admin.data;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import codefe.admin.model.Bill;

public class BillDAO {
	
    /**
     * Get Product By Id
     * @param id
     * @return
     */
    public Bill getBill(int id) {

        Transaction transaction = null;
        Bill product = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            product = session.get(Bill.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return product;
    }

    /**
     * Get all products
     * @return
     */
    @SuppressWarnings("unchecked")
    public List<Bill> listAllBill() {
        try {
        	return HibernateUtil.getSessionFactory().openSession().createQuery("From Bill").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
    }
    
}