
package DAL;

/**
 *
 * @author Lenovo
 */

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public abstract class EntityManClass {
    EntityManager em = Persistence.createEntityManagerFactory("LabCourseProjectPU").createEntityManager();
}
