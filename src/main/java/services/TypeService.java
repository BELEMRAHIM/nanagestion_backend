package services;


import models.Type;

import java.util.List;

public interface TypeService {
    List<Type> getAllTypes();

    Type getTypeById(long typeId);

    Type createType(Type type);

    Type updateType(long typeId, Type updatedType);

    void deleteType(long typeId);
    // Other method signatures as needed
}

