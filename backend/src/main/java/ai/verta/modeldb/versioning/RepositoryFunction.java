package ai.verta.modeldb.versioning;

import ai.verta.modeldb.common.exceptions.ModelDBException;
import ai.verta.modeldb.entities.versioning.RepositoryEntity;
import org.hibernate.Session;

public interface RepositoryFunction {
  RepositoryEntity apply(Session session) throws ModelDBException;
}
