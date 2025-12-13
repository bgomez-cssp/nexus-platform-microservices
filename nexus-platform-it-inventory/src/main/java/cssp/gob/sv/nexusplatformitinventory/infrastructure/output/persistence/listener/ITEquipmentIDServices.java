package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.listener;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ITEquipmentIDServices {
    @PersistenceContext
    private EntityManager em;
    private static final Logger log = LoggerFactory.getLogger(ITEquipmentIDServices.class);

    public String generateID(String prefix, String entityName) {
        String jpql = String.format("SELECT e.id FROM %s e ORDER BY e.id DESC", entityName);
        TypedQuery<String> query = em.createQuery(jpql, String.class);
        query.setMaxResults(1);
        String lastId = null;
        try {
            lastId = query.getSingleResult();
        } catch (Exception e) {
            log.error(e.getMessage());
        }

        if (lastId == null) {
            return prefix + "0001";
        }

        int numero = Integer.parseInt(lastId.substring(prefix.length()));
        numero++;
        return String.format("%s%04d", prefix, numero);
    }
}

